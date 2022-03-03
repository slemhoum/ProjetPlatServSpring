package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Admin;
import com.example.demo.entities.ChefProjet;

public interface AdminRepo  extends JpaRepository<Admin, Long>{
	Admin findByUsernameAndPassword(String user,String pass);

}
