package com.team1.GrpProjectOne.model;

public class AccountInfo {
	private int id;
	private String accountName;
	private String address;
	private String mobileNumber;
	
	public AccountInfo() {};
	public AccountInfo(int id, String accountName, String address, String mobileNumber) {
		this.id = id;
		this.accountName = accountName;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
}
