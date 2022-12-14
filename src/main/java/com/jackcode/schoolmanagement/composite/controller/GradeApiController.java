package com.jackcode.schoolmanagement.composite.controller;


import com.jackcode.schoolmanagement.entity.Grade;
import com.jackcode.schoolmanagement.service.GradeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class GradeApiController {

    private final GradeService gradeService;

    public GradeApiController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @GetMapping("/api/v1/grades")
    List<Grade> listGrades() {
        return gradeService.getAllGrades();
    }

    @PostMapping("/api/v1/grade")
    Grade createGrade(@Validated @RequestBody Grade grade) {
        return gradeService.saveGrade(grade);
    }

    @GetMapping("/api/v1/grade")
    ResponseEntity<Object> getGradeById(@RequestParam(value = "id") Long id) {
        Grade grade;
        try {
            grade = gradeService.getGradeById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Object>(gradeService.getGradeById(id), HttpStatus.OK);
    }
}