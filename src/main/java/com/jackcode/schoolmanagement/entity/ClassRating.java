package com.jackcode.schoolmanagement.entity;

import com.jackcode.schoolmanagement.composite.ClassRatingKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "classRatings")
public class ClassRating {

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "ClassRating{" +
                "student=" + student +
                ", classroom=" + classroom +
                ", rating=" + rating +
                '}';
    }
}