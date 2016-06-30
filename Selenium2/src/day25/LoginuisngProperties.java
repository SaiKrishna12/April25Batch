package day25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginuisngProperties {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/index.php/dashboard");
		driver.manage().window().maximize();
	}
	@Test
	public void loginTest() throws IOException
	{
		FileInputStream file=new FileInputStream("E:\\April25Batch\\Selenium2\\OrangeHRM.properties");
		Properties pr=new Properties();
		pr.load(file);
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys("Admin");
		driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.cssSelector(pr.getProperty("login"))).click();
		
		
		
		
		
	}

}
