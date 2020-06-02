package com.rohit.udemy.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rohit.udemy.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer order by lastName",Customer.class);//updating in order to sort by last name
		List<Customer> customersList = query.getResultList();
		
		return customersList;
	}

	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
	}

	public Customer getCustomerById(int id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
	}

	public void deleteCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer  = session.get(Customer.class, id);
		session.delete(customer);
	}
	

}
