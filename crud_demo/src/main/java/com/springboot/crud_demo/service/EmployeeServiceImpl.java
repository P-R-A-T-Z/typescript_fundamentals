package com.springboot.crud_demo.service;

import com.springboot.crud_demo.dao.EmployeeDAO;
import com.springboot.crud_demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public void EmployeeServiceImpl(EmployeeDAO employeedao){
        this.employeeDAO=employeedao;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findByID(int id) {
        return employeeDAO.findByID(id);
    }

    @Override
    @Transactional
    public void save(Employee employee) {
    employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteByID(int id) {
    employeeDAO.deleteByID(id);
    }
}
