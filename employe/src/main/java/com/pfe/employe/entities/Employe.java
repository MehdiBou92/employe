package com.pfe.employe.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table (name = "employe_table")
/* Veut dire que cette classe, ses attributs seront enregistrés dans une base de donnée Relationnelle */

public class Employe {

/* Cette ligne avant l'ID indique que le idEmployé sera l'ID et qu'il sera en auto-incrément */
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idEmploye;
	@Column (name = "nom_emp")
	private String nomEmploye;
	@Column (name = "prenom_emp")
	private String prenomEmploye;
	@Column 
	private Date dateNaissance;
	@Column 
	private int age;
	@Column 
	private String cinEmploye;
	@Column 
	private String departement;  
	private float salary;
	
	
	/* Constructeur par defaut */
	
	public Employe() {
		super();
		
	}
	
	/* Constructeur personnalisé */
	
	public Employe(String nomEmploye, String prenomEmploye, Date dateNaissance, int age, String cinEmploye,
			String departement, float salary) {
		super();
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.cinEmploye = cinEmploye;
		this.departement = departement;
		this.salary = salary;
	}


	/* Getters & Setters */
	
	public Long getIdEmploye() {
		return idEmploye;
	}
	public void setIdEmploye(int idEmploye) {
		this.idEmploye = (long) idEmploye;
	}
	public String getNomEmploye() {
		return nomEmploye;
	}
	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}
	public String getPrenomEmploye() {
		return prenomEmploye;
	}
	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCinEmploye() {
		return cinEmploye;
	}
	public void setCinEmploye(String cinEmploye) {
		this.cinEmploye = cinEmploye;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	
	/* Methode toString */
	



	@Override
	public String toString() {
		return "Employe [idEmploye=" + idEmploye + ", nomEmploye=" + nomEmploye + ", prenomEmploye=" + prenomEmploye
				+ ", dateNaissance=" + dateNaissance + ", age=" + age + ", cinEmploye=" + cinEmploye + ", departement="
				+ departement + "]";
	}
	
	
	
	

}
