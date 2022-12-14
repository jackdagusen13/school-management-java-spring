package com.jackcode.schoolmanagement.entity;

import com.jackcode.schoolmanagement.composite.ClassRatingKey;
import jakarta.persistence.*;

@Entity
public
class ClassRating {

    @EmbeddedId
    ClassRatingKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("classroomId")
    @JoinColumn(name = "classroom_id")
    Classroom classroom;

    int rating;

    public ClassRating(Student student, Classroom classroom, int rating) {
        this.student = student;
        this.classroom = classroom;
        this.rating = rating;
    }

    public ClassRating() {
    }

}