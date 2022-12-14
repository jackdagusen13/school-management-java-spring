package com.jackcode.schoolmanagement.service.impl;

import com.jackcode.schoolmanagement.entity.ClassRating;
import com.jackcode.schoolmanagement.repository.ClassRatingRepository;
import com.jackcode.schoolmanagement.service.ClassRatingService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClassRatingServiceImpl implements ClassRatingService {

    private ClassRatingRepository classRatingRepository;

    public ClassRatingServiceImpl(ClassRatingRepository classRatingRepository) {
        this.classRatingRepository = classRatingRepository;
    }

    @Override
    public List<ClassRating> getAllClassRatings() {
        return classRatingRepository.findAll();
    }

    @Override
    public ClassRating saveClassRating(ClassRating classRating) {
        return classRatingRepository.save(classRating);
    }

    @Override
    public Optional<ClassRating> getClassRatingById(Long id) {
        return classRatingRepository.findById(id);
    }

    @Override
    public ClassRating updateClassRating(ClassRating classRating) {
        return classRatingRepository.save(classRating);
    }

    @Override
    public void deleteClassRatingById(Long id) {
        classRatingRepository.deleteById(id);
    }
}
