package com.team1.GrpProjectOne.AccountActivityRepository;

import com.team1.GrpProjectOne.model.AccountBalance;
import com.team1.GrpProjectOne.model.AccountInfo;

public interface AccountActivityRepository {
	
	int deposit(AccountBalance account);
	
	int deposit(AccountBalance account, double interestMoney);
	
	int withdraw(AccountBalance account);
	
	int withDraw(AccountBalance account, double fee);
	
	int openAccount(AccountInfo info);
	
//	void accountInfo(int id);

}
