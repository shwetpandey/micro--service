package com.user.demo.model;

public class Contact {

	private int cId;
	private String email;
	private String phone;
	
	private Long userId;

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Contact(int cId, String email, String phone, Long userId) {
		super();
		this.cId = cId;
		this.email = email;
		this.phone = phone;
		this.userId = userId;
	}
	
}
