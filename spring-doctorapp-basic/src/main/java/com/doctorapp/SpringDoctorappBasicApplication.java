package com.doctorapp;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Specialization;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappBasicApplication.class, args);
	}
	@Autowired
	IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		doctorService.getAllDoctors().forEach(System.out::println);
		System.out.println();
		System.out.println(doctorService.getById(1));
		System.out.println();
		doctorService.getBySpeciality(Specialization.CARDIO.type).forEach(System.out::println);
		System.out.println();
		doctorService.getBySpecialityAndFees(Specialization.PHYSICIAN.type, 2000).forEach(System.out::println);
		System.out.println();
		doctorService.getBySpecialityName(Specialization.CARDIO.type, "sa").forEach(System.out::println);
		
		
	}

}
