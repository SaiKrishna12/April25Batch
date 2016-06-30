package day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	
	public static void main(String[] args) throws IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Sai\\Desktop\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rowCount=ws.getLastRowNum();
		for(int i=0;i<=rowCount;i++)
		{
			
			Row r=ws.getRow(i);
			int colCount=r.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				if(r.getCell(j).getCellType()==r.getCell(j).CELL_TYPE_BLANK)
				{
					System.out.print("   ");
				}
				else if(r.getCell(j).getCellType()==r.getCell(j).CELL_TYPE_STRING)
				{
					System.out.print(r.getCell(j).getStringCellValue()+"   ");
				}
				else if(r.getCell(j).getCellType()==r.getCell(j).CELL_TYPE_NUMERIC)
				{
					System.out.print(r.getCell(j).getNumericCellValue());
				}
				
		    }
			System.out.println();
		}
	}

}
