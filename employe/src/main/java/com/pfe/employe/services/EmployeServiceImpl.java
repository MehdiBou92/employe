package com.pfe.employe.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.employe.entities.Employe;
import com.pfe.employe.repos.EmployeRepository;

@Service
public class EmployeServiceImpl implements EmployeServices {

	@Autowired
	EmployeRepository employeRepository;
	
	
	public Employe saveEmploye(Employe e) {
		employeRepository.save(e);
		return null;
	}

	
	public Employe updateEmploye(Employe e) {
		employeRepository.save(e);
		return null;
	}


	public void deleteEmploye(Employe e) {
		employeRepository.delete(e);
		
	}
	
	public void deleteEmployeById(Long id) {
		employeRepository.deleteById(id);		
	}

	public Employe getEmploye(Long id) {
		return employeRepository.findById(id).get();
		
	}


	public List<Employe> getAllEmployes() {

		return employeRepository.findAll();
	}


}
