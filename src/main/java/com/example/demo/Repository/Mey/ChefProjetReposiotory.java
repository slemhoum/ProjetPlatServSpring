package com.example.demo.Repository.Mey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Projet;
import com.example.demo.entities.Service;

public interface ChefProjetReposiotory  extends JpaRepository<ChefProjet, Long>{
	 @Query("select p from ChefProjet p where p.servicee=:x")
	 public List<ChefProjet>ChefProjetParS(@Param("x")Service s);	

}