package com.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Existing_transfer_Bot_response {
	
	
	private WebDriver driver;
	
	
	private By verification_code = By.xpath("//button[contains(@data-content,\"Hi, Thanks for reaching out to WU, how may I help you?\")]");
    
    //driver.findElement(By.xpath("//p[contains(text() , 'Existing Transfer')]")).click();
	//Thread.sleep(10000);
	private By verification_code  = ArrayList<String> inputQuestions = new ArrayList<String>();
	                                    ArrayList<String> botAnswers = new ArrayList<String>();

	File f1 = new File("C:\\Users\\hp\\Documents\\UAT1.Xlsx");
	FileInputStream fio = null;
	
	try {
		fio = new FileInputStream(f1);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}

	XSSFWorkbook workbook = null;
	try {
		workbook = new XSSFWorkbook(fio);
	} catch (IOException e) {
		e.printStackTrace();
	}
	XSSFSheet sheet1 = workbook.getSheet("Questions");
	for (int i1 = 0; i < sheet1.getLastRowNum(); i++) {
		XSSFRow row = sheet1.getRow(i1);
		XSSFCell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		inputQuestions.add(stringCellValue);
	}

	 for (String question : inputQuestions) {
		if(!question.isEmpty()) {
			driver.findElement(By.xpath("//textarea[@placeholder = 'Type a message…']")).sendKeys(question);
			driver.findElement(By.xpath("//button[@title = 'Send Message to Assistant']")).click();
			Thread.sleep(10000);
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			String xpathForAnswer = "//p[normalize-space(text())=\"" + question.trim()
					+ "\"]/parent::div/following-sibling::*[1]//*[contains(@class,'message-content')]";
			System.out.println(xpathForAnswer);
			String answer = driver.findElement(By.xpath(xpathForAnswer)).getText();
			botAnswers.add(answer);
			
			
           driver.findElement(By.xpath("//textarea[@placeholder = 'Type a message…']")).clear();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	for (int i = 0; i < botAnswers.size(); i++) {
		XSSFRow row1 = sheet1.getRow(i1);
		XSSFCell cell1 = row1.createCell(1);
		cell1.setCellType(CellType.STRING);
		cell1.setCellValue(botAnswers.get(i1));
	}

	



FileOutputStream fos = null;
try {
fos = new FileOutputStream(f1);
} catch (FileNotFoundException e) {
e.printStackTrace();
}
try {
workbook.write(fos);
} catch (IOException e) {
e.printStackTrace();
}
try {
fos.flush();
fos.close();
} catch (IOException e) {
e.printStackTrace();
}
}
}
}

//	private By mentor_phoneNumber = By.xpath("//input[@name = 'mentor_phone']");
//	private By submitbutton = By.xpath("//button[@name = 'Submit']");
	
	//2. Constructor of the page class:
	public Existing_transfer_Bot_response(WebDriver driver)  {
		this.driver = driver;
	}
	

	//3. page actions: features(behaviour) of the page the form of methods;
   public String getVerificationPageTitle() {
	  return driver.getTitle();
   }
   
   public void verification_code(String verificationcode) {
	  driver.findElement(verification_code).sendKeys(verificationcode);
	   }
   
   public void verify_button() throws InterruptedException {
	   driver.findElement(verify).click();
	   Thread.sleep(4000);
   
	   
	   }
   public Homepage doLogin() throws InterruptedException {
	   driver.findElement(verification_code).sendKeys("1234");
	   Thread.sleep(2000);
	   driver.findElement(verify).click();
	   Thread.sleep(4000);
	  return new Homepage(driver);
		 
	}
	   
   }




	
	
	


