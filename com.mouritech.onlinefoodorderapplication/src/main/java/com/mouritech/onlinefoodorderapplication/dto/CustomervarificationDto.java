package com.mouritech.onlinefoodorderapplication.dto;

public class CustomervarificationDto {
	private String customerPassword;

	private String customerEmail;

	public CustomervarificationDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomervarificationDto(String customerPassword, String customerEmail) {
		super();
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

}
