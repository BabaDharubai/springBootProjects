/**
 * 
 */
package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Hospital;
import com.doctorapp.repository.IHospitalRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class HospitalServiceImpl implements IHospitalService{

	
	IHospitalRepository hospitalRepository;
	
	/**
	 * @param hospitalRepository the hospitalRepository to set
	 */
	@Autowired
	public void setHospitalRepository(IHospitalRepository hospitalRepository) {
		this.hospitalRepository = hospitalRepository;
	}

	@Override
	public void addHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalRepository.save(hospital);
	}

	@Override
	public void updateHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		hospitalRepository.save(hospital);
	}

	@Override
	public Hospital getById(int hospitalId) {
		// TODO Auto-generated method stub
		return hospitalRepository.findById(hospitalId).get();
	}

	@Override
	public void deleteHospital(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Hospital> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndCity(String speciality, String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getByDoctor(String doctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getBySpecialityAndDoctor(String speciality, String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hospital> getByHospital(String hospitalName) {
		// TODO Auto-generated method stub
		return null;
	}

}
