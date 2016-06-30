package day33.junit;

import org.junit.Test;
import org.openqa.selenium.By;


public class BookAFlight  extends Constants{
	@Test
	public void bookFlightTest()
	{
		driver.findElement(By.name("passFirst0")).sendKeys("sai");
		driver.findElement(By.name("passLast0")).sendKeys("krishna");
		driver.findElement(By.name("creditCard")).sendKeys("Visa");
		driver.findElement(By.name("creditnumber")).sendKeys("111111111111");
		driver.findElement(By.name("buyFlights")).click();
		
	}

}
