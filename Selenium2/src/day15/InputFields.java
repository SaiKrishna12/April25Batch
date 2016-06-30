package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InputFields {

	/**
	 * @param args
	 */
	
		FirefoxDriver  driver;
		@BeforeTest
		public void setUp()
		{
			driver=new FirefoxDriver();
			driver.get("https://accounts.google.com/SignUp?service=mail&continue=http%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-en");
		}
		@Test
		public void inputFieldsTest()
		{
			Sleeper.sleepTightInSeconds(15);
			String[] str={"one","two","three","four","five","six","seven","eight","nine","ten"};
			List<WebElement> inputFields=driver.findElements(By.xpath("//input[@type='text' or @type='password']"));
			System.out.println(inputFields.size());
			for(int i=0;i<inputFields.size();i++)
			{
				inputFields.get(i).sendKeys(str[i]);
			}
			
			
			
			
			
			
			
			
		}
		

	}


