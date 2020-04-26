package com.jrp.projectmanagement.dto;

//dto stands for data transfer object
public interface EmployeeProject {

    //Need to have the property names begin with get
    String getFirstName();
    String getLastName();
    int getProjectCount();
}
