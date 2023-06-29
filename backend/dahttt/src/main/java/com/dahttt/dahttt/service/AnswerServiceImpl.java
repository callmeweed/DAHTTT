package com.dahttt.dahttt.service;

import com.dahttt.dahttt.entity.Answer;
import com.dahttt.dahttt.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService{
    @Autowired
    AnswerRepository answerRepo;
    @Override
    public void save(Answer answer) {
        answerRepo.save(answer);
    }

    @Override
    public List<Answer> getAllAnswerByQuestionId(int questionId) {
        return answerRepo.findAllByQuestionId(questionId);
    }

    @Override
    public Page<Answer> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Answer> getAll() {
        return null;
    }

    @Override
    public Optional<Answer> findById(Integer id) {
        return Optional.empty();
    }
}
