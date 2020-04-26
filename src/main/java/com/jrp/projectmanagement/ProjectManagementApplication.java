package com.jrp.projectmanagement;

import com.jrp.projectmanagement.dao.EmployeeRepository;
import com.jrp.projectmanagement.dao.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectManagementApplication {

    @Autowired
    EmployeeRepository empRepo;

    @Autowired
    ProjectRepository proRepo;

    public static void main(String[] args) {
        SpringApplication.run(ProjectManagementApplication.class, args);
    }

//    @Bean
//    CommandLineRunner runner() {
//        return args -> {
//            Employee emp1 = new Employee("John", "Warton", "warton@gmail.com");
//            Employee emp2 = new Employee("Mike", "Bolt", "mikey@gmail.com");
//            Employee emp3 = new Employee("Sofie", "Hansen", "sofi@gmail.com");
//
//            Employee emp4 = new Employee("Henry", "Watt", "henryw@gmail.com");
//            Employee emp5 = new Employee("Frederik", "Peterson", "fredpet@gmail.com");
//            Employee emp6 = new Employee("Alex", "Ronald", "ronal@gmail.com");
//
//            Employee emp7 = new Employee("Niko", "Bellic", "thebellic@gmail.com");
//            Employee emp8 = new Employee("Karl", "Jung", "jungmeister@gmail.com");
//            Employee emp9 = new Employee("Bill", "Joshua", "billjosh123@gmail.com");
//
//
//            Project pro1 = new Project("Manhattan Software", "NOTSTARTED", "Dynamic gaming platform");
//            Project pro2 = new Project("Abyssal Ship", "INPROGRESS", "Kryptonic ship built to explore the mystery of abyss");
//            Project pro3 = new Project("Autopilot AI", "COMPLETED", "Autopilot for small robotic cars");
//            Project pro4 = new Project("Mobile Game Frontend", "COMPLETED", "Shooting game for Android");
//
//// need to set both sides of the relationship manually
//
//            pro1.addEmployee(emp1);
//            pro1.addEmployee(emp2);
//            pro2.addEmployee(emp3);
//            pro3.addEmployee(emp1);
//            pro4.addEmployee(emp1);
//            pro4.addEmployee(emp3);
//
//            emp1.setProjects(Arrays.asList(pro1, pro3, pro4));
//            emp2.setProjects(Arrays.asList(pro1));
//            emp3.setProjects(Arrays.asList(pro2, pro4));
//
//            //save employees in database
//
//            empRepo.save(emp1);
//            empRepo.save(emp2);
//            empRepo.save(emp3);
//            empRepo.save(emp4);
//            empRepo.save(emp5);
//            empRepo.save(emp6);
//            empRepo.save(emp7);
//            empRepo.save(emp8);
//            empRepo.save(emp9);
//
//            //save projects in database
//            proRepo.save(pro1);
//            proRepo.save(pro2);
//            proRepo.save(pro3);
//            proRepo.save(pro4);
//
//
//        };
//    }
}
