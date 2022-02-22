package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="projet")
public class Projet implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_project;
	@Column(length=70)
	private String description;
	@Column(length=30)
	private String delais;
	private double budgetTotal;
	private double budgetSpecific;
	private Date date_creation;
	private int etat;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client clientt;
	@ManyToOne
	@JoinColumn(name="id_chefProjet")
	private ChefProjet chefprojet;
	
	@ManyToOne
	@JoinColumn(name="id_service")
	private Service service1;
	@OneToMany(mappedBy="projet",fetch=FetchType.LAZY)
	private Collection<Phase> phases;
	
	  @ManyToMany(cascade = { CascadeType.ALL })
	    @JoinTable(
	        name = "membre_projet", 
	        joinColumns = { @JoinColumn(name = "id_project") }, 
	        inverseJoinColumns = { @JoinColumn(name = "membre_id") }
	    )
	    Set<Membre> membres = new HashSet<>();

}
