package Cucumber.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	
	public static WebDriver getDriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "E:\\IQVIA\\TAF\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
