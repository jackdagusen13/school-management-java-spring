package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.ClassRating;

import java.util.List;

public interface ClassRatingService {
    List<ClassRating> getAllClassRatings();

    ClassRating saveClassRating(ClassRating course);

    ClassRating getClassRatingById(Long id);

    ClassRating updateClassRating(ClassRating ClassRating);

    void deleteClassRatingById(Long id);

}
