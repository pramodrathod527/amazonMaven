package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyLinkCreateNewAccount {
	
	@FindBy(xpath="//a[@id='terms-link']")
	private WebElement termsLink;
	
	@FindBy(xpath="//a[@id='privacy-link']")
	private WebElement privacyLink;
	
	@FindBy(xpath="//a[@id='cookie-use-link']")
	private WebElement cookieLink;
	
	
	private WebDriver driver;
	public VerifyLinkCreateNewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public void clickTermsLink() {
		termsLink.click();
	}
	
	public void clickPrivacyLink() {
		privacyLink.click();
	}
	
	public void clickCookieLink() {
		cookieLink.click();
	}
	
	

}
