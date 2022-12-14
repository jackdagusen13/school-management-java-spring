package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.Classroom;

import java.util.List;
import java.util.Optional;

public interface ClassroomService {
    List<Classroom> getAllClassrooms();

    Classroom saveClassroom(Classroom course);

    Optional<Classroom> getClassroomById(Long id);

    Classroom updateClassroom(Classroom Classroom);

    void deleteClassroomById(Long id);

}
