package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
		String expurl=driver.findElement(By.linkText("Videos")).getAttribute("href");
		driver.findElement(By.linkText("Videos")).click();
		String acturl=driver.getCurrentUrl();
		if(acturl.equals(expurl))
		{
			System.out.println("videos links is working correctly");
		}
		else
		{
			System.out.println("videos links is not working correctly");
		}
	}

}
