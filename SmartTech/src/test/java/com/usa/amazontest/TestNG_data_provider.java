package com.usa.amazontest;

import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

public class TestNG_data_provider {
	
	/*
	 * Using the @DataProvider, we can create data driven framework in which the
	 * data is passed through the respective test method and several repetitions of
	 * the test run for the various test data values passed from the @DataProvider
	 * method. 
	 * An annotated method with @DataProvider annotation returns a 2D array
	 * or object. 
	 * The @DataProvider is another annotation that supports data-driven
	 * testing. 
	 * Using @Dataprovider annotation of TestNG method is also available in
	 * the same class. 
	 * Using @DataProvider annotation, the same test method can be
	 * run multiple times with different data sets. 
	 * Using the @DataProvider object, the database is read from excel or property files and so on. 
	 * DataProvider helps in sending many set data to a test method. But here we need to make
	 * sure the array given by the DataProvider must match the test method
	 * parameter.
	 */
	
	
	@DataProvider(name = "data-provider")
	public Object[][] dataProviderMethod() {
    return new Object[][] { { "1. Sandeep" }, { "2. Swapnil" }, { "3. Nisha" } };
	}

	@Test(dataProvider = "data-provider")
	public void testMethod(String data) {
    System.out.println("Data is: " + data);
	}
}