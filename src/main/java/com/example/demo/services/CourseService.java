package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
@Service
public interface CourseService {
	
     public List<Courses> getCourses();
     public Courses getCourse(long id);
     public Courses addCourse(Courses c);
     public Courses updateCourse(Courses c);
     public String deleteCourse(long id);
}
