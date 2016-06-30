package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String exptitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click(); 
		String acttitle=driver.getTitle();
		if(acttitle.equals(exptitle))
		{
			System.out.println("Gmail links is working correctly");
		}
		else
		{
			System.out.println("Gmail links is not working correctly");
		}
		driver.close();
		
		

	}

}
