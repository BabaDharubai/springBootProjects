/**
 * 
 */
package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Casesheet;
import com.doctorapp.model.Doctor;
import com.doctorapp.repository.IDoctorRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class DoctorServiceImpl implements IDoctorService{

	
	private IDoctorRepository doctorRepository;
	
	/**
	 * @param doctorRepository the doctorRepository to set
	 */
	@Autowired
	public void setDoctorRepository(IDoctorRepository doctorRepository) {
		this.doctorRepository = doctorRepository;
	}

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.save(doctor);
	}

	@Override
	public void updateDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorRepository.save(doctor);
	}

	@Override
	public Doctor getById(int doctorId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorId).get();
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		doctorRepository.deleteById(doctorId);
	}

	@Override
	public List<Doctor> getAll() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public List<Doctor> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndCity(String speciality, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndHospital(String speciality, String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor getByCaseSheet(Casesheet casesheet) {
		// TODO Auto-generated method stub
		return null;
	}

}
