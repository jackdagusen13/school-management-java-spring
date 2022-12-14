package com.jackcode.schoolmanagement.service.impl;


import com.jackcode.schoolmanagement.entity.Grade;
import com.jackcode.schoolmanagement.repository.GradeRepository;
import com.jackcode.schoolmanagement.service.GradeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradeServiceImpl implements GradeService {

    private GradeRepository gradeRepository;

    public GradeServiceImpl(com.jackcode.schoolmanagement.repository.GradeRepository gradeRepository) {
        super();
        this.gradeRepository = gradeRepository;
    }

    @Override
    public List<Grade> getAllGrades() {
        return gradeRepository.findAll();
    }

    @Override
    public Grade saveGrade(Grade Grade) {
        return gradeRepository.save(Grade);
    }

    @Override
    public Grade getGradeById(Long id) {
        return gradeRepository.findById(id).get();
    }

    @Override
    public Grade updateGrade(Grade Grade) {
        return gradeRepository.save(Grade);
    }

    @Override
    public void deleteGradeById(Long id) {
        gradeRepository.deleteById(id);
    }
}