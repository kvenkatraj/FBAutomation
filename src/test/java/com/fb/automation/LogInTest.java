package com.fb.automation;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInTest {
	@Test
	public void testLogIn(){
		
		System.setProperty("webdriver.chrome.driver", "D:/venkat/javatraining/ws/MyFirstProject/lib/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//test comment
		
		
	}
	
	@Test
	public void getTestData() throws Exception{
		
		XSSFWorkbook workBook = new XSSFWorkbook("src/test/resources/UserData.xlsx");		
		XSSFSheet sheet = workBook.getSheetAt(0);		
				
		int rows = sheet.getPhysicalNumberOfRows();
		
		for( int i=0; i < rows; i++){		
			XSSFRow row = sheet.getRow(i);
			String userName = row.getCell(0).getStringCellValue();
			String password = row.getCell(1).getStringCellValue();			
			System.out.println(userName);
			System.out.println(password);
			
		}
		
		workBook.close();
		
	}

}
