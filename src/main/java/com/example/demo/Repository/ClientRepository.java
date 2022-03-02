package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Client;
import com.example.demo.entities.Demande;

public interface ClientRepository extends JpaRepository<Client, Long> {
	@Query("select c from Client c where c.id like :x")
	public Client getClient(
			@Param("x")Long id
			);
	
	@Query("select c from Client c,Projet s where c.id=s.clientt.id and s.chefprojet.id like :x")
	public List<Client> listeClient(
			@Param("x")Long id);

}
