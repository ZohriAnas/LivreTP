package com.example.demo.entities;
import java.sql.Date;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Livre")
public class Livre {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	@Column(name="titre",length=50,nullable=false)
	public String titre;
	@Column(nullable=false,updatable=false)
	public String maisonEdition;
	@Column(nullable=false)
	public Date dateSortie;
	@Column(nullable=false)
	public String auteur;
	@Column(nullable=false)
	public int nombrePage;
	@Column(unique=true,nullable=false,updatable=false)
	public String ISBN;
	@Column(nullable=false)
	public Date dateDerniereConsultation;
	@Column(nullable=false)
	public boolean disponible;

}
