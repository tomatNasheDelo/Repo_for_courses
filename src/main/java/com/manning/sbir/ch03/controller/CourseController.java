package com.manning.sbir.ch03.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manning.sbip.ch03.model.Course;
import com.manning.sbip.ch03.repository.CourseRepository;

@RestController
@RequestMapping("/courses")
class CourseController {
	private final CourseRepository courseRepository;

	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping
	Iterable<Course> getCoffees() {
		return courseRepository.findAll();
	}
	
	@GetMapping
	 public List<Course> getAllStudents() {
	   		List<Course> courseResponse = (List<Course>) courseRepository.findAll();
	   		return courseResponse;
	   	}
	
	@GetMapping("/{id}")
	Optional<Course> getCourseById(@PathVariable long id) {
		return courseRepository.findById(id);
	}
}
