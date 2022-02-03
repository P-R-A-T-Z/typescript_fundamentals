package com.springboot.crud_demo.rest;


import com.springboot.crud_demo.DAO.EmployeeDAO;
import com.springboot.crud_demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeedao;

    //Inject Employee DAO
    @Autowired
    public EmployeeRestController(EmployeeDAO theemployeedao)
    { employeedao=theemployeedao; }

    //Return List of Employee
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeedao.findAll();

    }

}
