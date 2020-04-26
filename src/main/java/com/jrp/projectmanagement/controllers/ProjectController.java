package com.jrp.projectmanagement.controllers;

import com.jrp.projectmanagement.dao.EmployeeRepository;
import com.jrp.projectmanagement.dao.ProjectRepository;
import com.jrp.projectmanagement.entitites.Employee;
import com.jrp.projectmanagement.entitites.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    ProjectRepository proRep;

    @Autowired
    EmployeeRepository empRepo;

    @GetMapping("/new")
    public String displayProjectForm(Model model) {
        Project aProject = new Project();
        List<Employee> employees = empRepo.findAll();
        model.addAttribute("allEmployees", employees);
        model.addAttribute("project", aProject);
        return "projects/new-project";
    }

    @PostMapping("/save")
    public String createProjectForm(Project project) {
    proRep.save(project);
    //@RequestParam List<Long> employees,
 /*   Iterable<Employee> chosenEmployees = empRepo.findAllById(employees);
        for (Employee emp: chosenEmployees) {
emp.setProject(project);
empRepo.save(emp);
        } */
    //Use the redirect to prevent duplicate submissions
return "redirect:/projects";
    }

    @GetMapping("")
    public String displayProjects(Model model) {
List<Project> projects = proRep.findAll();
        model.addAttribute("projectList", projects);
        return "projects/list-project";
    }



}
