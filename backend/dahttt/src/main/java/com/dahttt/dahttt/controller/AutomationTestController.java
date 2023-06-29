package com.dahttt.dahttt.controller;

import com.google.gson.Gson;
import com.dahttt.dahttt.constant.ApiStatus;
import com.dahttt.dahttt.constant.MessageCode;
import com.dahttt.dahttt.entity.Answer;
import com.dahttt.dahttt.entity.Exam;
import com.dahttt.dahttt.entity.Question;
import com.dahttt.dahttt.http.response.GetExamResponse;
import com.dahttt.dahttt.http.response.Response;
import com.dahttt.dahttt.service.AnswerService;
import com.dahttt.dahttt.service.ExamService;
import com.dahttt.dahttt.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/test",produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin("*")
public class AutomationTestController {
    @Autowired
    ExamService examService;
    @Autowired
    QuestionService questionService;
    @Autowired
    AnswerService answerService;
    @Autowired
    Gson gson;
    @GetMapping("/list")
    public ResponseEntity<?> getAllTest() {
        List<Exam> data = examService.getAll();
        return ResponseEntity.ok(gson.toJson(new Response(ApiStatus.SUCCESS, MessageCode.SUCCESS, data)));
    }
    @PostMapping("/exam")
    public ResponseEntity<?> getAnExam(@RequestParam int id) {
        List<Question> questions =  questionService.findAllQuestionExam(id);
        if (questions.size() > 0) {
            GetExamResponse response = new GetExamResponse();
            for (Question q: questions) {
                List<Answer> answers = answerService.getAllAnswerByQuestionId(q.getQuestionId());
                response.pushAnswer(answers);
            }
            response.setListQuestion(questions);
            return ResponseEntity.ok(gson.toJson(new Response(ApiStatus.SUCCESS, MessageCode.SUCCESS, response)));
        }
        else {
            return ResponseEntity.ok(gson.toJson(new Response(ApiStatus.NOT_FOUND, MessageCode.NOT_FOUND)));
        }
    }
}
