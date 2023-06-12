package sbbProject1.sbb.repository;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import sbbProject1.sbb.domain.Question;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AnswerRepositoryTest {
    @Autowired
    private QuestionRepository questionRepository;

    @Test
    void testJpa() {
        Question q1 = new Question();
        q1.setSubject("sbb?");
        q1.setContent("sbb2222");
        q1.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q1);

        Question q2 = new Question();
        q2.setSubject("sbb?");
        q2.setContent("sbb2222");
        q2.setCreateDate(LocalDateTime.now());
        this.questionRepository.save(q2);

        List<Question> all = questionRepository.findAll();
        Assertions.assertThat(2).isEqualTo(all.size());

        List<Question> qList = questionRepository.findBySubjectLike("sbb%");

    }

}