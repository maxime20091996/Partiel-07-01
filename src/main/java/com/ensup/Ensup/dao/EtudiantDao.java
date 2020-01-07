package com.ensup.Ensup.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ensup.Ensup.domaine.Etudiant;
import com.ensup.Ensup.domaine.Personne;

public class EtudiantDao implements IEtudiantDao {

	private String url="jdbc:mysql://localhost/ensup";
	private String login="root";
	private String passwd="";
	private Connection cn;
	private Statement st;
	
	public EtudiantDao(){
		//se connecter à la bdd
		System.out.println("Etudiant Dao");
		System.out.println("connection..");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn = DriverManager.getConnection(url, login, passwd);
			st = cn.createStatement();
		} catch (ClassNotFoundException e) {
			System.out.println("erreur connection, classnotfound");
			//e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("erreur connection, sqlexception");
			//e.printStackTrace();
		}
	}
	
	public boolean creerEtudiant(Etudiant etudiant) {
		System.out.println("création etudiant");
		try {
			st = cn.createStatement();
			String sql = "INSERT INTO `personne` VALUES ("+etudiant.getId()+",'" + etudiant.getNom() + "','"
					+ etudiant.getPrenom() +"','"+etudiant.getEmail()+"','"+etudiant.getAdresse()+"','"+etudiant.getTelephone()+"','"+etudiant.getDateNaissance()+"')";
			st.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("erreur sqlexception");
			e.printStackTrace();
		}

		return true;
	}

	public Etudiant LireEtudiant(int id) {
		
		String nom;
		String prenom;
		String email;
		String adresse;
		String telephone;
		String dateNaissance;
		
		Etudiant etudiant = null;
		try {
			st = cn.createStatement();
			String sql = "Select * FROM etudiant WHERE id="+id+";";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				id = rs.getInt("id");
				nom = rs.getString("nom");
				prenom = rs.getString("prenom");
				email = rs.getString("Email");
				adresse = rs.getString("Adresse");
				telephone = rs.getString("Téléphone");
				dateNaissance = rs.getString("Date de naissance");
				etudiant = new Etudiant(id, nom, prenom, adresse, telephone, dateNaissance);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return etudiant;
	}

	public void supprimerEtudiant(int id) {
		// TODO Auto-generated method stub
		
	}

	public Etudiant modifierEtudiant(Etudiant etudiant) {
		try {
			
			String sql = " UPDATE `etudiant` SET nom = '" + etudiant.getNom() + "' , prenom = '" + etudiant.getPrenom()
					+ "' , mail = '" + etudiant.getEmail() + "' , adresse = '" + etudiant.getAdresse()
					+ "' , telephone = '" + etudiant.getTelephone() + "' , dateNaissance = '"
					+ etudiant.getDateNaissance() + "' WHERE Id = '" + etudiant.getId() + "'";
			System.out.println("Etudiant");

			st.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return etudiant;
	}

	public List<Etudiant> listAllEtudiants() {
		// TODO Auto-generated method stub
		Statement stm = null;
		List<Etudiant> listEtudiants = new ArrayList<Etudiant>();
		Etudiant etudiant= null;

		try {
			String sql = "SELECT * from `etudiant`;";
			ResultSet rs = stm.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("Identifiant de l'étudiant");
				String nom = rs.getString("nom");
				String prenom = rs.getString("prenom");
				String email = rs.getString("email");
				String adresse = rs.getString("adresse");
				String telephone = rs.getString("Telephone");
				String dateNaissance = rs.getString("Date de naissance");
				etudiant = new Etudiant(id, nom, prenom, email, adresse, telephone, dateNaissance);
				listEtudiants.add(etudiant);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listEtudiants;
	}

}
