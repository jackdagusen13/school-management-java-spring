package com.jackcode.schoolmanagement.entity;


import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Grade")
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "grade", cascade = CascadeType.ALL)
    private Set<Course> course;

    @OneToMany(mappedBy = "grade", cascade = CascadeType.ALL)
    private Set<Classroom> classroom;

    public Grade() {
    }

    public Grade(String name, Set<Course> course, Set<Classroom> classroom) {
        this.name = name;
        this.course = course;
        this.classroom = classroom;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Grade(String name) {
        this.name = name;
    }
}
