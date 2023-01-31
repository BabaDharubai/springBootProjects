/**
 * 
 */
package com.doctorapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
public class DoctorController {
	IDoctorService doctorService;

	/**
	 * @param doctorService the doctorService to set
	 */
	@Autowired
	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}

	@GetMapping("/doctors/doctorId")
	Doctor getById(@RequestParam("Id")int doctorId) throws IdNotFoundException{
		return doctorService.getById(doctorId);
	}

	@GetMapping("/doctors")
	List<Doctor> getAllDoctors()throws DoctorNotFoundException{
		return doctorService.getAllDoctors();
	}
	
	@GetMapping("/doctors/speciality/{speciality}")
	List<Doctor> getBySpeciality(@PathVariable("speciality") String speciality) throws DoctorNotFoundException{
		return doctorService.getBySpeciality(speciality);
	}
	
	@GetMapping("/doctors/speciality/{speciality}/fees")
	List<Doctor> getBySpecialityAndFees(@PathVariable("speciality")String speciality,@RequestParam("fees")double fees) throws DoctorNotFoundException{
		return doctorService.getBySpecialityAndFees(speciality, fees);
	}
	@GetMapping("/doctors/speciality/{speciality}/name/{name}")
	List<Doctor> getBySpecialityName(@PathVariable("speciality") String speciality,@PathVariable("name") String name){
		return doctorService.getBySpecialityName(speciality, name);
	}
}
