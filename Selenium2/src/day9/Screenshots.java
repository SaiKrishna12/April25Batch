package day9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://bbc.com");
		Sleeper.sleepTightInSeconds(20);
		
		TakesScreenshot takes=((TakesScreenshot)driver);
		File srcFile=takes.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("c:\\users\\sai\\desktop\\bbc.png"));
		
	}

}
