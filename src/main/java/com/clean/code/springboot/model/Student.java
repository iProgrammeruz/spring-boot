package com.clean.code.springboot.model;

public class Student {
    private Long id;
    private String name;
    private String lastname;
    private String course;

    public Student(Long id, String name, String lastname, String course) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.course = course;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCource() {
        return course;
    }

    public void setCource(String cource) {
        this.course = cource;
    }
}
