package com.jrp.projectmanagement.pma.controllers;

import com.jrp.projectmanagement.pma.dao.EmployeeRepository;
import com.jrp.projectmanagement.pma.entitites.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepo;

    @GetMapping("/new")
    public String displayEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "employee/new-employee";
    }

    @PostMapping("/save")
    public String createEmployeeForm(Employee employee) {
        employeeRepo.save(employee);
        //Use the redirect to prevent duplicate submissions
        return "redirect:/employee/new";
    }

    @GetMapping("")
    public String showEmployees(Model model) {
        List<Employee> employees = employeeRepo.findAll();
        model.addAttribute("employeeList", employees);
        return "employee/list-employee";
    }
}
