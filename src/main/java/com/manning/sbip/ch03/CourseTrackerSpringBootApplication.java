package com.manning.sbip.ch03;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.manning.sbip.ch03.service.CourseService;

@SpringBootApplication
public class CourseTrackerSpringBootApplication {
	
	 private final CourseService courseService;

	    public CourseTrackerSpringBootApplication (CourseService courseService) {
	        this.courseService = courseService;
	    }  

   public static void main(String[] args) {
        SpringApplication.run(CourseTrackerSpringBootApplication.class, args);
    }
   
   @Bean
   public ApplicationRunner init() {
	 //   long id1 = 1;
	//   List<Long> ids = Arrays.asList(4L, 2L, 3L);
       return args -> {
    	    // long id1 = 5; 
    	  //    boolean bul = courseService.naitiPoId(id1);
    	   
                System.out.println("\nInsert course  2   ...");
                courseService.insertCourse();
           
//               System.out.println("\nUdalit po ID n1  (1)   ...");
//           
//              courseService.udalitPoId(id1);
              
           //   System.out.println("\n naiti po ID n1  (1)   ...");
           //   System.out.println(courseService.naitiPoId(id1));
              
    	      //System.out.println("vernutvseh_____________");
              //courseService.vernutVse();
              
              //System.out.println("getAll_____________");
              //System.out.println(courseService.getAllStudents());
//    	     System.out.println("vernut_po_id_____________");
//    	     courseService.vernutPoId(ids);
//            
              
       };

}
}