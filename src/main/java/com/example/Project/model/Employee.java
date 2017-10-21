package com.example.Project.model;

import javax.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String emp_name;
    private String emp_uname;
    private String password;
    private String role;
    private int status;

    public Employee(){}

    public Employee(String emp_name, String emp_uname, String password, String role, int status) {
        this.emp_name = emp_name;
        this.emp_uname = emp_uname;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_uname() {
        return emp_uname;
    }

    public void setEmp_uname(String emp_uname) {
        this.emp_uname = emp_uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
