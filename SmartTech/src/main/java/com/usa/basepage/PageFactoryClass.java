package com.usa.basepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryClass extends BasePage {

	@FindBy(xpath = "//*[contains(text(),'Hello')]")
	@CacheLookup
	private WebElement ClickOnSignInBTN;

	public WebElement getClickOnSignInBTN() {
		return ClickOnSignInBTN;
	}

	@FindBy(xpath = "//*[@id='ap_email']")
	@CacheLookup
	private WebElement EnterEmail;

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	@FindBy(xpath = "//*[@id='ap_password']")
	@CacheLookup
	private WebElement EnterPassword;

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	@FindBy(xpath = "//*[@id='nav-al-your-account']//*[contains(text(),'Sign Out')]")
	@CacheLookup
	private WebElement signout;

	public WebElement getSignout() {
		return signout;
	}

	// Initializing the Page Objects:
	public PageFactoryClass() {
		PageFactory.initElements(driver, this);
	}

	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
}