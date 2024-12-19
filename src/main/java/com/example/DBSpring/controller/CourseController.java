package com.example.DBSpring.controller;

import com.example.DBSpring.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @GetMapping("/getCourse")
    public Courses getCourse(){
        return new Courses(1,"java");
    }


}
