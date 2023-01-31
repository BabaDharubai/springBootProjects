package com.employeeapp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;

@Service
public class CourseServiceImpl implements ICourseService{

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByCategoryMode(String category, String mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
