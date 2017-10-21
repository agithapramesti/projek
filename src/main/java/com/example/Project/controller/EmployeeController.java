package com.example.Project.controller;

import com.example.Project.model.Employee;
import com.example.Project.service.ServiceEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;

@Controller
public class EmployeeController {
    @Autowired
    ServiceEmployee serviceEmployee;

    @RequestMapping("/tampilemp")
    public String EmployeeList(Model model){
        model.addAttribute("employee",serviceEmployee.showEmp());
        return "tampilanemp";
    }
    @RequestMapping(value = "/tampilemp/create", method = RequestMethod.GET)
    public String tampilFormCreate(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }
    @RequestMapping(value = "/tampilemp/create", method = RequestMethod.POST)
    public String simpanDataEmployee(Model model, Employee emp){
        model.addAttribute("employee", serviceEmployee.saveOrUpdate(emp));
        return "redirect:/tampilemp";
    }
    @RequestMapping(value = "/tampilemp/edit/{id}", method = RequestMethod.GET)
    public String editData(@PathVariable Integer id, Model model){
        model.addAttribute("employee", serviceEmployee.getIdEmp(id));
        return "create";
    }
    @RequestMapping(value = "/tampilemp/hapus/{id}", method = RequestMethod.GET)
    public String hapusData(@PathVariable Integer id, Model model){
        serviceEmployee.hapus(id);
        return "redirect:/tampilemp";
    }
}
