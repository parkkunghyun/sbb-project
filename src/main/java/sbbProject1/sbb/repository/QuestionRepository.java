package sbbProject1.sbb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbbProject1.sbb.domain.Question;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Question findBySubject(String subject);
    List<Question> findBySubjectLike(String subject);
    Question findBySubjectAndContent(String subject, String content);
}
