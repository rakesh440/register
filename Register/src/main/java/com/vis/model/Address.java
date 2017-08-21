package com.vis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "addressid")
	private Long addressId;

	
	public Address(String street, int zipcode, String country,
			String state) {
		super();
		this.street = street;
		this.zipcode = zipcode;
		this.country = country;
		this.state = state;
	}

	@Column(name = "street")
	private String street;

	@Column(name = "zipcode")
	private int zipcode;

	@Column(name = "country")
	private String country;

	@Column(name = "state")
	private String state;

	@ManyToOne
	@JoinColumn(name="addressid")
	private UserRegistration userRegistration;
	
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode
				+ ", country=" + country + ", state=" + state + "]";
	}

}
