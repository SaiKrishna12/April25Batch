package day26;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginKeywords {
	FirefoxDriver driver;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://opensource.demo.orangehrm.com/index.php/dashboard");
	}
	public void enterUsername()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public void enterPassword()
	{
		driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin");
	}
	public void clickLogin()
	{
		driver.findElement(By.cssSelector("#btnLogin")).click();
	}

}
