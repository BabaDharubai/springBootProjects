/**
 * 
 */
package com.doctorapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.model.Speciality;
import com.doctorapp.repository.ISpecialityRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class SpecialityServiceImpl implements ISpecialityService{

	ISpecialityRepository specialityRepository;
	
	/**
	 * @param specialRepository the specialRepository to set
	 */
	@Autowired
	public void setSpecialRepository(ISpecialityRepository specialityRepository) {
		this.specialityRepository = specialityRepository;
	}

	@Override
	public void addSpeciality(Speciality speciality) {
		// TODO Auto-generated method stub
		specialityRepository.save(speciality);
	}

	@Override
	public void updateSpeciality(Speciality speciality) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Speciality getById(int specialityId) {
		// TODO Auto-generated method stub
		return specialityRepository.findById(specialityId).get();
	}

	@Override
	public void deleteHospital(int specialityId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Speciality> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Speciality> getByDoctor(String doctorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Speciality> getByHospitalAndDoctor(String hospitalName, String doctorName) {
		// TODO Auto-generated method stub
		return null;
	}

}
