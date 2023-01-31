package com.doctorapp.dao;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDetails;

@Component
public class DoctorDtoImpl implements IDoctorDto {
	@Autowired
	DoctorDetails doctorDetails;
	@Override
	public Doctor findById(int doctorId) {
		// TODO Auto-generated method stub
		return doctorDetails.getDoctors()
				.stream()
				.filter(doc->doc.getDoctorId()==doctorId)
				.findFirst()
				.orElseThrow(()->new IdNotFoundException());
	}

	@Override
	public List<Doctor> findAllDoctors() {
		// TODO Auto-generated method stub
		return doctorDetails.getDoctors();
	}

	@Override
	public List<Doctor> findBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return doctorDetails.getDoctors()
				.stream()
				.filter(doctor->doctor.getSpeciality().equalsIgnoreCase(speciality))
				.collect(Collectors.toList());
	}

	@Override
	public List<Doctor> findBySpecialityAndFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return doctorDetails.getDoctors()
				.stream()
				.filter(doc->doc.getSpeciality().equalsIgnoreCase(speciality)&&doc.getFees()<=fees)
				.collect(Collectors.toList());
	}

	@Override
	public List<Doctor> findBySpecialityName(String speciality, String name) {
		// TODO Auto-generated method stub
		return doctorDetails.getDoctors()
				.stream()
				.filter(doc->doc.getSpeciality().equalsIgnoreCase(speciality)&&doc.getDoctorName().startsWith(name))
				.collect(Collectors.toList());
	}
	
	


}
