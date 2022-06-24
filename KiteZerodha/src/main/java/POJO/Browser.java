package POJO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
public static WebDriver openbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Yogesh\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		return (driver);
		
		
	
	
	
	}
	
	
}


