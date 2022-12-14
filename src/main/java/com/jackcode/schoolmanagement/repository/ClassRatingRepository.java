package com.jackcode.schoolmanagement.repository;

import com.jackcode.schoolmanagement.entity.ClassRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRatingRepository extends JpaRepository<ClassRating, Long> {
}
