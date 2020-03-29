package com.capgemini.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.factory.FactoryClass;

public class AdminController {

	public static void adminCont() {
		// Repository.UserTable();
		Logger logger = LogManager.getLogger(AdminController.class);
		boolean exit = false;
		boolean exit2 = false;
		boolean exit3 = false;
		boolean exit4 = false;
		while (exit != true) {
			logger.info("Admin Operations");
			logger.info("1> Loan Programs: ");
			logger.info("2> Client Manager ");
			logger.info("3> Loan Reports: ");
			logger.info("4> Logout");
			logger.info("Enter the choice: ");
			int ch = Login.scanner.nextInt();
			Login.scanner.nextLine();
			switch (ch) {
			case 1:
				try {
					while (exit2 != true) {
						logger.info("1> Insert in Loan programs: ");
						logger.info("2> Delete in Loan programs: ");
						logger.info("3> Update in Loan programs: ");
						logger.info("4> View the loan programs: ");
						logger.info("5> Check other operations: ");
						logger.info("enter the choice: ");
						int choice = Login.scanner.nextInt();
						Login.scanner.nextLine();
						switch (choice) {
						case 1:
							logger.info("Enter the Loan Type: ");
							String type = Login.scanner.nextLine();
							logger.info("enter the Time period: ");
							String time = Login.scanner.nextLine();
							logger.info("enter the Interest rates: ");
							String rates = Login.scanner.nextLine();
							FactoryClass.getAdminServices().insertLoan(type, time, rates);
							break;

						case 2:
							logger.info("enter the loan type you want to delete: ");
							String loantype = Login.scanner.nextLine();
							FactoryClass.getAdminServices().deleteLoan(loantype);
							break;

						case 3:
							logger.info("enter the loan type: ");
							String typechoice = Login.scanner.nextLine();
							logger.info(typechoice);
							boolean close1 = false;
							while (close1 != true) {
								logger.info("what detail you want to update?");
								logger.info("1> Type ");
								logger.info("2> Time-Period");
								logger.info("3> Interest-Rates");
								logger.info("4> Exit");
								logger.info("enter choice:-");
								int choice2 = Login.scanner.nextInt();
								Login.scanner.nextLine();
								if (choice2 == 4) {
									close1 = true;
									break;
								}
								logger.info("enter the new value: ");
								String choice3 = Login.scanner.nextLine();
								FactoryClass.getAdminServices().loanUpdate(typechoice, choice2, choice3);
								if (choice2 == 1) {
									typechoice = choice3;
								}
							}
							break;

						case 4:
							FactoryClass.getAdminServices().viewLoanPrograms();
							break;

						case 5:
							exit2 = true;
							break;

						default:
							System.out.println("Wrong choice.");
							break;
						}
					}
				} catch (Exception e) {
					logger.info(e);
				}
				break;
			case 2:
				try {
					while (exit3 != true) {
						logger.info("1> Add Clients: ");
						logger.info("2> View Clients: ");
						logger.info("3> Check other operations: ");
						logger.info("Choose one:-");
						int ch3 = Login.scanner.nextInt();
						Login.scanner.nextLine();
						switch (ch3) {
						case 1:
							System.out.println("Enter the applicationId of client you want to add: ");
							String appidString = Login.scanner.nextLine();
							FactoryClass.getAdminServices().addClients(appidString);
							break;
						case 2:
							System.out.println("Clients:-");
							FactoryClass.getAdminServices().viewClients();
							break;
						case 3:
							exit3 = true;
							break;
						default:
							break;
						}
					}
				} catch (Exception e) {
					logger.info(e);
				}
				break;
			case 3:
				while (exit4 != true) {
					logger.info("Which report do you want to check: ");
					logger.info("1> Approved reports: ");
					logger.info("2> Rejected reports: ");
					logger.info("3> Requested reports: ");
					logger.info("4> Check other operations: ");
					int ch2 = Login.scanner.nextInt();
					Login.scanner.nextLine();
					switch (ch2) {
					case 1:
						logger.info("Approved application report:-");
						FactoryClass.getAdminServices().approvedForms();
						break;

					case 2:
						logger.info("Rejected application report:-");
						FactoryClass.getAdminServices().rejectedForms();
						break;

					case 3:
						logger.info("Requested application report:-");
						FactoryClass.getAdminServices().requestedForms();
						break;
					case 4:
						exit4 = true;
						break;
					default:
						logger.info("Invalid Option");
						break;
					}
				}
				break;
			case 4:
				exit = true;
				break;
			default:
				logger.info("Invalid Option");
				break;
			}
		}
	}
}
