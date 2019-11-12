package com.usa.amazontest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel_TestNG {

  @Test
   public void getChorme1() {
   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
   System.out.println("Chrome Thread : " + Thread.currentThread().getId());
   WebDriver driver = new ChromeDriver();
   driver.get("https://coc.ams1907.com/pmci/facade/home");
   driver.close();}
   
   
  @Test
   public void getChorme2() {
   System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
   System.out.println("Chrome Thread : " + Thread.currentThread().getId());
   WebDriver driver = new ChromeDriver();
   driver.get("https://coc.ams1907.com/pmci/facade/home");
   driver.close();}

   //@Test
   public void getIEDriver() {
	System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	System.out.println("Firefox Thread : " + Thread.currentThread().getId());
	WebDriver driver = new FirefoxDriver();
   driver.get("https://coc.ams1907.com/pmci/facade/home");
   driver.close();}}