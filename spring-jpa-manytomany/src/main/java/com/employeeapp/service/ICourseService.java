/**
 * 
 */
package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Course;

/**
 * @author BabaFakruddinDharuba
 *
 */
public interface ICourseService {
	void addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(int courseId);
	List<Course> getAll();
	
	Course getById(int courseId);
	
	
	List<Course> getByCategory(String category);
	List<Course> getByCategoryMode(String category,String mode);
	List<Course> getByEmployee(String name);
	List<Course> getByCity(String city);
}
