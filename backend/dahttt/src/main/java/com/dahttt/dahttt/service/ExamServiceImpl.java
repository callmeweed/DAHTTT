package com.dahttt.dahttt.service;

import com.dahttt.dahttt.entity.Exam;
import com.dahttt.dahttt.repository.ExamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamServiceImpl implements ExamService {
    @Autowired
    ExamRepository examRepo;

    @Override
    public void save(Exam exam) {
        examRepo.save(exam);
    }

    @Override
    public Page<Exam> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Exam> getAll() {
        return examRepo.findAll();
    }

    @Override
    public Optional<Exam> findById(Integer id) {
        return Optional.empty();
    }
}
