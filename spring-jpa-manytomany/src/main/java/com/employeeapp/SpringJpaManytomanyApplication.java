package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Category;
import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.model.Mode;
import com.employeeapp.service.ICourseService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringJpaManytomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaManytomanyApplication.class, args);
	}
	
	IEmployeeService employeeService;
	/**
	 * @param employeeService the employeeService to set
	 */
	@Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	ICourseService courseService;
	/**
	 * @param courseService the courseService to set
	 */
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Course course1=new Course("Java",Category.BACKEND,Mode.ONLINE);
		Course course2=new Course("Html",Category.FRONTEND,Mode.ONLINE);
		Course course3=new Course("CSS",Category.FRONTEND,Mode.OFFLINE);
		Set<Course> courses=new HashSet<>(Arrays.asList(course1,course2));
		Employee employee=new Employee("Baba","EEE","Hyderabad",courses);
		
		employeeService.addEmployee(employee);
		
		
		
	}

}
