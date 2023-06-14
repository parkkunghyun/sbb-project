package sbbProject1.sbb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sbbProject1.sbb.domain.Question;
import sbbProject1.sbb.repository.QuestionRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionService {
    private QuestionRepository questionRepository;

    // save

    // list
    public List<Question> getList() {
        return questionRepository.findAll();
    }



}
