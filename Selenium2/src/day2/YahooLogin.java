package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooLogin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("http://yahoomail.com");
		driver.findElement(By.name("username")).sendKeys("saikrishna_rhce");
		driver.findElement(By.xpath("//*[@id='login-signin']")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("krishna@123");
		String x=driver.findElement(By.id("login-signin")).getCssValue("color");
		System.out.println(x);
		x=driver.findElement(By.id("login-passwd")).getCssValue("color");
		System.out.println(x);
		
	}

}
