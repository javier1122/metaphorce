package com.metaphorce.mx.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.metaphorce.mx.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
