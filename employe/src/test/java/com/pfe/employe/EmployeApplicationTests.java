package com.pfe.employe;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pfe.employe.entities.Employe;
import com.pfe.employe.repos.EmployeRepository;

@SpringBootTest
class EmployeApplicationTests {

	@Autowired
	private EmployeRepository employeRepository;
	
	@Test
	public void testCreateEmploye() {
		Employe emp = new Employe ("MEHDI","BOUA", new Date(), 30, "AC1583",
				"FINANCE",10025);
		employeRepository.save(emp);
		
	}
		
		@Test
		public void testFindEmploye() {
		Employe e =	employeRepository.findById(2L).get();
			System.out.println(e);
	}
		
		@Test
		public void testUpdateEmploye() {
			Employe e =	employeRepository.findById(2L).get();
			e.setSalary(11000);
			employeRepository.save(e);
			System.out.println(e);
			
		}
		
		@Test
		public void testDeleteEmploye() {
			Employe e =	employeRepository.findById(2L).get();
			employeRepository.deleteById(2L);
			
		}
		
		@Test
		public void testAfficherEmploye() {
			
		List<Employe> emp = employeRepository.findAll();
		for (Employe e:emp)
			System.out.println(e);
		
		}
		
}
