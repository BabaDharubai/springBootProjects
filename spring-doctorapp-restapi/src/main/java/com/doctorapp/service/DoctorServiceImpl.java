/**
 * 
 */
package com.doctorapp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.doctorapp.model.Doctor;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class DoctorServiceImpl implements IDoctorService{

	@Override
	public List<Doctor> getAll() {
		// TODO Auto-generated method stub
		return showDoctors();
	}

	@Override
	public List<String> getAllNames() {
		// TODO Auto-generated method stub
		return showDoctors().stream()
				.map(doctor->doctor.getName())
				.collect(Collectors.toList());
	}

	@Override
	public double getTotalSalary() {
		// TODO Auto-generated method stub
		return showDoctors().stream()
				.mapToDouble(doctor->doctor.getSalary())
				.sum();
	}

	@Override
	public double getAvgAge() {
		// TODO Auto-generated method stub
		return showDoctors().stream()
				.mapToInt(doctor->doctor.getAge())
				.sum()/showDoctors().stream().count();
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return showDoctors().stream()
				.filter(doctor->doctor.getSpeciality().equalsIgnoreCase(speciality))
				.collect(Collectors.toList());
	}
	
	private List<Doctor> showDoctors() {
		return Arrays.asList(
				new Doctor("Baba",10000,"cardio",22),
				new Doctor("Harish",25000,"neuro",25),
				new Doctor("Pavan",30000,"physician",23));
		
	}

}
