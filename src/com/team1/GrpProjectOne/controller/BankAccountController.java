package com.team1.GrpProjectOne.controller;

import javax.swing.JOptionPane;

import com.team1.GrpProjectOne.AccountActivityRepository.AccountActivityRepository;
import com.team1.GrpProjectOne.AccountActivityRepositoryImpl.AccountActivityRepositoryImpl;
import com.team1.GrpProjectOne.model.AccountBalance;
import com.team1.GrpProjectOne.model.AccountInfo;

public class BankAccountController {
	
	public static final int FEE = 3;
	public static final int INTEREST = 8;
	public static void main(String[] args) {
		System.out.println("This is the main client page.");
		System.out.println("this change is from mehool");
		AccountActivityRepository _accActRepo = new AccountActivityRepositoryImpl();
		AccountBalance account = new AccountBalance();
		String decision = "";
		do {
			String choice = JOptionPane.showInputDialog("Which peration do you want to perform?");
			switch (choice) {
			case "open":
				String accountName = JOptionPane.showInputDialog("Enter an account name: ");
				String address = JOptionPane.showInputDialog("Enter your address: ");
				String mobileNumber = JOptionPane.showInputDialog("Enter your mobile number: ");
				AccountInfo info = new AccountInfo();
				info.setAccountName(accountName);
				info.setAddress(address);
				info.setMobileNumber(mobileNumber);
				
				int created = _accActRepo.openAccount(info);
				if(created >= 1) {
					JOptionPane.showMessageDialog(null, "Congratulations!! Account has been created.");
				}else {
					JOptionPane.showMessageDialog(null, "Sorry!! Couldnt create your account.");
				}
				
				break;
				
			case "withdraw":
				int _id = Integer.parseInt(JOptionPane.showInputDialog("Enter id: "));
				int cash = Integer.parseInt(JOptionPane.showInputDialog("The fee for each withdrawl is $3. Enter the amount you want to withdraw.")); 
				account.setWithdrawAmount(cash);
				account.setAccountId(_id);
				//int withdrawn  = _accActRepo.withdraw(account);
				int withdrawn  = _accActRepo.withDraw(account, FEE);
				if(withdrawn >= 1) {
					JOptionPane.showMessageDialog(null, cash + "$ has been withdrawn.");
				}else {
					JOptionPane.showMessageDialog(null, "Sorry!! Service unavailable. Couldnt withdraw money");
				}
				break;
				
			case "deposit":
				int id = Integer.parseInt(JOptionPane.showInputDialog("Enter id: "));
				int depositAmt = Integer.parseInt(JOptionPane.showInputDialog("The interest rate is 7%. Enter the amount you want to deposit."));
				account.setDepositAmount(depositAmt);
				account.setAccountId(id);
				//int deposited = _accActRepo.deposit(account);
				int deposited = _accActRepo.deposit(account, INTEREST);
				if(deposited >= 1) {
					JOptionPane.showMessageDialog(null, depositAmt + "$ has been deposited to your accoiunt.");
				}else {
					JOptionPane.showMessageDialog(null, "Sorry!! Service unavailable. Couldnt deposit money");
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Wrong choice!");
				break;
			}
			decision = JOptionPane.showInputDialog("Do you want to perform next operation?");
			
		}while(decision.equalsIgnoreCase("yes"));

		JOptionPane.showMessageDialog(null, "Thank you! Visit us again.");
	}

}
