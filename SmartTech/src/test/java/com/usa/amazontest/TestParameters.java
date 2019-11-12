package com.usa.amazontest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParameters {
	
	/*
	 * TestNG allows the user to pass values to test methods as arguments by using
	 * parameter annotations through testng.xml file. Some times it may be required
	 * for us to pass values to test methods during run time. Like we can pass user
	 * name and password through testng.xml instead of hard coding it in
	 * test methods. or we can pass browser name as parameter to execute in specific
	 * browser.
	 */
	
	@Parameters({ "browser" })
	@Test
	public void testCaseOne(String browser) {
		System.out.println("browser passed as :- " + browser);
	}

	@Parameters({ "username", "password" })
	@Test
	public void testCaseTwo(String username, String password) {
		System.out.println("Parameter for User Name passed as :- " + username);
		System.out.println("Parameter for Password passed as :- " + password);
	}
}