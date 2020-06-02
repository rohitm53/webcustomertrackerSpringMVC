package com.rohit.udemy.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rohit.udemy.dao.CustomerDAO;
import com.rohit.udemy.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDAO;
	
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
	}

	@Transactional
	public Customer getCustomerById(int id) {
		return customerDAO.getCustomerById(id);
	}

	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
	}

}
