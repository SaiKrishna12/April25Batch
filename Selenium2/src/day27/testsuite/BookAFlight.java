package day27.testsuite;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

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
