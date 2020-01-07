package com.ensup.Ensup.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ETUDIANT")
public class Etudiant extends Personne{

	private String dateNaissance;

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Etudiant [dateNaissance=" + dateNaissance + "]";
	}

	public Etudiant(int id, String nom, String prenom, String email, String adresse, String telephone,
			String dateNaissance) {
		super(id, nom, prenom, email, adresse, telephone);
		this.dateNaissance = dateNaissance;
	}

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(int id, String nom, String prenom, String email, String adresse, String telephone) {
		super(id, nom, prenom, email, adresse, telephone);
		// TODO Auto-generated constructor stub
	}
	
	
}
