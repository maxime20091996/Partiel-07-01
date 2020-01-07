package com.ensup.Ensup.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ensup {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String nom;
	private String email;
	private String adresse;
	private String telephone;
	private String directeur;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getDirecteur() {
		return directeur;
	}
	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	
	@Override
	public String toString() {
		return "Ensup [id=" + id + ", nom=" + nom + ", email=" + email + ", adresse=" + adresse + ", telephone="
				+ telephone + ", directeur=" + directeur + "]";
	}
	
	public Ensup(int id, String nom, String email, String adresse, String telephone, String directeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.directeur = directeur;
	}
	public Ensup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
