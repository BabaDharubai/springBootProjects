/**
 * 
 */
package com.doctorapp.service;

import java.util.List;

import com.doctorapp.model.Doctor;

/**
 * @author BabaFakruddinDharuba
 *
 */
public interface IDoctorService {

	List<Doctor> getAll();
	
	List<String> getAllNames();
	
	double getTotalSalary();
	
	double getAvgAge();
	
	List<Doctor> getBySpeciality(String speciality);
}
