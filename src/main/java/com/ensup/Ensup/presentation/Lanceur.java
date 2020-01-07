package com.ensup.Ensup.presentation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1- Creation de l'unité de travail
	
		EntityManagerFactory enf = Persistence.createEntityManagerFactory("jpa-pu");
		EntityManager em = enf.createEntityManager();

	}
}
