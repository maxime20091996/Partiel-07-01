package com.ensup.Ensup.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cours {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String theme;
	private String heure;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}
	
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}

	@Override
	public String toString() {
		return "Cours [id=" + id + ", theme=" + theme + ", heure=" + heure + "]";
	}

	public Cours(int id, String theme, String heure) {
		super();
		this.id = id;
		this.theme = theme;
		this.heure = heure;
	}

	public Cours() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
