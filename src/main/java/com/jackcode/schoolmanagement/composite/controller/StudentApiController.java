package com.jackcode.schoolmanagement.composite.controller;


import com.jackcode.schoolmanagement.entity.Student;
import com.jackcode.schoolmanagement.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class StudentApiController {

    private final StudentService studentService;

    public StudentApiController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/api/v1/students")
    List<Student> listStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/api/v1/student")
    Student createStudent(@Validated @RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/api/v1/student")
    @ResponseBody
    ResponseEntity<Object> getStudentById(@RequestParam(name = "id") Long id) {
        Student student;
        try {
            student = studentService.getStudentById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Object>(student, HttpStatus.OK);
    }
}