package com.dahttt.dahttt.repository;

import com.dahttt.dahttt.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer > {
    List<Question> findAllByExamId(int examId);
}
