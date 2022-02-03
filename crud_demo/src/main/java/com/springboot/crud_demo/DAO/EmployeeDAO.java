package com.springboot.crud_demo.DAO;

import com.springboot.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

}
