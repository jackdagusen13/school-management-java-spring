package com.jackcode.schoolmanagement.controller;


import com.jackcode.schoolmanagement.entity.Course;
import com.jackcode.schoolmanagement.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class CourseApiController {

    private final CourseService courseService;

    public CourseApiController(CourseService courseService) {
        this.courseService = courseService;

    }

    @GetMapping("/api/v1/courses")
    List<Course> listCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping("/api/v1/course")
    Course createCourse(@Validated @RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping("/api/v1/course")
    ResponseEntity<Object> getCourseById(@RequestParam(value = "id") Long id) {
        Course course;
        try {
            course = courseService.getCourseById(id);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<Object>(courseService.getCourseById(id), HttpStatus.OK);
    }
}