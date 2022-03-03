package com.example.demo.Repository.Mey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Accueilleur;
import com.example.demo.entities.ChefProjet;
import com.example.demo.entities.Demande;
import com.example.demo.entities.Membre;
import com.example.demo.entities.Projet;
import com.example.demo.entities.Service;

public interface MemberReposiotory  extends JpaRepository<Membre, Long>{
	 @Query("select p from Membre p where p.serviice=:x")
	 public List<Membre>MembreParS(@Param("x")Service s);	

}