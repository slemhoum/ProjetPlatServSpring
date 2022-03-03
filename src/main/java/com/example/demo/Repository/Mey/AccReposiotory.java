package com.example.demo.Repository.Mey;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.Service;

public interface AccReposiotory  extends JpaRepository<Accueilleur, Long>{
	

}