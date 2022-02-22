package com.example.demo.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor @AllArgsConstructor 
@Entity
@Table(name="phase")
public class Phase implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length=50)
	private String description;
	@Column(length=30)
	private String nom;
	@Column(length=30)
	private String status;
	@Column(length=30)
	private String delais;
	private Date date_debut;
	@ManyToOne
	@JoinColumn(name="id_projet")
	private Projet projet;


}
