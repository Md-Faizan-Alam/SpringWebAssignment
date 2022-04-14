package com.assignment.MVC.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.assignment.MVC.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{
}
