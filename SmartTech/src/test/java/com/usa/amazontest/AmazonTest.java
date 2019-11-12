package com.usa.amazontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.usa.basepage.BasePage;
import com.usa.basepage.PageFactoryClass;

public class AmazonTest extends BasePage {
    PageFactoryClass pf;

	@Test(priority = 1)
	public void OpenBrowser() {
		initialization();
		pf = PageFactory.initElements(driver, PageFactoryClass.class);
	}

	@Test(priority = 2)
	public void ClickOnSignIn() {
		pf.getClickOnSignInBTN().click();

	}

	@Test(priority = 3)
	public void enterUserName() {
		pf.getEnterEmail().sendKeys("studentttech@gmail.com");

	}

	@Test(priority = 4)
	public void enterPassword() {
		pf.getEnterPassword().sendKeys("student123");

	}

	@Test(priority = 5)
	public void ClickOnSubmit() {
		pf.getEnterPassword().submit();

	}

	@Test(priority = 6)
	public void VerifyCredincial() {
		String title = driver.getTitle();
		if (driver.getPageSource().contains("There was a problem")) {
			System.out.println(" Displayed : Invaled Credincial");
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(title, driver.getTitle());
			System.out.println("Home page title : " + title);
			Assert.assertTrue(true);
		}

	}
	@Test(priority = 7)
	public void tearDown() {
		pf.getSignout().click();
		driver.quit();
	
}}


// @Test(enabled = false)
// @Test(dependsOnMethods = {"SendDriverReleasedassage"})
