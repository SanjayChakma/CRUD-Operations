package com.Group_1.Artifact_1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Group_1.Artifact_1.Entity.Customers;
import com.Group_1.Artifact_1.Service.CustomerService;

@RestController
@RequestMapping("/Customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/allCustomers")
	public ResponseEntity<List<Customers>> getAllCustomers(){
		List<Customers> customers = null;
		try {
			customers = customerService.getAllCustomers();
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<Customers>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Customers> getCustomerById(@PathVariable("id") int userId){
		Customers customers = null;
		try {
			customers = customerService.getCustomerById(userId);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Customers>(customers,HttpStatus.OK);
	}
	
	@PostMapping("/addOrUpdate")
	public ResponseEntity<Customers> addOrUpdateCustomer(@RequestBody Customers customer){
		Customers customers = null;
		try {
			customers = customerService.addOrUpdateCustomer(customer);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Customers>(customers,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Customers> deleteCustomer(@PathVariable("id") int userId){
		Customers customers = null;
		try {
			customers = customerService.deleteCustomer(userId);
		}catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<Customers>(customers,HttpStatus.OK);
	}
}
