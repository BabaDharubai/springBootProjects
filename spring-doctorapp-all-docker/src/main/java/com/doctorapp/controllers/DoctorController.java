/**
 * 
 */
package com.doctorapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.IDoctorService;

/**
 * @author BabaFakruddinDharuba
 *
 */
@RestController
@RequestMapping("doctor-api")
public class DoctorController {

	IDoctorService doctorService;


	/**
	 * @param doctorService the doctorService to set
	 */
	@Autowired
	public void setDoctorService(IDoctorService doctorService) {
		this.doctorService = doctorService;
	}

	@PostMapping("/doctors")
	ResponseEntity<Void> addDoctor(Doctor doctor) {
		doctorService.addDoctor(doctor);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

	@GetMapping("/doctors")
	ResponseEntity<List<Doctor>> getAll(){
		List<Doctor> doctors=doctorService.getAll();
		return ResponseEntity.ok().body(doctors);
	}
	//	void updateDoctor(Doctor doctor) ;
	//	
	//	Doctor getById(int doctorId);
	//	void deleteDoctor(int doctorId);
	//	
	//	List<Doctor> getAll();
	//	List<Doctor> getByCity(String city);
	//	List<Doctor> getBySpecialityAndCity(String speciality,String city);
	//	List<Doctor> getBySpeciality(String speciality);
	//	List<Doctor> getBySpecialityAndExp(String speciality,int experience);
	//	List<Doctor> getBySpecialityAndFees(String speciality,double fees);
	//	List<Doctor> getBySpecialityAndHospital(String speciality,String hospitalName);
	//	List<Doctor> getByHospital(String hospitalName);
	//	Doctor getByCaseSheet(Casesheet casesheet);
}
