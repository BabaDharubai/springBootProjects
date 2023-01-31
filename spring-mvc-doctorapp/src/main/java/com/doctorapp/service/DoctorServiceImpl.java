package com.doctorapp.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doctorapp.dao.IDoctorDao;
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
	IDoctorDao doctorDao;
	List<Doctor> doctorList=new ArrayList<>();
	
	
	/**
	 * @param doctor
	 */
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		doctorDao.addDoctor(doctor);
		
	}

	/**
	 * @param doctorId
	 * @param fees
	 * @return
	 * @throws IdNotFoundException
	 */
	@Override
	public int updateDoctor(int doctorId, double fees) throws IdNotFoundException{
		// TODO Auto-generated method stub
		if(doctorDao.updateDoctor(doctorId, fees)==0)
			throw new IdNotFoundException("Id not Found");
		else
			return 1;
		
	}

	/**
	 * @param doctorId
	 * @return
	 * @throws IdNotFoundException
	 */
	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException{
		// TODO Auto-generated method stub
		Doctor doctor=doctorDao.getById(doctorId);
		//Optional<Doctor> option=Optional.of(doctor);
		if(doctor==null)
			throw new IdNotFoundException("Id Not Found");
		else
			return doctor;
	}

	/**
	 * @param doctorId
	 * @return
	 * @throws IdNotFoundException
	 */
	@Override
	public int deleteDoctor(int doctorId) throws IdNotFoundException{
		// TODO Auto-generated method stub
		if(doctorDao.deleteDoctor(doctorId)==0)
			throw new IdNotFoundException("Id Not Found");
		else
			return 1;
		
	}

	/**
	 * @return
	 * @throws DoctorNotFoundException
	 */
	@Override
	public List<Doctor> getAllDoctors() throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		doctorList=doctorDao.getAllDoctors();
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor List is Empty");
		else
			return doctorList;
	}

	/**
	 * @param speciality
	 * @return
	 * @throws DoctorNotFoundException
	 */
	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException{
		// TODO Auto-generated method stub
		doctorList=doctorDao.getBySpeciality(speciality);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		else {
			return doctorList;
		}
		
	}

	/**
	 * @param speciality
	 * @param experience
	 * @return
	 * @throws DoctorNotFoundException
	 */
	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException{
		// TODO Auto-generated method stub
		doctorList=doctorDao.getBySpecialityAndExp(speciality, experience);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		else {
			return doctorList;
		}
	}

	/**
	 * @param speciality
	 * @param fees
	 * @return
	 * @throws DoctorNotFoundException
	 */
	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) throws DoctorNotFoundException{
		// TODO Auto-generated method stub
		doctorList=doctorDao.getBySpecialityAndFees(speciality, fees);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		else {
			return doctorList;
		}
	}

	/**
	 * @param startTime
	 * @return
	 * @throws DoctorNotFoundException
	 */
	@Override
	public List<Doctor> getByAvailable(LocalDateTime startTime) throws DoctorNotFoundException{
		// TODO Auto-generated method stub
		
		doctorList=doctorDao.getByAvailable(startTime);
		if(doctorList.isEmpty())
			throw new DoctorNotFoundException("Doctor Not Found");
		else
			return doctorList.stream()
					.sorted((d1,d2)->d1.getStartTime().compareTo(d2.getStartTime()))
					.collect(Collectors.toList());
		
	}

}

