package com.usa.amazontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssartionTest {

	
	@Test
	public void testCaseVerifyHomePage() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://coc.ams1907.com/pmci/facade/home");
		Assert.assertEquals("Enterprise Access Management", driver.getTitle());
	}
}
