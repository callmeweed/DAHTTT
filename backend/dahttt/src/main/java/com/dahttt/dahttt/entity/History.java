package com.dahttt.dahttt.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "history_id")
    @JsonIgnore
    private int id;

    @NotEmpty(message = "The user id  is required")
    @Column(name = "user_id")
    private int userId;

    @NotEmpty(message = "The exam id  is required")
    @Column(name = "exam_id")
    private int examId;

    @NotEmpty(message = "The marks is required")
    @Column(name = "marks")
    private float marks;

    @NotNull(message = "The time is required.")
    @Past(message = "The time must be in the past.")
    @Column(name = "time")
    private Date time;


}
