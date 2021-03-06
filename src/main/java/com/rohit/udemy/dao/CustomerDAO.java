package com.rohit.udemy.dao;

import java.util.List;

import com.rohit.udemy.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public void deleteCustomer(int id);
}
