package sbbProject1.sbb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbbProject1.sbb.domain.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}

