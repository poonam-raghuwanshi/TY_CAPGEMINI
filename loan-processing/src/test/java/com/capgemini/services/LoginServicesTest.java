package com.capgemini.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import com.capgemini.exception.DateLimitException;
import com.capgemini.exception.InvalidCredentialException;
import com.capgemini.exception.InvalidDateFormatException;
import com.capgemini.exception.InvalidEmailException;
import com.capgemini.exception.InvalidPasswordException;
import com.capgemini.exception.InvalidPhoneException;
import com.capgemini.repository.Repository;

class LoginServicesTest {

	LoginServicesImplementation implementation = new LoginServicesImplementation();

	@Test
	void custLoginTest1() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.custLogin("manoj191", "pass6");
			assertEquals(isBoolean, true);
		} catch (Exception e) {

			assertThrows(InvalidCredentialException.class, () -> {
				implementation.custLogin("manoj191", "pass6");
			});
		}
	}

	@Test
	void custLoginTest2() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.custLogin("manojqwe191", "pass6");
			assertEquals(isBoolean, true);
		} catch (Exception e) {

			assertThrows(InvalidCredentialException.class, () -> {
				implementation.custLogin("manojqwe191", "pass6");
			});
		}
	}

	@Test
	void empLoginTest1() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.empLogin("mayank191", "pass1");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidCredentialException.class, () -> {
				implementation.empLogin("mayank191", "pass1");
			});
		}
	}

	@Test
	void empLoginTest2() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.empLogin("mayank191123", "pass1");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidCredentialException.class, () -> {
				implementation.empLogin("mayank191123", "pass1");
			});
		}
	}

	@Test
	void empLoginTest3() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.empLogin("saswat191", "pass11");
			assertEquals(isBoolean, true);
		} catch (Exception e) {
			assertThrows(InvalidCredentialException.class, () -> {
				implementation.empLogin("saswat191", "pass11");
			});
		}
	}

	@Test
	void registerTest1() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		}
	}

	@Test
	void registerTest2() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5-10-1996", "male", "Mayank123", "cus123",
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5-10-1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5-10-1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5-10-1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5-10-1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5-10-1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7681093264L, 50000.0);
			});
		}
	}
	
	@Test
	void registerTest3() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 76093264L, 50000.0);
			});
		}
	}
	
	@Test
	void registerTest4() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
					"mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123",
						"mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank123", "cus123", "mayank123@gmail.com", "Qwerty123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		}
	}
	
	@Test
	void registerTest5() {
		Repository.UserTable();
		try {
			Boolean isBoolean = implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123",
					"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
			assertEquals(isBoolean, true);
		} catch (DateLimitException e) {
			assertThrows(DateLimitException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidPhoneException e) {
			assertThrows(InvalidPhoneException.class, () -> {
				implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123",
						"mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidDateFormatException e) {
			assertThrows(InvalidPhoneException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidPasswordException e) {
			assertThrows(InvalidPasswordException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		} catch (InvalidEmailException e) {
			assertThrows(InvalidEmailException.class, ()->{
				implementation.register("businessman", "5/10/1996", "male", "Mayank@123", "cus123", "mayank123@gmail.com", "Qwerty@123", "Mayank", "Singh", 7611093264L, 50000.0);
			});
		}
	}

}
