package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Membre;
import com.example.demo.entities.Phase;

public interface PhaseRepository extends JpaRepository<Phase, Long> {
	
	@Query("select c from Phase c where  c.projet.id like :x")
	public List<Phase> listePhaseProjet(
			@Param("x")Long id);

	
	

}
