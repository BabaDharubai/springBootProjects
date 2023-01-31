package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;

public interface IDoctorService {
	
	Doctor getById(int doctorId) throws IdNotFoundException;
	
	List<Doctor> getAllDoctors()throws DoctorNotFoundException;
	List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityAndFees(String speciality,double fees) throws DoctorNotFoundException;
	List<Doctor> getBySpecialityName(String speciality,String name);
	
	
}
