package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaLoginPage {

	
	@FindBy(xpath="//input[@id='userid']")private WebElement userID;
	@FindBy(xpath="//input[@id='password']")private WebElement password ;
	@FindBy(xpath="//button[@type='submit']")private WebElement login;
	@FindBy(xpath="//a[@class='text-light forgot-link']")private WebElement forgot;
	@FindBy(xpath="c")private WebElement signup;
	
	
	public ZerodhaLoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
public void EnteruserName (String user) {
	  userID.sendKeys(user);
	
}
	
	public void enterPasswowrd(String pass) {
		
		password.sendKeys(pass);
		}
	
	public void clickonlogin() {
		
	login.click();
		}
	
	public void clickOnFogotoPassword() {
		
	forgot.click();;
		}
	
	public void clickonSignUp() {
		
		signup.click();;
		}
			
}
