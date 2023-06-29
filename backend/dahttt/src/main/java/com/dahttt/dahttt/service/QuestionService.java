package com.dahttt.dahttt.service;

import com.dahttt.dahttt.entity.Question;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface QuestionService extends TableDBService<Question>{
    void save(Question question);

    List<Question> findAllQuestionExam(int examId);
}
