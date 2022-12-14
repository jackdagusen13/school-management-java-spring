package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> getAllTeachers();

    Teacher saveTeacher(Teacher teacher);

    Teacher getTeacherById(Long id);

    Teacher updateTeacher(Teacher student);

    void deleteTeacherById(Long id);


}
