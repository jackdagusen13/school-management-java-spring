package com.jackcode.schoolmanagement.repository;

import com.jackcode.schoolmanagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>{
}
