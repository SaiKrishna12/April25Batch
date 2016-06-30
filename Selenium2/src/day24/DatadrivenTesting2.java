package day24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatadrivenTesting2 {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUP()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
	}
	@Test
	public void registrationTest() throws IOException 
	{
		FileInputStream file=new FileInputStream("E:\\April25Batch\\Selenium2\\src\\com\\selenium\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			String linkname=r.getCell(0).getStringCellValue();
			try
			{
				driver.findElement(By.linkText(linkname)).click();
				String acturl=driver.getCurrentUrl();
				r.createCell(2).setCellValue(acturl);
				String expurl=r.getCell(1).getStringCellValue();
				if(acturl.equals(expurl))
				{
					r.createCell(3).setCellValue("Passed");
				}
				else
				{
					r.createCell(3).setCellValue("Failed");
				}
				driver.navigate().back();
			}
			catch(Exception e)
			{
				r.createCell(3).setCellValue("Link not found");
			}
		}
		FileOutputStream f=new FileOutputStream("E:\\April25Batch\\Selenium2\\src\\com\\selenium\\resultexcelfiles\\links.xlsx");
		wb.write(f);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

			
			
			
			
			
			

}
