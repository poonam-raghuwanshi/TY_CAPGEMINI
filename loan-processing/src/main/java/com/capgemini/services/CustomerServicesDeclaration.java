package com.capgemini.services;

public interface CustomerServicesDeclaration {
	public boolean viewLoanPrograms();
	public boolean changePassword(String custUsername, String newPass);
	public boolean checkBalance(String custUsername);
	public boolean loanApplicationForm(String applicationId, String accountNo, String applicantFirstName,
			String applicantMiddleName, String applicantLastName, String dateOfBirth, String coapplicantFirstName,
			String coapplicantMiddleName, String coapplicantLastName, String loanChoice, String branchCode,
			String branchName, String openDate, String requestDate, String sub);
	public boolean payLoan(String custUsername, Double loanPay);
	public boolean checkLoan(String custUsername);
}
