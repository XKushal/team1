package com.team1.GrpProjectOne.model;

public class AccountBalance {
	private int accountId;
	private double depositAmount;
	private double withdrawAmount;
	private double totalAmount;
	
	public AccountBalance() {};
	public AccountBalance(int accountId, double depositAmt, double withdrawAmt, double totalAmt) {
		this.accountId = accountId;
		this.depositAmount = depositAmt;
		this.withdrawAmount = withdrawAmt;
		this.totalAmount = 100.0;
	}

	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
