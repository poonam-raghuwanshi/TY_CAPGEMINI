package com.capgemini.dao;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.controller.AdminController;
import com.capgemini.controller.CustomerController;
import com.capgemini.controller.LADController;
import com.capgemini.exception.InvalidCredentialException;
import com.capgemini.repository.Repository;

public class LoginDAOImplementation implements LoginDAODeclaration{
	Logger logger = LogManager.getLogger(DAOImplementation.class);
	Repository repo = new Repository();

	@Override
	public boolean custLogin(String custUsername, String custPass) {

		if (Repository.customerList.isEmpty() != true) {
			for (int i = 0; i < Repository.customerList.size(); i++) {
				if (Repository.customerList.get(i).get("username").equals(custUsername)
						&& Repository.customerList.get(i).get("password").equals(custPass)) {
					logger.info("--------WELCOME " + custUsername + "---------");
					CustomerController.custController(custUsername);
					return true;
				}
			}
		} else
			System.out.println("XXXX No Users available XXXX");
			return false;
	}
	
	@Override
	public boolean empLogin(String empUsername, String empPass) {
		if (Repository.employeeList.isEmpty() != true) {
			for (int i = 0; i < Repository.employeeList.size(); i++) {
				if (Repository.employeeList.get(i).get("username").equals(empUsername)
						&& Repository.employeeList.get(i).get("password").equals(empPass)) {
					if (Repository.employeeList.get(i).get("role").equals("admin")) {
						logger.info("--------WELCOME " + empUsername + "--------");
						AdminController.adminCont();
						return true;
					} else
						logger.info("--------WELCOME " + empUsername + "--------");
					LADController.ladController();
					return true;
				}
			}
		} else
			System.out.println("XXXX No users available XXXX");
			return false;
	}
	
	@Override
	public boolean register(String occupation, String dob, String gender, String username, String userid, String email,
			String password, String firstname, String lastname, long phone, double accountBal) {
		HashMap<String, Object> regHashMap = new LinkedHashMap<String, Object>();
		regHashMap.put("userid", userid);
		regHashMap.put("password", password);
		regHashMap.put("username", username);
		regHashMap.put("email", email);
		regHashMap.put("firstname", firstname);
		regHashMap.put("lastname", lastname);
		regHashMap.put("phone", phone);
		regHashMap.put("AccountBal", accountBal);
		regHashMap.put("role", "customer");
		regHashMap.put("loanAmount", 0);
		Repository.customerList.add(regHashMap);
		Repository.mainList.add(regHashMap);
		return true;
	}
}