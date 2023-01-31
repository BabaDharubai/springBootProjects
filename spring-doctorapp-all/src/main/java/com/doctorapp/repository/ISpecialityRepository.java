/**
 * 
 */
package com.doctorapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctorapp.model.Speciality;

/**
 * @author BabaFakruddinDharuba
 *
 */
@Repository
public interface ISpecialityRepository extends JpaRepository<Speciality, Integer>{

}
