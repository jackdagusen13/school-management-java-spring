package com.jackcode.schoolmanagement.composite;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class  ClassRatingKey implements Serializable {

    @Column(name = "student_id")
    Long studentId;

    @Column(name = "classroom_id")
    Long classroomId;

    public ClassRatingKey() {
    }

    public ClassRatingKey(Long studentId, Long classroomId) {
        this.studentId = studentId;
        this.classroomId = classroomId;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClassRatingKey that = (ClassRatingKey) o;
        return Objects.equals(studentId, that.studentId) && Objects.equals(classroomId, that.classroomId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, classroomId);
    }
}