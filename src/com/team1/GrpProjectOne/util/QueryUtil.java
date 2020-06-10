package com.team1.GrpProjectOne.util;

public class QueryUtil {
	
	public static final String OPEN_ACCOUNT = "insert into account_info_tbl(accountName, address, mobileNumber) values(?,?,?)";
	public static final String ADD_VALUE = "insert into account_balance_tbl(accountId,depositAmt,withdrawAmt,totalBalance ) values(?, ?, ?, ?)";
	
	public static final String ACCOUNT_INFO = "select bal.accountId, info.accountName, info.address, info.mobileNumber, bal.depositAmt, bal.withdrawAmt, bal.totalBalance\n" + 
			"from bankAccount_db.account_info_tbl info, bankAccount_db.account_balance_tbl bal\n" + 
			"where info.id = bal.accountId";

}

