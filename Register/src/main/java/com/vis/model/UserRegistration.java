/**
 * 
 */
package com.vis.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Tiriveedhi
 * 
 */
@Entity
@Table(name = "userregistration")
public class UserRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	public UserRegistration(String firstname, String lastname, Long telephone,
			String email, Date date_of_birth, Set<Address> address) {
		super();

		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.email = email;
		this.date_of_birth = date_of_birth;
		this.address=address;
	}

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "telephone")
	private Long telephone;

	@Column(name = "email")
	private String email;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date date_of_birth;

	@Column(name="addressid")
	private Long addressId;
	
	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	@OneToMany(mappedBy = "userregistration")
      	private Set<Address> address;

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public Set<Address> getAddress() {
		return address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getTelephone() {
		return telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	@Override
	public String toString() {
		return "UserRegistration [firstname=" + firstname + ", lastname="
				+ lastname + ", telephone=" + telephone + ", email=" + email
				+ ", date_of_birth=" + date_of_birth + ", address=" + address
				+ "]";
	}
}
