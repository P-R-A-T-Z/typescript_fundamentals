package com.springboot.crud_demo.dao;

import com.springboot.crud_demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();

    public Employee findByID(int id);

    public void save(Employee employee);

    public void deleteByID(int id);

}
