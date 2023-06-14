package sbbProject1.sbb.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sbbProject1.sbb.domain.Question;
import sbbProject1.sbb.repository.QuestionRepository;
import sbbProject1.sbb.service.QuestionService;

import java.util.List;

@Controller
@Slf4j
@RequiredArgsConstructor
public class QuestionController {
    private final QuestionService questionService;

    @GetMapping("/question/list")
    public String list(Model model) {
        List<Question> questions = questionService.getList();
        model.addAttribute("questionList", questions);
        return "question-list";
    }


}
