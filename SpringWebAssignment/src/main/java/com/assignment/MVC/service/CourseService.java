package com.assignment.MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.MVC.model.Course;
import com.assignment.MVC.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repository;
	
	public List<Course> getCourseList(){
		return (List<Course>)repository.findAll();
	}
}
