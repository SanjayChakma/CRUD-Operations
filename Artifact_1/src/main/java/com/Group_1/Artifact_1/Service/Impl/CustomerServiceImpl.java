package com.Group_1.Artifact_1.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Group_1.Artifact_1.Entity.Customers;
import com.Group_1.Artifact_1.Repository.CustomerRepository;
import com.Group_1.Artifact_1.Service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customers>) customerRepository.findAll();
	}

	@Override
	public Customers getCustomerById(int userId) {
		// TODO Auto-generated method stub
		return customerRepository.findById(userId).orElse(null);
	}

	@Override
	public Customers addOrUpdateCustomer(Customers customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

	@Override
	public Customers deleteCustomer(int userId) throws Exception {
		// TODO Auto-generated method stub
		Customers deletedCustomer = null;
		try {
			deletedCustomer = customerRepository.findById(userId).orElse(null);
			if(deletedCustomer == null) {
				throw new Exception("user not available");
			}else {
				customerRepository.deleteById(userId);
			}
		}catch(Exception ex) {
			throw ex;
		}
		return deletedCustomer;
	}

}
