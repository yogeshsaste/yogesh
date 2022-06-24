package Utility;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import POJO.Browser;

public class Screenshot {
	
	
public static void screenshot(WebDriver driver) throws IOException
{

		
	
	
	File source =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("C:\\Yogesh\\ScreenShot\\gmail.jpeg");
    FileHandler.copy(source, destination);
	return ;
	

}
}