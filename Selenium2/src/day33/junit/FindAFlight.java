package day33.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class FindAFlight extends Constants{
	@Test
	public void fidAFlightTest()
	{
		driver.findElement(By.name("passCount")).sendKeys("2");
		driver.findElement(By.name("fromPort")).sendKeys("Frankfurt");
		driver.findElement(By.name("fromMonth")).sendKeys("July");
		driver.findElement(By.name("toPort")).sendKeys("Paris");
		driver.findElement(By.name("toMonth")).sendKeys("August");
		driver.findElement(By.name("findFlights")).click();
	}

}
