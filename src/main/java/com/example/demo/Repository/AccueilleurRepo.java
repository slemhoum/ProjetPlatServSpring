package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.ChefProjet;

public interface AccueilleurRepo  extends JpaRepository<Accueilleur, Long>{

	Accueilleur findByUsernameAndPassword(String user,String pass);
}
