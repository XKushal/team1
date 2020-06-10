package com.team1.GrpProjectOne.AccountActivityRepository;

import com.team1.GrpProjectOne.model.AccountBalance;
import com.team1.GrpProjectOne.model.AccountInfo;

public class AccountDetail {
	public AccountInfo accountInfo;
	public AccountBalance accountBalance;
	
	public AccountInfo getAccountInfo() {
		return accountInfo;
	}
	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}
	public AccountBalance getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(AccountBalance accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}
