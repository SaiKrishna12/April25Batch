package day10;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.w3c.dom.html.HTMLUListElement;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class HeadlessTesting1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("http://msn.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

	}

}
