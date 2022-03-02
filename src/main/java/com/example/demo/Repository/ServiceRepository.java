package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Demande;
import com.example.demo.entities.Service;

public interface ServiceRepository  extends JpaRepository<Service, Long> {
	
	@Query("select c from Service c where c.id like :x")
	public Service getService(
			@Param("x")Long id
			);

}
