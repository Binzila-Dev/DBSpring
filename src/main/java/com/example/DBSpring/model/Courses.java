package com.example.DBSpring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courses {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    int no;

    String name;

    public Courses() {

    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Courses(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
