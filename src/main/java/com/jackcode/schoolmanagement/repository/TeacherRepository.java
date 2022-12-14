package com.jackcode.schoolmanagement.repository;

import com.jackcode.schoolmanagement.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
