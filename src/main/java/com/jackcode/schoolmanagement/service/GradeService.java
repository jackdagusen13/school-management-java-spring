package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.Grade;

import java.util.List;

public interface GradeService {

    List<Grade> getAllGrades();

    Grade saveGrade(Grade Grade);

    Grade getGradeById(Long id);

    Grade updateGrade(Grade Grade);

    void deleteGradeById(Long id);
}

