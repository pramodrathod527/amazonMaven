package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginOrSignUpPage {

	// variable :WebElementv:Login or Sign Up Page
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailOrPhoneNo;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[text()='Forgotten account?']")
	private WebElement forgotPasswrodLink;
	
	@FindBy(xpath="//a[text()='Sign up for Facebook']")
	private WebElement createNewAccountButton;
	
	
	//Constructor : Intialization of WebElement : Login or Sign Up Page
	
	public LoginOrSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this); 
	}
	
	// Method : Action on WebElement : Login Or Sign Up Page
	
	public void sendemailOrphoneNo() {
		emailOrPhoneNo.sendKeys("pramodrathod527@gmail.com");
	}
	
	public void sendpassword() {
		password.sendKeys("12345");
	}
	
	public void clickloginButton() {
		loginButton.click();;
	}
	
	public void clickforgotPasswrodLink() {
		forgotPasswrodLink.click();;
	}
	
	public void openSignUpForm() {
		createNewAccountButton.click();
	}
	
	
	

}
