package com.nielsen.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shopper")
public class Shopper {
	@Id
    private String shopper_id;

    private String first_name;
    private String last_name;
    private String address;
    private String phone;
    private String email;
    
    public Shopper() {}

	public Shopper(String shopper_id, String first_name, String last_name, String address, String phone, String email) {
		super();
		this.shopper_id = shopper_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public String getShopper_id() {
		return shopper_id;
	}

	public void setShopper_id(String shopper_id) {
		this.shopper_id = shopper_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
