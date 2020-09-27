package com.jrp.projectmanagement.pma.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jrp.projectmanagement.pma.dao.EmployeeRepository;
import com.jrp.projectmanagement.pma.dao.ProjectRepository;
import com.jrp.projectmanagement.pma.dto.ChartData;
import com.jrp.projectmanagement.pma.dto.EmployeeProject;
import com.jrp.projectmanagement.pma.entitites.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Value("${version}")
    private String ver;

    @Autowired
    ProjectRepository proRepo;


    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String displayHome(Model model) throws JsonProcessingException {

model.addAttribute("versionNumber", ver);

List<Project> projects = proRepo.findAll();
      model.addAttribute("projectList", projects);

      List<ChartData> projectData = proRepo.getProjectStatus();
      //Lets convert projectData object into json structure for use in javascprit
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonString = objectMapper.writeValueAsString(projectData);
      model.addAttribute("projectStatusCnt", jsonString);

      List<EmployeeProject> employeeProjectCnt = employeeRepository.employeeProjects();
        model.addAttribute("employeesListProjectsCnt", employeeProjectCnt);
        return "main/home";
    }

}
