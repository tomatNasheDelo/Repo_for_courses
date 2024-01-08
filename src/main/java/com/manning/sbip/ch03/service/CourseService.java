package com.manning.sbip.ch03.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manning.sbip.ch03.model.Course;
import com.manning.sbip.ch03.repository.CourseRepository;



@Service
//@Transactional
public class CourseService {
	
	 private final CourseRepository courseRepository;

	    public CourseService(CourseRepository courseRepository) {

	        this.courseRepository = courseRepository;
	    }
	
	public void insertCourse() {

        Course kurs = new Course();
        kurs.setName("Alicia ");
        kurs.setCategory("comedy");
        kurs.setDescription("Anthology");
        kurs.setRating(5);
        
        Course kurs2 = new Course();
        kurs2.setName("Govard ");
        kurs2.setCategory("fantastic");
        kurs2.setDescription("Logic");
        kurs2.setRating(4);

        courseRepository.save(kurs);
        courseRepository.save(kurs2);
    }
	
	public void udalitPoId(long id) {
		
		
	
		 courseRepository.deleteById(id);
		
	}
	
	public boolean  naitiPoId(long id) {
		
		
		
		return courseRepository.existsById(id);
		 
		 
		  
	}
	
       public void  vernutVse() {
		
		
    	   Iterable<Course> products = courseRepository.findAll();
           products.forEach((p) -> {
               System.out.println(p.getName());
           });
		 	 
		  
	}
       
       public List<Course> getAllStudents() {
   		List<Course> courseResponse = (List<Course>) courseRepository.findAll();
   		return courseResponse;
   	}
       
        public void vernutPoId(Iterable<Long> id) {
        List<Course> employees = (List<Course>) courseRepository.findAllById(id);

         employees.forEach((employee) -> {
           System.out.println(employee.getId());
       });
        }
}
	
	
	
	
	
	
	
	
	
	
	


