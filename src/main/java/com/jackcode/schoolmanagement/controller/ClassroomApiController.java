package com.jackcode.schoolmanagement.controller;


import com.jackcode.schoolmanagement.entity.Classroom;
import com.jackcode.schoolmanagement.service.ClassroomService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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
        return classroomService.saveClassroom(classroom);
    }

    @GetMapping("/api/v1/classroom")
    Classroom getClassroomById(@RequestParam(value = "id") Long id) {

        return classroomService.getClassroomById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Classroom not found with id " + id));
    }
}