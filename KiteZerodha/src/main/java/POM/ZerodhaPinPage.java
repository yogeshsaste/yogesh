package POM;

import java.awt.Desktop.Action;

import org.apache.poi.xdgf.usermodel.section.geometry.MoveTo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaPinPage {

	
	@FindBy (xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy (xpath = "//button[@type='submit']")private WebElement submit;
	@FindBy (xpath= "//input[@autocomplete='off']") private WebElement search;
	@FindBy (xpath= "(//button[@type=\"button\"])[1]") private WebElement buy;
	@FindBy (xpath="(//span[@class=\"tradingsymbol\"])[1]") private WebElement tata;
	@FindBy (xpath="(//input[@type='number'])[1]") private WebElement qty;
	@FindBy (xpath="//button[@type='submit']") private WebElement Sharebuy;
	//button[@type='submit']

	public ZerodhaPinPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
			
	}

	public void EnterPinNumber(String pinnumber) {
		
		pin.sendKeys(pinnumber);
	}
	
	public void ClickOnSubmit() {
		
		submit.click();	
	}
	
	public void clickOnSearch(WebDriver driver) {
		
		search.sendKeys("tatamotors");
		Actions action = new Actions(driver);
		action.moveToElement(tata).perform();
		
	}
	public void clickOnBuyButton (WebDriver driver) {
		
			Actions action = new Actions(driver);
			
			action.moveToElement(buy).perform();
			
			action.click(buy).perform();
	}
	public void EnterQtyOfShare () {
		qty.sendKeys("2");
		
	}
	public void clickonbuy() {
		
		Sharebuy.click();
	}
}
