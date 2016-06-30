package day17;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ImplicitWaitExample {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://pvrcinemas.com");
	}
	@Test
	public void waitTest()
	{
		
		driver.findElement(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a")).click();
	}

}
