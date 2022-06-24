package Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POJO.Browser;
import POM.ZerodhaLoginPage;
import POM.ZerodhaPinPage;
import Utility.Parametrization;
import Utility.Screenshot;

public class Testone {

	
	public class LoginTestPage{
	
		WebDriver driver;
	
	

	@BeforeMethod
	
	public void browser()
	{
	driver=Browser.openbrowser();
	}
	
	@Test
	public void loginWithCredentialTest() throws Exception {
		
	    
		ZerodhaLoginPage obj = new ZerodhaLoginPage(driver);
		String userName = Parametrization.getdata("one", 0, 0);
		String password = Parametrization.getdata("one", 0, 1);
		System.out.println(userName);
		System.out.println(password);
		obj.EnteruserName(userName);
		obj.enterPasswowrd(password);
		obj.clickonlogin();
		ZerodhaPinPage obj1 = new ZerodhaPinPage (driver);
		String pinnumber =Parametrization.getdata("one", 0, 2);
		System.out.println(pinnumber);
		obj1.EnterPinNumber(pinnumber);
		obj1.ClickOnSubmit();
		Thread.sleep(2000);
		Screenshot.screenshot(driver);
		
		
		obj1.clickOnSearch(driver);
		obj1.clickOnBuyButton(driver);
		obj1.EnterQtyOfShare();
		obj1.clickonbuy();
		Screenshot.screenshot(driver);
		}
	
	
}
}
