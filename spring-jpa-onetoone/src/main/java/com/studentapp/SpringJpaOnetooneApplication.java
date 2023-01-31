package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringJpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOnetooneApplication.class, args);
	}
	
	IStudentService studentService;

	/**
	 * @param studentService the studentService to set
	 */
	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		Address address=new Address("Proddatur","AP");
//		Student student=new Student("Pavan","ECE","pavan@gmail.com",address);
//		studentService.addStudent(student);
//		
		studentService.getByCity("proddatur").forEach(System.out::println);
		System.out.println();
		studentService.getByCityAndDepartment("Proddatur", "ECE").forEach(System.out::println);
		System.out.println();
		studentService.getByCityState("Proddatur", "Ap").forEach(System.out::println);
		System.out.println();
		studentService.getAll().forEach(System.out::println);
		System.out.println();
		studentService.getByDepartment("EEE").forEach(System.out::println);
		System.out.println();
		System.out.println(studentService.getById(11));
		System.out.println();
		Student student=studentService.getById(11);
		student.setName("Bhargav");
		//studentService.addStudent(student);
	}

}
