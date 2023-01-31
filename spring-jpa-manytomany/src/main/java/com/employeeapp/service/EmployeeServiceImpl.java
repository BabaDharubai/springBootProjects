/**
 * 
 */
package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repository.IEmployeeRepository;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	IEmployeeRepository employeeRepository;
	

	/**
	 * @param employeeRepository the employeeRepository to set
	 */
	@Autowired
	public void setEmployeeRepository(IEmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCategoryMode(String category, String mode) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
