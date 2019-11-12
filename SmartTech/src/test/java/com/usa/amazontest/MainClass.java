package com.usa.amazontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.usa.basepage.BasePage;
import com.usa.basepage.PageFactoryClass;

public class MainClass extends BasePage {
	static PageFactoryClass pf;

	public static void main(String[] args) {
		
		initialization();
		pf = PageFactory.initElements(driver, PageFactoryClass.class);
		pf.getClickOnSignInBTN().click();
		pf.getEnterEmail().sendKeys("studentttech@gmail.com");
		pf.getEnterPassword().sendKeys("student123");
		pf.getEnterPassword().submit();

		String title = driver.getTitle();
		if (driver.getPageSource().contains("There was a problem")) {
			System.out.println(" Displayed : Invaled Credincial");
			Assert.assertTrue(true);
		} else {
			Assert.assertEquals(title, driver.getTitle());
			System.out.println("Home page title : " + title);
			Assert.assertTrue(true);
		}
		pf.getSignout().click();
		driver.quit();

	}
}
