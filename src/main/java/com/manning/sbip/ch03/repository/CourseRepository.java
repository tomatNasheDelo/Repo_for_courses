package com.manning.sbip.ch03.repository;

import com.manning.sbip.ch03.model.Course;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
@Transactional
public interface CourseRepository extends CrudRepository<Course, Long> {
}
