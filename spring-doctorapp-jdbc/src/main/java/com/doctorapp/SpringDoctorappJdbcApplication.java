package com.doctorapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.doctorapp.model.Specialization;
import com.doctorapp.service.IDoctorService;

@SpringBootApplication
public class SpringDoctorappJdbcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDoctorappJdbcApplication.class, args);
	}
	@Autowired
	IDoctorService doctorService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		doctorService.addDoctor(new Doctor("Baba",Specialization.CARDIO.type,500.0,5,LocalDateTime.of(LocalDate.parse("2022-10-10"), LocalTime.parse("10:45:15")),LocalDateTime.of(LocalDate.parse("2022-10-10"), LocalTime.parse("23:45:15"))));
//		doctorService.updateDoctor(5, 1000);
//		doctorService.deleteDoctor(5);
		
		doctorService.getAllDoctors().forEach(System.out::println);
		System.out.println();
		System.out.println(doctorService.getById(6));
		System.out.println();
		doctorService.getBySpeciality(Specialization.CARDIO.type).forEach(System.out::println);
		System.out.println();
		doctorService.getBySpecialityAndExp(Specialization.PHYSICIAN.type, 5).forEach(System.out::println);
		System.out.println();
		doctorService.getBySpecialityAndFees(Specialization.CARDIO.type, 1500).forEach(System.out::println);
		System.out.println();
		doctorService.getByAvailable(LocalDateTime.of(2022, 10, 10, 9, 10)).forEach(System.out::println);
		
	}

}
