package com.capgemini.dto;

import java.io.Serializable;

import lombok.Data;

@Data
@SuppressWarnings("serial")
public class LoanApplicationDto implements Serializable{
	private String applicationId;
	private String loanType;
	private String timePeriod;
	private String interestRates;
	private String accountNo;
	private String applicantFirstName;
	private String applicantMiddleName;
	private String applicantLastName;
	private String dateOfBirthString;
	private String coapplicantFirstName;
	private String coapplicantMiddleName;
	private String coapplicantLastName;
	private String dateOfBirth;
	private String loanChoice;
	private String branchCode;
	private String branchName;
	private String openDate;
	private String requestDate;
	private String formStatus;
	
	public LoanApplicationDto(String applicationId, String accountNo, String applicantFirstName, String applicantMiddleName, String applicantLastName, String dateOfBirth,
			String coapplicantFirstName, String coapplicantMiddleName, String coapplicantLastName,
			String loanChoice, String branchCode, String branchName, String openDate, String requestDate, String formStatus) {
		super();
		this.applicationId = applicationId;
		this.accountNo = accountNo;
		this.applicantFirstName = applicantFirstName;
		this.applicantMiddleName = applicantMiddleName;
		this.applicantLastName = applicantLastName;
		this.dateOfBirth = dateOfBirth;
		this.coapplicantFirstName = coapplicantFirstName;
		this.coapplicantMiddleName = coapplicantMiddleName;
		this.coapplicantLastName = coapplicantLastName;
		this.loanChoice = loanChoice;
		this.branchCode = branchCode;
		this.branchName = branchName;
		this.openDate = openDate;
		this.requestDate = requestDate;
		this.formStatus = formStatus;
	}

}
