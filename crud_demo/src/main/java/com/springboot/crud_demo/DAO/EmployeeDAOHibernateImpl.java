package com.springboot.crud_demo.DAO;

import com.springboot.crud_demo.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {
    private EntityManager entitymanager;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager theEntityManager){
        entitymanager=theEntityManager;

    }

    @Override
    @Transactional
    public List<Employee> findAll() {

        Session currentSession= entitymanager.unwrap(Session.class);

        Query<Employee> theQuery=currentSession.createQuery(String.valueOf(Employee.class));

        List<Employee> employees=theQuery.getResultList();

        return employees;
    }
}
