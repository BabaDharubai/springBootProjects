package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.dao.IDoctorDto;
import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;


/**
 * @author BabaFakruddinDharubai
 *
 */
@Service
public class DoctorServiceImpl implements IDoctorService {
	@Autowired
	IDoctorDto iDoctorDto;
	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return iDoctorDto.findById(doctorId);
	}

	@Override
	public List<Doctor> getAllDoctors() throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList=iDoctorDto.findAllDoctors();
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor not Found");
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList=iDoctorDto.findBySpeciality(speciality);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		List<Doctor> doctorList=iDoctorDto.findBySpecialityAndFees(speciality, fees);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		return doctorList;
	}

	@Override
	public List<Doctor> getBySpecialityName(String speciality, String name) {
		// TODO Auto-generated method stub
		List<Doctor> doctorList=iDoctorDto.findBySpecialityName(speciality, name);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		return doctorList;
	}

	

}

