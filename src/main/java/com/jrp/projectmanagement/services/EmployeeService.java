package com.jrp.projectmanagement.services;

import com.jrp.projectmanagement.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    //Field injection
//    @Qualifier("staffRepositoryImpl")
//    @Autowired
    IStaffRepository empRepo;

//    //Constructor injection
//    public EmployeeService(@Qualifier("staffRepositoryImpl") IStaffRepository empRepo) {
//        super();
//        this.empRepo = empRepo;
//    }

//    Setter injection
    @Autowired
    @Qualifier("staffRepositoryImpl")
    public void setEmployeeRepository(IStaffRepository empRepo ) {
        this.empRepo = empRepo;
    }
}
