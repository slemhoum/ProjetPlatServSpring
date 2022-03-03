package com.example.demo.Repository.Mey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Projet;
import com.example.demo.entities.Service;

public interface ProjetReposiotory  extends JpaRepository<Projet, Long>{
	 @Query("select p from Projet p where p.service1=:x order by p.date_creation desc")
	 public List<Projet>projetParS(@Param("x")Service s);	

}