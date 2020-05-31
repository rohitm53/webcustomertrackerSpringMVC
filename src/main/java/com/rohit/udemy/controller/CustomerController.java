package com.rohit.udemy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rohit.udemy.dao.CustomerDAO;
import com.rohit.udemy.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerDAO customerDao;

	@RequestMapping("/list")
	public String listCustomer(Model model) {
		
		List<Customer> customersList = customerDao.getCustomers();
		model.addAttribute("customers", customersList);
		model.addAttribute("name", "Rohit Manohar");
		return "list-customers";
	}
	
}
