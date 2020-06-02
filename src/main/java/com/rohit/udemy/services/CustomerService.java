package com.rohit.udemy.services;

import java.util.List;

import com.rohit.udemy.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer customer);
	
	public Customer getCustomerById(int id);
	
	public void deleteCustomer(int id);
}
