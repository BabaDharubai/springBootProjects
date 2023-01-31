/**
 * 
 */
package com.doctorapp.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.doctorapp.model.Hospital;

/**
 * @author BabaFakruddinDharuba
 *
 */

public interface IHospitalService {
	void addHospital(Hospital hospital);
	void updateHospital(Hospital hospital) ;
	
	Hospital getById(int doctorId);
	void deleteHospital(int doctorId);
	
	List<Hospital> getAll();
	List<Hospital> getByCity(String city);
	List<Hospital> getBySpecialityAndCity(String speciality,String city);
	List<Hospital> getBySpeciality(String speciality);
	List<Hospital> getBySpecialityAndExp(String speciality,int experience);
	List<Hospital> getByDoctor(String doctorName);
	
	List<Hospital> getBySpecialityAndDoctor(String speciality,String hospitalName);
	List<Hospital> getByHospital(String hospitalName);
	
	
}
