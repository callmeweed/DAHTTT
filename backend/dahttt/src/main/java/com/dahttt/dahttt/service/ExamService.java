package com.dahttt.dahttt.service;

import com.dahttt.dahttt.entity.Exam;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ExamService extends TableDBService<Exam>{
    @Override
    List<Exam> getAll();

    void save(Exam exam);
}
