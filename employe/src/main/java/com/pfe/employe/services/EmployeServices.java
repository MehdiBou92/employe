package com.pfe.employe.services;

import java.util.List;

import com.pfe.employe.entities.Employe;

public interface EmployeServices {

	Employe saveEmploye(Employe e);
	Employe updateEmploye(Employe e);
	void deleteEmploye(Employe e);
	void deleteEmployeById(Long id);
	Employe getEmploye(Long id);
	List<Employe> getAllEmployes();
}
