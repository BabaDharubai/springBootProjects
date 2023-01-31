package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IAddressService;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringJpaOnetoonebiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaOnetoonebiApplication.class, args);
	}

	IStudentService studentService;
	/**
	 * @param studentService the studentService to set
	 */
	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
	
	IAddressService addressService;
	
	/**
	 * @param addressService the addressService to set
	 */
	@Autowired
	public void setAddressService(IAddressService addressService) {
		this.addressService = addressService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Address address=new Address("B2/199","MainRoad","Proddatur","AP");
//		Student student=new Student("Baba","EEE","babadharubai542@gmail.com",address);
//		studentService.addStudent(student);
		
		addressService.getByName("Baba").forEach(System.out::println);
		addressService.getByDepartment("EEE").forEach(System.out::println);
		addressService.getByCity("Proddatur").forEach(System.out::println);
		System.out.println(addressService.getByStudentId(10));
		addressService.getByNameAndCity("Baba", "Proddatur").forEach(System.out::println);
		addressService.getByNameAndStreetname("Baba", "MainRoad").forEach(System.out::println);
		
	}

}
