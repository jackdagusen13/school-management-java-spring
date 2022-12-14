package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.ClassRating;

import java.util.List;
import java.util.Optional;

public interface ClassRatingService {
    List<ClassRating> getAllClassRatings();

    ClassRating saveClassRating(ClassRating course);

    Optional<ClassRating> getClassRatingById(Long id);

    ClassRating updateClassRating(ClassRating ClassRating);

    void deleteClassRatingById(Long id);

}
