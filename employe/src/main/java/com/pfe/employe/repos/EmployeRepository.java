package com.pfe.employe.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pfe.employe.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {

}
  