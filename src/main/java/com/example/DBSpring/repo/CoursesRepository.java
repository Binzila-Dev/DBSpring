package com.example.DBSpring.repo;


import com.example.DBSpring.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursesRepository extends JpaRepository<Courses,Integer> {

}
