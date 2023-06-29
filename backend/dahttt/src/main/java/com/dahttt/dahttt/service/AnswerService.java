package com.dahttt.dahttt.service;

import com.dahttt.dahttt.entity.Answer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AnswerService extends  TableDBService<Answer>{
    void save(Answer answer);

    List<Answer> getAllAnswerByQuestionId(int questionId);
}
