package com.springboot.crud_demo.rest;


import com.springboot.crud_demo.entity.Employee;
import com.springboot.crud_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeService employeeservice;

    //Inject Employee DAO
    @Autowired
    public EmployeeRestController(EmployeeService employeeservice)
    { this.employeeservice=employeeservice; }

    //Return List of Employee
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeservice.findAll();

    }

}
