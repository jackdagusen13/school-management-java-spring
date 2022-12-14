package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.Course;

import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();

    Course saveCourse(Course course);

    Course getCourseById(Long id);

    Course updateCourse(Course Course);

    void deleteCourseById(Long id);

}
