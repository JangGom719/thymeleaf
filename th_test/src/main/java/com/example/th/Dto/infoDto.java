package com.example.th.Dto;

public class infoDto {

	private String id;
	private String gender;
	private String address;
	private String email;
	public infoDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public infoDto(String id, String gender, String address, String email) {
		super();
		this.id = id;
		this.gender = gender;
		this.address = address;
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
