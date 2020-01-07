package com.ensup.Ensup.domaine;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ENSEIGNANT")
public class Enseignant extends Personne {

	private String matiere;

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	@Override
	public String toString() {
		return "Enseignant [matiere=" + matiere + "]";
	}

	public Enseignant(String matiere) {
		super();
		this.matiere = matiere;
	}

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(int id, String nom, String prenom, String email, String adresse, String telephone) {
		super(id, nom, prenom, email, adresse, telephone);
		// TODO Auto-generated constructor stub
	}
	
	
}
