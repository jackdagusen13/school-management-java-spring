package com.jackcode.schoolmanagement.controller;


import com.jackcode.schoolmanagement.entity.Classroom;
import com.jackcode.schoolmanagement.service.ClassroomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ClassroomApiController {

    private final ClassroomService classroomService;

    public ClassroomApiController(ClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    @GetMapping("/api/v1/classrooms")
    List<Classroom> listClassrooms() {
        return classroomService.getAllClassrooms();
    }

    @PostMapping("/api/v1/classroom")
    Classroom createClassroom(@Validated @RequestBody Classroom classroom) {
        System.out.println("TEST " + classroom.getClass());
        return classroomService.saveClassroom(classroom);
    }

    @GetMapping("/api/v1/classroom")
    ResponseEntity<Object> getClassroomById(@RequestParam(value = "id") Long id) {
        Classroom classroom;
        try {
            classroom = classroomService.getClassroomById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Object>(classroomService.getClassroomById(id), HttpStatus.OK);
    }
}