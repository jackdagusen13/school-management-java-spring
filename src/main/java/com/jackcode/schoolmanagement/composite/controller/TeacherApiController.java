package com.jackcode.schoolmanagement.composite.controller;


import com.jackcode.schoolmanagement.entity.Teacher;
import com.jackcode.schoolmanagement.service.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class TeacherApiController {

    private final TeacherService teacherService;

    public TeacherApiController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/api/v1/teachers")
    List<Teacher> listTeachers() {
        return teacherService.getAllTeachers();
    }

    @PostMapping("/api/v1/teacher")
    Teacher createTeacher(@Validated @RequestBody Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @GetMapping("/api/v1/teacher")
    @ResponseBody
    ResponseEntity<Object> getStudentById(@RequestParam(name = "id") Long id) {
        Teacher teacher;
        try {
            teacher = teacherService.getTeacherById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Object>(teacher, HttpStatus.OK);
    }
}