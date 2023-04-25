package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Courses;

public interface CourseService {
	
	public List<Courses> getCourse();
	
	public Courses getCourses(long id);
	
	public Courses addCourse(Courses courses);

}
