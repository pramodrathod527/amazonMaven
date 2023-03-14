package com.TestPomClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.CreateAccountWindow;
import pomClasses.LoginOrSignUpPage;

public class CreateNewAccount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Velocity Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		LoginOrSignUpPage loginOrSignUpPage = new LoginOrSignUpPage(driver);
		
		loginOrSignUpPage.openSignUpForm();
	
		CreateAccountWindow createAccountWindow = new CreateAccountWindow(driver);
		
		createAccountWindow.sendFirstName();
		
		createAccountWindow.sendSurName();
		createAccountWindow.sendMobileNoOrEmail();
		createAccountWindow.sendNewPassword();
		createAccountWindow.selectMaleGender();
		createAccountWindow.selectFemaleGender();
		createAccountWindow.selectCustomGender();
		createAccountWindow.selectMonthOfBirth();
		

	}

}
