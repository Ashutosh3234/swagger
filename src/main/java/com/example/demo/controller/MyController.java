package com.example.demo.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;


@RestController()
@RequestMapping("/api")// representational state transfer data are send in json
public class MyController {

	@Autowired   //DI ke according service class ka object laa ke isme inject kr dega loose coupling krega
	private CourseService cs;
	@GetMapping("/home")
	public String home()
	{
		return "this is home page";
	}
	
	// get courses 
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.cs.getCourses();
	}
	
	@GetMapping("/courses/{courseID}")
	public Courses getCourse(@PathVariable String courseID)
	{
		return this.cs.getCourse(Long.parseLong(courseID));
	}
	
	@PostMapping(path= "/courses", consumes = "application/json")
	public Courses addCourse(@RequestBody Courses c)
	{
		return this.cs.addCourse(c);
	}
	
	@PutMapping("/courses")
	public Courses updateCourse(@RequestBody Courses c)
	{
		return this.cs.updateCourse(c);
	}
	@DeleteMapping("/courses/{id}")
	public String deleteCourse(@PathVariable String id)
	{
		return this.cs.deleteCourse(Long.parseLong(id));
	}
}
