package com.example.Project.repository;

import com.example.Project.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import java.util.List;

public class EmployeeRepolpml implements EmployeeRepositoryCustom {

    @Autowired
    EntityManager entityManager;
    @Override
    public List<Employee> getAllEmployee(){
        List<Employee> data= this.entityManager.createNativeQuery(
                "SELECT * from Employee", Employee.class
        ).getResultList();
        return  data;
    }
}
