package com.jackcode.schoolmanagement.service;

import com.jackcode.schoolmanagement.entity.Classroom;

import java.util.List;

public interface ClassroomService {
    List<Classroom> getAllClassrooms();

    Classroom saveClassroom(Classroom course);

    Classroom getClassroomById(Long id);

    Classroom updateClassroom(Classroom Classroom);

    void deleteClassroomById(Long id);

}
