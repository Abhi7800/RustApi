package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService; 
	
	@GetMapping("/homes")
	public String home() {
		return "Welcome To Dharya";
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourse(){
		return this.courseService.getCourse();
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourses(@PathVariable String courseId) {
		return this.courseService.getCourses(Long.parseLong(courseId));
	}
	
	@PostMapping("/courses")
	public Courses addCourse(@RequestBody Courses courses) {
		return this.courseService.addCourse(courses);
	}

}
