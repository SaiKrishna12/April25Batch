package day26;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginUsingReflections {
	LoginKeywords keys=new LoginKeywords();
	Method[] myMethods=keys.getClass().getMethods();
			
	@Test
	public void loginTest() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		FileInputStream file=new FileInputStream("E:\\April25Batch\\Selenium2\\src\\com\\selenium\\keywords\\LoginKeywords.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=1;i<=rowCount;i++)
		{
			Row r=ws.getRow(i);
			if(r.getCell(4).getStringCellValue().equals("Y"))
			{
				String action=r.getCell(3).getStringCellValue();
				executeActions(action);
			}
		}
	}
	public void executeActions(String action) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<myMethods.length;i++)
		{
			if(action.equals(myMethods[i].getName()))
			{
				myMethods[i].invoke(keys);
			}
		}
	}

}
