package day17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleTagElementsinOneList {
	FirefoxDriver  driver;
	@BeforeTest
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://yahoo.com");
	}
	@Test
	public void allElementsTest()
	{
		List<WebElement> allElements=driver.findElements(By.tagName("a"));
		System.out.println("Total links count is "+allElements.size());
		allElements.addAll(driver.findElements(By.tagName("img")));
		System.out.println("Total count of links and images is "+allElements.size());
	}

}
