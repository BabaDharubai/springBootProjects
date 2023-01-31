package com.doctorapp.dao;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorMapper;
import com.doctorapp.util.Queries;

@Repository
public class DoctorDaoImpl implements IDoctorDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Object[] doctorArray= {doctor.getDoctorName(),
				doctor.getSpeciality(),
				doctor.getExperience(),
				doctor.getFees(),
				Timestamp.valueOf(doctor.getStartTime()),
				Timestamp.valueOf(doctor.getEndTime())
		};
		jdbcTemplate.update(Queries.INSERTQUERY, doctorArray);
		
	}

	@Override
	public int updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(Queries.UPDATEQUERY, fees,doctorId);
		return result;
	}

	@Override
	public Doctor getById(int doctorId) {
		// TODO Auto-generated method stub
		Doctor ndoctor=jdbcTemplate.queryForObject(Queries.GETBYID, (rs,rowNum)->{
			Doctor doctor=new Doctor();
			doctor.setDoctorId(rs.getInt("doctorId"));
			doctor.setDoctorName(rs.getString("doctorName"));
			doctor.setExperience(rs.getInt("experience"));
			doctor.setFees(rs.getDouble("fees"));
			doctor.setSpeciality(rs.getString("speciality"));
			doctor.setStartTime(rs.getTimestamp("startTime").toLocalDateTime());
			doctor.setEndTime(rs.getTimestamp("endTime").toLocalDateTime());
			return doctor;
		},doctorId);
		return ndoctor;
	}

	@Override
	public int deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		int result=jdbcTemplate.update(Queries.DELETEDOCTOR,doctorId);
		return result;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		// TODO Auto-generated method stub
		RowMapper<Doctor> mapper=new DoctorMapper();
		return jdbcTemplate.query(Queries.GETALLDOCTORS,mapper);
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.GETBYSPECIALITY, new DoctorMapper(),speciality);
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.GETBYSPECEXP, new DoctorMapper(), speciality,experience);
	}

	@Override
	public List<Doctor> getBySpecialityAndFees(String speciality, double fees) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.GETBYSPECFEE, new DoctorMapper(),speciality,fees);
	}

	@Override
	public List<Doctor> getByAvailable(LocalDateTime startTime) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query(Queries.GETBYAVAIL, new DoctorMapper(),startTime);
	}
	

}
