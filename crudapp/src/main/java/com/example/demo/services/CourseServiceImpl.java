package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

import com.example.demo.entities.Courses;


@Service
public class CourseServiceImpl implements CourseService {

	List<Courses>list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		list.add(new Courses( 145,"Core Java","Basic java and advance java"));
		list.add(new Courses( 146,"Pyhton","Basic python and advance java"));
		list.add(new Courses( 147,"Web Development","Basic Web developement and advance java"));
		
	}
	
	@Override
	public List<Courses> getCourse() {
		// TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Courses getCourses(long courseId) {
		Courses c = null;
		for(Courses courses : list) {
			if(courses.getId()== courseId) {
				c = courses;
				break;
			}
		}
		return c;
	}
	
	@Override
	public Courses addCourse(Courses courses) {
		list.add(courses);
		return courses;
	}

}
