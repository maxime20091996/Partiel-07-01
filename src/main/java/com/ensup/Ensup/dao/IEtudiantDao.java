package com.ensup.Ensup.dao;

import java.util.List;

import com.ensup.Ensup.domaine.Etudiant;

public interface IEtudiantDao {

	//Crud Etudiant
		 public boolean creerEtudiant(Etudiant etudiant);
		 public Etudiant LireEtudiant(int id);
		 public void supprimerEtudiant(int id);
		 public Etudiant modifierEtudiant(Etudiant e);
		 public List<Etudiant> listAllEtudiants();
}
