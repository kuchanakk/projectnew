package commonmethods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	
	public static String readdata(int row , int cell) throws IOException {
		
		
		String excelpath ="C:\\Users\\kiran\\Desktop\\testdata.xlsx";
		FileInputStream fis = new FileInputStream(excelpath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		String val1=wb.getSheet("Sheet7").getRow(row).getCell(cell).getStringCellValue();
		return val1;
	}
	
	
	public static void writedata(int row , int cell, String value) throws IOException {
		String excelpath ="C:\\Users\\kiran\\Desktop\\testdata.xlsx";
		FileInputStream fis = new FileInputStream(excelpath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		wb.getSheet("Sheet7").getRow(row).createCell(cell).setCellValue(value);
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);
		fos.close();
		
	}
	
	
	

}
