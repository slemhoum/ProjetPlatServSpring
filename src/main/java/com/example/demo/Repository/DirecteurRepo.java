package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.Directeur;

public interface DirecteurRepo   extends JpaRepository<Directeur, Long>{
	Directeur findByUsernameAndPassword(String user,String pass);

}
