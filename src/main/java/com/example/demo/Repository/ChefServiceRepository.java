package com.example.demo.Repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.ChefService;

public interface ChefServiceRepository extends JpaRepository<ChefService, Long> {
	
	ChefService findByUsernameAndPassword(String user,String pass);
	


}
