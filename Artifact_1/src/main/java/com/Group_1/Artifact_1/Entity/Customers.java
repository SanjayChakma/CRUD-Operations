package com.Group_1.Artifact_1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;
	
	@Column(name="username")
	private String username;
	
	@Column(name="address_line1")
	private String address_line1;
	
	@Column(name="address_line2")
	private String address_line2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="state")
	private String state;
	
	@Column(name="pin_code")
	private String pin_code;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(int userId, String username, String address_line1, String address_line2, String city,
			String country, String state, String pin_code) {
		super();
		this.userId = userId;
		this.username = username;
		this.address_line1 = address_line1;
		this.address_line2 = address_line2;
		this.city = city;
		this.country = country;
		this.state = state;
		this.pin_code = pin_code;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress_line1() {
		return address_line1;
	}

	public void setAddress_line1(String address_line1) {
		this.address_line1 = address_line1;
	}

	public String getAddress_line2() {
		return address_line2;
	}

	public void setAddress_line2(String address_line2) {
		this.address_line2 = address_line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPin_code() {
		return pin_code;
	}

	public void setPin_code(String pin_code) {
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Customers [userId=" + userId + ", username=" + username + ", address_line1=" + address_line1
				+ ", address_line2=" + address_line2 + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", pin_code=" + pin_code + "]";
	}

	
	
}
