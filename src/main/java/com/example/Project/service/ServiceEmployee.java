package com.example.Project.service;

import com.example.Project.model.Employee;
import com.example.Project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceEmployee {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> showEmp(){
        List<Employee> daftar= employeeRepository.getAllEmployee();
        return  daftar;
    }
    public Employee saveOrUpdate(Employee e){
        Employee cek= employeeRepository.save(e);
        return cek;
    }
    public Employee getIdEmp(Integer id){
        Employee get= employeeRepository.findOne(id);
        return get;
    }
    public void hapus(Integer id){
        employeeRepository.delete(id);
    }
}
