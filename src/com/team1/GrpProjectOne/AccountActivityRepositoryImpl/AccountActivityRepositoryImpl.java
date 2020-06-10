package com.team1.GrpProjectOne.AccountActivityRepositoryImpl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.team1.GrpProjectOne.AccountActivityRepository.AccountActivityRepository;
import com.team1.GrpProjectOne.model.AccountBalance;
import com.team1.GrpProjectOne.model.AccountInfo;
import com.team1.GrpProjectOne.util.DbUtil;
import com.team1.GrpProjectOne.util.QueryUtil;

public class AccountActivityRepositoryImpl implements AccountActivityRepository{

	@Override
	public int openAccount(AccountInfo info) {
		int opened = 0;
		try(PreparedStatement st = DbUtil.getConnection().prepareStatement(QueryUtil.OPEN_ACCOUNT)){
			st.setString(1, info.getAccountName());
			st.setString(2, info.getAddress());
			st.setString(3, info.getMobileNumber());
			opened = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return opened;
		
	}

	@Override
	public int deposit(AccountBalance account) {
		int deposited = 0;
		try(PreparedStatement st = DbUtil.getConnection().prepareStatement(QueryUtil.ADD_VALUE)){
			st.setInt(1, account.getAccountId());
			st.setDouble(2, account.getDepositAmount());
			st.setDouble(3, 0.0);
			st.setDouble(4, account.getTotalAmount() + account.getDepositAmount());
			deposited = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deposited;
	}

	@Override
	public int deposit(AccountBalance account, double interestMoney) {
		int deposited = 0;
		try(PreparedStatement st = DbUtil.getConnection().prepareStatement(QueryUtil.ADD_VALUE)){
			st.setInt(1, account.getAccountId());
			st.setDouble(2, account.getDepositAmount());
			st.setDouble(3, 0.0);
			st.setDouble(4, account.getTotalAmount() + account.getDepositAmount() + interestMoney);
			deposited = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return deposited;
	}

	@Override
	public int withdraw(AccountBalance account) {
		int withdrawn = 0;
		try(PreparedStatement st = DbUtil.getConnection().prepareStatement(QueryUtil.ADD_VALUE)){
			st.setInt(1, account.getAccountId());
			st.setDouble(2, 0.0);
			st.setDouble(3, account.getWithdrawAmount());
			st.setDouble(4, account.getTotalAmount() - account.getDepositAmount());
			withdrawn = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return withdrawn;
	}

	@Override
	public int withDraw(AccountBalance account, double fee) {
		int withdrawn = 0;
		try(PreparedStatement st = DbUtil.getConnection().prepareStatement(QueryUtil.ADD_VALUE)){
			st.setInt(1, account.getAccountId());
			st.setDouble(2, 0.0);
			st.setDouble(3, account.getWithdrawAmount());
			st.setDouble(4, account.getTotalAmount() - account.getDepositAmount() - fee);
			withdrawn = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return withdrawn;
	}

//	@Override
//	public AccountDetail accountInfo(int id) {
//		try(PreparedStatement st = DbUtil.getConnection().prepareStatement(QueryUtil.ACCOUNT_INFO)){
//			st.setInt(1, id);
//			ResultSet result =  st.executeQuery();
//			AccountDetail detail = new AccountDetail();
//			detail.getAccountBalance().setAccountId(result.getInt("accountId"));
//			detail.getAccountBalance().setDepositAmount(result.getDouble("depositAmt"));
//			detail.getAccountBalance().setWithdrawAmount(result.getDouble("withdrawAmt"));
//			detail.getAccountBalance().setTotalAmount(result.getDouble("totalBalance"));
//			detail.getAccountInfo().setAccountName(result.getString("accountName"));
//			detail.getAccountInfo().setAddress(result.getString("address"));
//			detail.getAccountInfo().setMobileNumber(result.getString("mobileNumber"));
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return detail;
//	}

}
