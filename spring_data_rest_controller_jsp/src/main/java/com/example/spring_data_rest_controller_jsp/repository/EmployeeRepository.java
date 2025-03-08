package com.example.spring_data_rest_controller_jsp.repository;

import com.example.spring_data_rest_controller_jsp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}