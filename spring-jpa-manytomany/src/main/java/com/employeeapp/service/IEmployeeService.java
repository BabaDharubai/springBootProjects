/**
 * 
 */
package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

/**
 * @author BabaFakruddinDharuba
 *
 */
public interface IEmployeeService {
	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	List<Employee> getAll();
	Employee getById(int employeeId);
	
	
	//derived
	List<Employee> getByCity(String city);
	
	
	//custom
	List<Employee> getByCourseName(String courseName);
	List<Employee> getByCategoryMode(String category,String mode);
	List<Employee> getByCategory(String category);
}
