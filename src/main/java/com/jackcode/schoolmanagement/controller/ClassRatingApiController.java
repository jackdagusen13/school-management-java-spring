package com.jackcode.schoolmanagement.controller;


import com.jackcode.schoolmanagement.entity.ClassRating;
import com.jackcode.schoolmanagement.service.ClassRatingService;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class ClassRatingApiController {

    private final ClassRatingService classRatingService;

    public ClassRatingApiController(ClassRatingService classRatingService) {
        this.classRatingService = classRatingService;
    }

    @GetMapping("/api/v1/class-ratings")
    List<ClassRating> listClassRatings() {
        return classRatingService.getAllClassRatings();
    }

    @PostMapping("/api/v1/class-rating")
    ClassRating createClassRating(@Validated @RequestBody ClassRating classRating) {
        return classRatingService.saveClassRating(classRating);
    }

    @GetMapping("/api/v1/class-rating")
    ClassRating getClassRatingById(@RequestParam(value = "id") Long id) {

        return classRatingService.getClassRatingById(id)
                .orElseThrow(() -> new ResourceNotFoundException("ClassRating not found with id " + id));
    }
}