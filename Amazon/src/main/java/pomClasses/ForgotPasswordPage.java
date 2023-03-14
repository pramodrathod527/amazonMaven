package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	@FindBy(xpath="//form[@id=\"identify_yourself_flow\"]/div/div[2]/div/table/tbody/tr/td[2]/div")
	private WebElement emailOrmobilNoText;
	
	@FindBy(xpath="//input[@id='identify_email']")
	private WebElement emailAddOrmobile;
	
	@FindBy(xpath="//a[text()='Cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//button[@id='did_submit']")
	private WebElement searchButton;
	
	
	public ForgotPasswordPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void VerifyEmailOrmobilNoText() {
		String outcomeText = emailOrmobilNoText.getText();
		
		
		String expectedText = "Please enter your email address or mobile number to search for your account.";
//		System.out.println(outcomeText);
//		System.out.println(expectedText);
//		"Please enter your email address or mobile number to search for your account."
//		Please enter your email address or mobile number to search for your account.
		if(outcomeText.contentEquals(expectedText)) {
			System.out.println("Text Matched!");
		}else {
			System.out.println("Unexpected Text!");
		}
	}
	
	public void sendEmailAddOrmobile() {
		emailAddOrmobile.sendKeys("pramodrathod528@gmail.com");
	}
	
	public void clickCancel() {
		cancelButton.click();;
	}
	
	public void clickSearch() {
		searchButton.click();;
	}
	
	

}
