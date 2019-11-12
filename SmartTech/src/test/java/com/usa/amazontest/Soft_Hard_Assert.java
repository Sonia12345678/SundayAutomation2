package com.usa.amazontest;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class Soft_Hard_Assert {

	//Hard Assert
	//Soft Assert
	
	/* Hard Assert:
	 * 
	 * A Hard Assertion is a type of assertion that instantly throws an exception
	 * when a assert statement fails and continues with the next test in the test
	 * suite. 
	 * 
	 * To achieve this, we need to handle the Assertion error which is thrown
	 * with a catch block like the Java block. 
	 * 
	 * After the suit is completed, after completion of the execution, particular 
	 * test has been marked as passed instead of FAIL.
	 */
	
	
	/*
	 * Soft Assert: 
	 * 
	 * To deal with the disadvantage of Hard Assertions, a custom error
	 * handler provided by TestNG is called soft Assertion. 
	 * Soft Assertions is
	 * 
	 * definitely the assertions type that does not throw an exception when a
	 * assertion fails and continues in the next phase after the assert statement.
	 * 
	 * This is usually used when our test requires many assertions to execute and
	 * the user wants to execute all the assertions / code before failing / skipping
	 * the tests.
	 */
	
	String class_Name = "Soft_Hard_Assert";
	Assertion hardAssert = new Assertion();
	SoftAssert softAssert = new SoftAssert();

	@Test
	public void hardAssertMethod() {
		hardAssert.assertTrue(true == true);
		hardAssert.assertEquals("Soft_Hard_Assert", "Soft_Hard_Assert");
		hardAssert.assertEquals(class_Name, "Soft_Hard_Assert");
		System.out.println("hardAssertMethod Successfully passed!");
	}

	@Test
	public void softAssertionMethod() {
		softAssert.assertTrue(true == true);
		softAssert.assertEquals("Soft_Hard_Assert", "Soft_Hard_Assert");
		softAssert.assertEquals(class_Name, "Soft_Hard_Assert");
		System.out.println("softAssertionMethod Successfully passed!");
		softAssert.assertAll();
	}
}