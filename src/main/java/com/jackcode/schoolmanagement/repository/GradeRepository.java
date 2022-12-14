package com.jackcode.schoolmanagement.repository;

import com.jackcode.schoolmanagement.entity.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}
