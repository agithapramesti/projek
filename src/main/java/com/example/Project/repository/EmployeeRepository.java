package com.example.Project.repository;

import com.example.Project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>, EmployeeRepositoryCustom{

}
