package com.doctorapp.util;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.doctorapp.model.Doctor;
import com.doctorapp.model.Specialization;
@Component
public class DoctorDetails {
	
	private List<Doctor> doctors;
	
	
	public List<Doctor> getDoctors() {
		setDoctors(showDoctors());
		return doctors;
	}


	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}


	private List<Doctor> showDoctors(){
		return Arrays.asList(
				new Doctor("Rani",1,Specialization.CARDIO.type,1200),
				new Doctor("Robert",2,Specialization.DIABETIC.type,1500),
				new Doctor("John",3,Specialization.ORTHO.type,1300),
				new Doctor("Albert",4,Specialization.PEADO.type,1000),
				new Doctor("Sharuk",5,Specialization.PHYSICIAN.type,2000),
				new Doctor("salman",6,Specialization.CARDIO.type,800)
				);
	}
}
