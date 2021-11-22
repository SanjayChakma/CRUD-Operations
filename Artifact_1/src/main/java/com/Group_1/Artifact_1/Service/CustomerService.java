package com.Group_1.Artifact_1.Service;

import java.util.List;

import com.Group_1.Artifact_1.Entity.Customers;

public interface CustomerService {
	
	public List<Customers> getAllCustomers();
	public Customers getCustomerById(int userId);
	public Customers addOrUpdateCustomer(Customers customer);
	public Customers deleteCustomer(int userId) throws Exception;

}
