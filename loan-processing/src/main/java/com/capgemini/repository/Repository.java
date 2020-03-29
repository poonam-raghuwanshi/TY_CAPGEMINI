package com.capgemini.repository;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.capgemini.dto.CustomerDto;
import com.capgemini.dto.EmployeeDto;
import com.capgemini.dto.LoanApplicationDto;
import com.capgemini.dto.LoanTypeDto;

public class Repository {
	static Scanner scanner = new Scanner(System.in);
	public static final List<HashMap<String, Object>> clientList = new LinkedList<HashMap<String,Object>>();
	public static final List<HashMap<String, Object>> adminList = new LinkedList<HashMap<String, Object>>();
	public static final List<HashMap<String, Object>> customerList = new LinkedList<HashMap<String, Object>>();
	public static final List<HashMap<String, Object>> approvalDeptList = new LinkedList<HashMap<String, Object>>();
	public static final List<HashMap<String, Object>> mainList = new LinkedList<HashMap<String, Object>>();
	public static final List<HashMap<String, Object>> loanTypeList = new LinkedList<HashMap<String, Object>>();
	public static final List<HashMap<String, Object>> loanFormList = new LinkedList<HashMap<String, Object>>();
	public static final List<HashMap<String, Object>> employeeList = new LinkedList<HashMap<String,Object>>();
	public static void UserTable() {

		// Admins
		EmployeeDto bean1 = new EmployeeDto("mayank191", "ad01", "mayank.p@gmail.com", "pass1", "Mayank", "Singh",
				7618723945L, "admin");

		HashMap<String, Object> user1 = new LinkedHashMap<String, Object>();
		user1.put("userid", bean1.getUserid());
		user1.put("password", bean1.getPassword());
		user1.put("username", bean1.getUsername());
		user1.put("email", bean1.getEmail());
		user1.put("firstname", bean1.getFirstname());
		user1.put("lastname", bean1.getLastname());
		user1.put("phone", bean1.getPhone());
		user1.put("role", bean1.getRole());
		adminList.add(user1);
		mainList.add(user1);
		employeeList.add(user1);

		EmployeeDto bean2 = new EmployeeDto("ritam191", "ad02", "ritam.p@gmail.com", "pass2", "Ritam", "Roy", 7618721134L,
				"admin");
		HashMap<String, Object> user2 = new LinkedHashMap<String, Object>();
		user2.put("userid", bean2.getUserid());
		user2.put("password", bean2.getPassword());
		user2.put("username", bean2.getUsername());
		user2.put("email", bean2.getEmail());
		user2.put("firstname", bean2.getFirstname());
		user2.put("lastname", bean2.getLastname());
		user2.put("phone", bean2.getPhone());
		user2.put("role", bean2.getRole());
		adminList.add(user2);
		mainList.add(user2);
		employeeList.add(user2);

		EmployeeDto bean3 = new EmployeeDto("amlan191", "ad03", "amlan.p@gmail.com", "pass3", "Amlan", "Dutta", 7612321135L,
				"admin");
		HashMap<String, Object> user3 = new LinkedHashMap<String, Object>();
		user3.put("userid", bean3.getUserid());
		user3.put("password", bean3.getPassword());
		user3.put("username", bean3.getUsername());
		user3.put("email", bean3.getEmail());
		user3.put("firstname", bean3.getFirstname());
		user3.put("lastname", bean3.getLastname());
		user3.put("phone", bean3.getPhone());
		user3.put("role", bean3.getRole());
		adminList.add(user3);
		mainList.add(user3);
		employeeList.add(user3);

		EmployeeDto bean4 = new EmployeeDto("rahul191", "ad04", "rahul.p@gmail.com", "pass4", "Rahul", "Yadav", 7618711678L,
				"admin");
		HashMap<String, Object> user4 = new LinkedHashMap<String, Object>();
		user4.put("userid", bean4.getUserid());
		user4.put("password", bean4.getPassword());
		user4.put("username", bean4.getUsername());
		user4.put("email", bean4.getEmail());
		user4.put("firstname", bean4.getFirstname());
		user4.put("lastname", bean4.getLastname());
		user4.put("phone", bean4.getPhone());
		user4.put("role", bean4.getRole());
		adminList.add(user4);
		mainList.add(user4);
		employeeList.add(user4);

		EmployeeDto bean5 = new EmployeeDto("anand191", "ad05", "anand.p@gmail.com", "pass5", "Anand", "Sharma", 7618312345L,
				"admin");
		HashMap<String, Object> user5 = new LinkedHashMap<String, Object>();
		user5.put("userid", bean5.getUserid());
		user5.put("password", bean5.getPassword());
		user5.put("username", bean5.getUsername());
		user5.put("email", bean5.getEmail());
		user5.put("firstname", bean5.getFirstname());
		user5.put("lastname", bean5.getLastname());
		user5.put("phone", bean5.getPhone());
		user5.put("role", bean5.getRole());
		adminList.add(user5);
		mainList.add(user5);
		employeeList.add(user5);

		// Customer.
		CustomerDto bean6 = new CustomerDto("manoj191", "cus01", "manoj.p@gmail.com", "pass6", "Manoj", "Sharma",
				7613412385L, "customer", 90987.12, 60890);
		HashMap<String, Object> user6 = new LinkedHashMap<String, Object>();
		user6.put("userid", bean6.getUserid());
		user6.put("password", bean6.getPassword());
		user6.put("username", bean6.getUsername());
		user6.put("email", bean6.getEmail());
		user6.put("firstname", bean6.getFirstname());
		user6.put("lastname", bean6.getLastname());
		user6.put("phone", bean6.getPhone());
		user6.put("AccountBal", bean6.getAccountBal());
		user6.put("role", bean6.getRole());
		user6.put("loanAmount", bean6.getLoanAmount());
		customerList.add(user6);
		mainList.add(user6);

		CustomerDto bean7 = new CustomerDto("shreya191", "cus02", "shreya.p@gmail.com", "pass7", "Shreya", "Singh",
				7613423385L, "customer", 60987.2, 90700);
		HashMap<String, Object> user7 = new LinkedHashMap<String, Object>();
		user7.put("userid", bean7.getUserid());
		user7.put("password", bean7.getPassword());
		user7.put("username", bean7.getUsername());
		user7.put("email", bean7.getEmail());
		user7.put("firstname", bean7.getFirstname());
		user7.put("lastname", bean7.getLastname());
		user7.put("phone", bean7.getPhone());
		user7.put("AccountBal", bean7.getAccountBal());
		user7.put("role", bean7.getRole());
		user7.put("loanAmount", bean7.getLoanAmount());
		customerList.add(user7);
		mainList.add(user7);

		CustomerDto bean8 = new CustomerDto("senku191", "cus03", "senku.p@gmail.com", "pass8", "Senku", "Manohar",
				7613412345L, "customer", 103567.2, 60000);
		HashMap<String, Object> user8 = new LinkedHashMap<String, Object>();
		user8.put("userid", bean8.getUserid());
		user8.put("password", bean8.getPassword());
		user8.put("username", bean8.getUsername());
		user8.put("email", bean8.getEmail());
		user8.put("firstname", bean8.getFirstname());
		user8.put("lastname", bean8.getLastname());
		user8.put("phone", bean8.getPhone());
		user8.put("AccountBal", bean8.getAccountBal());
		user8.put("role", bean8.getRole());
		user8.put("loanAmount", bean8.getLoanAmount());
		customerList.add(user8);
		mainList.add(user8);

		CustomerDto bean9 = new CustomerDto("tarushi191", "cus04", "tarushi.p@gmail.com", "pass9", "Tarushi", "Verma",
				7613423445L, "customer", 37657.0, 30000);
		HashMap<String, Object> user9 = new LinkedHashMap<String, Object>();
		user9.put("userid", bean9.getUserid());
		user9.put("password", bean9.getPassword());
		user9.put("username", bean9.getUsername());
		user9.put("email", bean9.getEmail());
		user9.put("firstname", bean9.getFirstname());
		user9.put("lastname", bean9.getLastname());
		user9.put("phone", bean9.getPhone());
		user9.put("AccountBal", bean9.getAccountBal());
		user9.put("role", bean9.getRole());
		user9.put("loanAmount", bean9.getLoanAmount());
		customerList.add(user9);
		mainList.add(user9);

		CustomerDto bean10 = new CustomerDto("poonam191", "cus05", "poonam.p@gmail.com", "pass10", "Poonam", "Raghuwanshi",
				7613423490L, "customer", 78985.8, 78000);
		HashMap<String, Object> user10 = new LinkedHashMap<String, Object>();
		user10.put("userid", bean10.getUserid());
		user10.put("password", bean10.getPassword());
		user10.put("username", bean10.getUsername());
		user10.put("email", bean10.getEmail());
		user10.put("firstname", bean10.getFirstname());
		user10.put("lastname", bean10.getLastname());
		user10.put("phone", bean10.getPhone());
		user10.put("AccountBal", bean10.getAccountBal());
		user10.put("role", bean10.getRole());
		user10.put("loanAmount", bean10.getLoanAmount());
		customerList.add(user10);
		mainList.add(user10);

		// LoanApprovalDepartment
		EmployeeDto bean11 = new EmployeeDto("saswat191", "lad01", "Saswat.p@gmail.com", "pass11", "Saswat", "Biswas",
				7613424567L, "L.A.D");
		HashMap<String, Object> user11 = new LinkedHashMap<String, Object>();
		user11.put("userid", bean11.getUserid());
		user11.put("password", bean11.getPassword());
		user11.put("username", bean11.getUsername());
		user11.put("email", bean11.getEmail());
		user11.put("firstname", bean11.getFirstname());
		user11.put("lastname", bean11.getLastname());
		user11.put("phone", bean11.getPhone());
		user11.put("role", bean11.getRole());
		approvalDeptList.add(user11);
		mainList.add(user11);
		employeeList.add(user11);

		EmployeeDto bean12 = new EmployeeDto("shrawani191", "lad02", "shrawani.p@gmail.com", "pass12", "Shrawani", "Rowdy",
				7613423445L, "L.A.D");
		HashMap<String, Object> user12 = new LinkedHashMap<String, Object>();
		user12.put("userid", bean12.getUserid());
		user12.put("password", bean12.getPassword());
		user12.put("username", bean12.getUsername());
		user12.put("email", bean12.getEmail());
		user12.put("firstname", bean12.getFirstname());
		user12.put("lastname", bean12.getLastname());
		user12.put("phone", bean12.getPhone());
		user12.put("role", bean12.getRole());
		approvalDeptList.add(user12);
		mainList.add(user12);
		employeeList.add(user12);

		EmployeeDto bean13 = new EmployeeDto("divya191", "lad03", "divya.p@gmail.com", "pass13", "Divya", "Somaraju",
				7613423490L, "L.A.D");
		HashMap<String, Object> user13 = new LinkedHashMap<String, Object>();
		user13.put("userid", bean13.getUserid());
		user13.put("password", bean13.getPassword());
		user13.put("username", bean13.getUsername());
		user13.put("email", bean13.getEmail());
		user13.put("firstname", bean13.getFirstname());
		user13.put("lastname", bean13.getLastname());
		user13.put("phone", bean13.getPhone());
		user13.put("role", bean13.getRole());
		approvalDeptList.add(user13);
		mainList.add(user13);
		employeeList.add(user3);

		// LoanTable
		LoanTypeDto loanBean1 = new LoanTypeDto("House Loan", "20 years(Max)", "9.75-10.25%");
		HashMap<String, Object> loan1 = new LinkedHashMap<String, Object>();
		loan1.put("Type", loanBean1.getLoanType());
		loan1.put("Time-Period", loanBean1.getTimePeriod());
		loan1.put("Interest-Rates", loanBean1.getInterestRates());
		loanTypeList.add(loan1);

		LoanTypeDto loanBean2 = new LoanTypeDto("Vehicle Loan", "36 months - 60 months(Max)", "11.0-14.75%");
		HashMap<String, Object> loan2 = new LinkedHashMap<String, Object>();
		loan2.put("Type", loanBean2.getLoanType());
		loan2.put("Time-Period", loanBean2.getTimePeriod());
		loan2.put("Interest-Rates", loanBean2.getInterestRates());
		loanTypeList.add(loan2);

		LoanTypeDto loanBean3 = new LoanTypeDto("Educational Loan", "5 years(Max)", "11.5-12.50%");
		HashMap<String, Object> loan3 = new LinkedHashMap<String, Object>();
		loan3.put("Type", loanBean3.getLoanType());
		loan3.put("Time-Period", loanBean3.getTimePeriod());
		loan3.put("Interest-Rates", loanBean3.getInterestRates());
		loanTypeList.add(loan3);

		LoanTypeDto loanBean5 = new LoanTypeDto("Payday Loan", "1 month(Max)", "20.75-23.0%");
		HashMap<String, Object> loan5 = new LinkedHashMap<String, Object>();
		loan5.put("Type", loanBean5.getLoanType());
		loan5.put("Time-Period", loanBean5.getTimePeriod());
		loan5.put("Interest-Rates", loanBean5.getInterestRates());
		loanTypeList.add(loan5);

		LoanTypeDto loanBean6 = new LoanTypeDto("Personal Loan", "5 years(Max)", "12.0-12.50%");
		HashMap<String, Object> loan6 = new LinkedHashMap<String, Object>();
		loan6.put("Type", loanBean6.getLoanType());
		loan6.put("Time-Period", loanBean6.getTimePeriod());
		loan6.put("Interest-Rates", loanBean6.getInterestRates());
		loanTypeList.add(loan6);

		// System.out.println(" ");
		// System.out.println(" ");
		// for (int i = 0; i < loanTypeList.size(); i++) {
		// System.out.println(loanTypeList.get(i));
		// }

		LoanApplicationDto loanApplicationForm1 = new LoanApplicationDto("AP01", "BNI12345", "Mayank", "Singh", "", "14/3/1973", "Meghna", "Singh", "",
				"Personal Loan", "BNI22343456", "Cannaught Circle", "09/12/1992", "23/5/2020", "approved");
		HashMap<String, Object> form1 = new LinkedHashMap<String, Object>();
		form1.put("ApplicationId", loanApplicationForm1.getApplicationId());
		form1.put("AccountNo", loanApplicationForm1.getAccountNo());
		form1.put("ApplicantName", loanApplicationForm1.getApplicantFirstName() + " "
				+ loanApplicationForm1.getApplicantMiddleName() + " " + loanApplicationForm1.getApplicantLastName());
		form1.put("DateOfBirth", loanApplicationForm1.getDateOfBirth());
		form1.put("CoApplicantName",
				loanApplicationForm1.getCoapplicantFirstName() + " " + loanApplicationForm1.getCoapplicantMiddleName()
				+ " " + loanApplicationForm1.getCoapplicantLastName());
		form1.put("LoanType", loanApplicationForm1.getLoanChoice());
		form1.put("BranchCode", loanApplicationForm1.getBranchCode());
		form1.put("BranchName", loanApplicationForm1.getBranchName());
		form1.put("OpenDate", loanApplicationForm1.getOpenDate());
		form1.put("RequestDate", loanApplicationForm1.getRequestDate());
		form1.put("LoanStatus", loanApplicationForm1.getFormStatus());
		loanFormList.add(form1);
		clientList.add(form1);

		LoanApplicationDto loanApplicationForm2 = new LoanApplicationDto("AP02", "BNI22345", "Shashank", "Singh", "", "14/3/1973", "Shiv", "Kumar", "Rajput",
				"Vehicle Loan", "BNI33343456", "Cannaught Bank", "12-11-2011", "02-4-2020", "rejected");
		HashMap<String, Object> form2 = new LinkedHashMap<String, Object>();
		form2.put("ApplicationId", loanApplicationForm2.getApplicationId());
		form2.put("AccountNo", loanApplicationForm2.getAccountNo());
		form2.put("ApplicantName", loanApplicationForm2.getApplicantFirstName() + " "
				+ loanApplicationForm2.getApplicantMiddleName() + " " + loanApplicationForm2.getApplicantLastName());
		form2.put("DateOfBirth",loanApplicationForm2.getDateOfBirth());
		form2.put("CoApplicantName",
				loanApplicationForm2.getCoapplicantFirstName() + " " + loanApplicationForm2.getCoapplicantMiddleName()
				+ " " + loanApplicationForm2.getCoapplicantLastName());
		form2.put("LoanType", loanApplicationForm2.getLoanChoice());
		form2.put("BranchCode", loanApplicationForm2.getBranchCode());
		form2.put("BranchName", loanApplicationForm2.getBranchName());
		form2.put("OpenDate", loanApplicationForm2.getOpenDate());
		form2.put("RequestDate", loanApplicationForm2.getRequestDate());
		form2.put("LoanStatus", loanApplicationForm2.getFormStatus());
		loanFormList.add(form2);

		LoanApplicationDto loanApplicationForm3 = new LoanApplicationDto("AP03", "BNI21145", "Rahul", "Yadav", "", "14/3/1973", "Anjali", "Kumari", "",
				"Property Loan", "BNI13311456", "Purani Delhi", "03-08-1920", "01-4-2020", "requested");
		HashMap<String, Object> form3 = new LinkedHashMap<String, Object>();
		form3.put("ApplicationId", loanApplicationForm3.getApplicationId());
		form3.put("AccountNo", loanApplicationForm3.getAccountNo());
		form3.put("ApplicantName", loanApplicationForm3.getApplicantFirstName() + " "
				+ loanApplicationForm3.getApplicantMiddleName() + " " + loanApplicationForm3.getApplicantLastName());
		form3.put("DateOfBirth", loanApplicationForm3.getDateOfBirth());
		form3.put("CoApplicantName",
				loanApplicationForm3.getCoapplicantFirstName() + " " + loanApplicationForm3.getCoapplicantMiddleName()
				+ " " + loanApplicationForm3.getCoapplicantLastName());
		form3.put("LoanType", loanApplicationForm3.getLoanChoice());
		form3.put("BranchCode", loanApplicationForm3.getBranchCode());
		form3.put("BranchName", loanApplicationForm3.getBranchName());
		form3.put("OpenDate", loanApplicationForm3.getOpenDate());
		form3.put("RequestDate", loanApplicationForm3.getRequestDate());
		form3.put("LoanStatus", loanApplicationForm3.getFormStatus());
		loanFormList.add(form3);
	}
}