package com.capgemini.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.repository.Repository;

public class CustomerDAOImplementation implements CustomerDAODeclaration {
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();

	@Override
	public boolean viewLoanPrograms() {
		if (Repository.loanTypeList.size() != 0) {
			for (int k = 0; k < Repository.loanTypeList.size(); k++) {
				logger.info(Repository.loanTypeList.get(k));
			}
			return true;
		} else
			return false;
	}

	@Override
	public boolean loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub) {

		HashMap<String, Object> loanHashMap = new LinkedHashMap<String, Object>();
		loanHashMap.put("ApplicationId", applicationId);
		loanHashMap.put("AccountNo", accountNo);
		loanHashMap.put("ApplicantName", applicantFirstName + " " + applicantMiddleName + " " + applicantLastName);
		loanHashMap.put("CoapplicantName",
				coapplicantFirstName + " " + coapplicantMiddleName + " " + coapplicantLastName);
		loanHashMap.put("DateOfBirth", dateOfBirth);
		loanHashMap.put("LoanType", loanChoice);
		loanHashMap.put("BranchCode", branchCode);
		loanHashMap.put("BranchName", branchName);
		loanHashMap.put("OpenDate", openDate);
		loanHashMap.put("RequestDate", requestDate);
		loanHashMap.put("LoanStatus", "requested");
		switch (sub.toLowerCase()) {
		case "submit":
			Repository.loanFormList.add(loanHashMap);
			logger.info("Your loan application form has been submitted successfully.");
			return true;
		case "cancel":
			logger.info("Cancelled");
			return true;
		default:
			logger.info("Invalid option");
			return false;
		}
	}

	@Override
	public boolean changePassword(String custUsername, String newPass) {
		for (int j = 0; j < Repository.customerList.size(); j++) {
			if (custUsername.equals(Repository.customerList.get(j).get("username"))) {
				Repository.customerList.get(j).put("password", newPass);
				logger.info("Password has been changed successfully.");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkBalance(String custUsername) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				logger.info("Balance available: " + Repository.customerList.get(i).get("AccountBal"));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean payLoan(String custUsername, Double loanPay) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				Double loan = (Double) Repository.customerList.get(i).get("loanAmount");
//				if (loanPay > loan) {
//					throw new LoanExcessException("Enter amount less than your loan amount.");
//				}
				Double bal = (Double) Repository.customerList.get(i).get("AccountBal");
//				if (loanPay > (Double) Repository.customerList.get(i).get("AccountBal")) {
//					throw new InsufficientBalanceException("Insufficient balance in account.");
//				} else {
				logger.info("Amount paid successfully");
				Double newbal = bal - loanPay;
				Double newloan = loan - loanPay;
				Repository.customerList.get(i).put("AccountBal", newbal);
				Repository.customerList.get(i).put("loanAmount", newloan);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkLoan(String custUsername) {
		for (int i = 0; i < Repository.customerList.size(); i++) {
			if (custUsername.equals(Repository.customerList.get(i).get("username"))) {
				logger.info("Loan to pay: " + Repository.customerList.get(i).get("loanAmount"));
				return true;
			}
		}
		return false;
	}
}
