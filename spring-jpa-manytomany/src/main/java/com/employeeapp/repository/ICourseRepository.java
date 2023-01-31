/**
 * 
 */
package com.employeeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Course;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Repository
public interface ICourseRepository extends JpaRepository<Course, Integer>{

	@Query("from Course c inner join c.employees e where e.city=?1")
	List<Course> findByCity(String city);
	
	@Query("from Course c inner join c.employees e where c.category=?1")
	List<Course> findByCategory(String category);
	
	@Query("from Course c inner join c.employees e where e.name=?1")
	List<Course> findByEmployeeName(String name);

}
