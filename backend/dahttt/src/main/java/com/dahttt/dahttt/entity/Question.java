package com.dahttt.dahttt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    @JsonIgnore
    private int questionId;

    @NotEmpty(message = "Exam id is required")
    @Column(name = "exam_id")
    private int examId;

    @Column(name = "question_number")
    private int questionNumber;

    @NotEmpty(message = "Question content is required")
    @Column(name = "content")
    private String content;

    @Column(name = "true_answer")
    private String trueAnswer;

    public int getQuestionId() {
        return questionId;
    }

    public int getExamId() {
        return examId;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public String getContent() {
        return content;
    }

    public String getTrueAnswer() {
        return trueAnswer;
    }
}
