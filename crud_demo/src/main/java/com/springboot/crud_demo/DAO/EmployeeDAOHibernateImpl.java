package com.springboot.crud_demo.dao;

import com.springboot.crud_demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
    private EntityManager entitymanager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager) {
        entitymanager = theEntityManager;

    }

    @Override
    public List<Employee> findAll() {

        Session currentSession = entitymanager.unwrap(Session.class);

        Query<Employee> theQuery = currentSession.createQuery(String.valueOf(Employee.class));

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public Employee findByID(int id) {
        Session currentSession = entitymanager.unwrap(Session.class);
        Employee employee = currentSession.get(Employee.class, id);
        return employee;
    }

    @Override
    public void save(Employee employee) {
        Session currentSession = entitymanager.unwrap(Session.class);
        currentSession.saveOrUpdate(employee);
    }

    @Override
    public void deleteByID(int id) {
        Session currentSession = entitymanager.unwrap(Session.class);
        currentSession.delete("delete from Employee where id=" + id);

    }
}
