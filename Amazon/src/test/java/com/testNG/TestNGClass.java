package com.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

import pomClasses.CreateAccountWindow;
import pomClasses.LoginOrSignUpPage;
import pomClasses.VerifyLinkCreateNewAccount;

public class TestNGClass {
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Before Class");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get("https://www.facebook.com/login/");

		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		loginOrSignUpPage.openSignUpForm();
		
		System.out.println("before method");
	}
	
	
	@Test
	public void test() {
		
		VerifyLinkCreateNewAccount VerifyLinks = new VerifyLinkCreateNewAccount(driver);
		VerifyLinks.clickTermsLink();
		
		System.out.println("Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("After Method");
		driver.switchTo().defaultContent();
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
		driver.close();
	}
	
	
	

}
