package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	private String firstName;
	
	
	@NotNull(message="isrequired")
	@Size(min = 1, message="isrequired")
	private String lastName;
	
	
	@NotNull(message="isrequired")
	@Min(value =0,message="must be greater")
	@Max(value =10, message="must be less than")
	private Integer freePasses;
	
	
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digit")
	private String postalCode;
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
