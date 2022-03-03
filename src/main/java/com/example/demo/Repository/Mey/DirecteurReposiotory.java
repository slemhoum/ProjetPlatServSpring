package com.example.demo.Repository.Mey;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.ChefService;
import com.example.demo.entities.Directeur;
import com.example.demo.entities.Service;

public interface DirecteurReposiotory  extends JpaRepository<Directeur, Long>{
	

}