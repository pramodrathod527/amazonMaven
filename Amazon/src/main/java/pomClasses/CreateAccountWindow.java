package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountWindow {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobileNoOrEmail;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement newPassword;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement dayOfBirth;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement monthOfBirth;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement yearOfBirth;
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement femaleGender;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement maleGender;
	
	@FindBy(xpath="//label[text()='Custom']")
	private WebElement customGender;
	

	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signUpButton;
	
	
	
	
	private WebDriver driver;
	private Actions action;
	
	public CreateAccountWindow(WebDriver driver) {
		PageFactory.initElements(driver,this);
		this.driver = driver;
		action = new Actions(this.driver);
		
		
	}
	
	public void sendFirstName() { 
		action.click(firstName).sendKeys("Pramod").build().perform();
	}
	
	public void sendSurName() { 
		action.click(surName).sendKeys("Rathod").build().perform();
		
	}
	
	public void sendMobileNoOrEmail() { 
		action.click(mobileNoOrEmail).sendKeys("9168729713").build().perform();
	}
	
	public void sendNewPassword() { 
		action.click(newPassword).sendKeys("Pramod123").build().perform();
		
	}
	
	
	
	
	public void selectDayOfBirth() {
		
		Select select = new Select(dayOfBirth) ;
		int size_of_Day = select.getOptions().size();
		
		for(int i=0;i<size_of_Day;i++) {
			select.selectByIndex(i);
		}
	}
	
public void selectMonthOfBirth() {
		
		Select select = new Select(monthOfBirth) ;
		int size_of_Day = select.getOptions().size();
		
		for(int i=0;i<size_of_Day;i++) {
			select.selectByIndex(i);
		}
	}
	
public void selectYearOfBirth() {
	
	Select select = new Select(yearOfBirth) ;
	int size_of_Day = select.getOptions().size();
	
	for(int i=0;i<size_of_Day;i++) {
		select.selectByIndex(i);
	}
}
	
	public void selectFemaleGender() { 
		action.moveToElement(femaleGender).click().build().perform();
	}
	
	public void selectMaleGender() { 
		action.moveToElement(maleGender).click().build().perform();
	}
	
	public void selectCustomGender() { 
		action.moveToElement(customGender).click().build().perform();
	}
	
	public void clickSignUpButton() {
		action.moveToElement(signUpButton).click().build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
