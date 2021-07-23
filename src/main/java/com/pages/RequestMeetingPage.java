package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestMeetingPage {
	
private WebDriver driver;
	
	//1. By Locators ;
	private By applicantname = By.xpath("//input[@placeholder = 'Applicant Name']");
	private By applicantemail  = By.xpath("//input[@placeholder = 'Applicant Email']");
	
	private By country1 = By.xpath("//span[contains(text() , 'Country Code *')]");
	private By code1 = By.xpath("//span[contains(text() , ' India +91 ')]");
	private By mentor_phone = By.xpath("//input[@name = 'mentor_phone']");
	private By uploadresume = By.xpath("//input[@id = 'fileControl1']");
	//private By clickonsubmitresume = By.xpath("//span[@class = 'mat-select-placeholder ng-tns-c6-45 ng-star-inserted']");
	//private By submitbutton = By.xpath("//span[contains(text() , ' No ')]");
	private By technologies = By.xpath("//input[@placeholder = 'Core Technologies To Assess*']");
	//private By language = By.xpath("//span[contains(text() , ' python ')]");
	private By clickonlanguage = By.xpath("//span[contains(text() , ' python')]");
	private By clicklisabuildQuestions = By.xpath("//button[contains(text() , 'Lisa, Build Question Set For Me ')]");
	private By notes = By.xpath("//textarea[@name = 'notes']");
	private By dateandtime = By.xpath("//input[@placeholder = 'assessment live date and time:']");
	private By timezone = By.xpath("//span[contains(text() , 'Select Timezone')]");
	private By place = By.xpath("//mat-option[@value = 'Asia/Kolkata']");
	private By upsertandreset = By.xpath("//button[contains(text() , 'Upsert & Reset ')]");
	//private By submitbutton = By.xpath("//mat-option[@value = 'Asia/Kolkata']");
	
	
	
	
	
	
	
	
	
	
	
	//2. Constructor of the page class:
	public RequestMeetingPage(WebDriver driver)  {
		this.driver = driver;
	}
	

	//3. page actions: features(behaviour) of the page the form of methods;
   public String getLoginPageTitle() {
	  return driver.getTitle();
   }
   
   public void applicantname() throws InterruptedException {
	  driver.findElement(applicantname).sendKeys("srikanth");
	  Thread.sleep(2000);
	   }
   
   public void applicantemail() throws InterruptedException {
	   driver.findElement(applicantemail).sendKeys("sridhar@skil.ai");
	   Thread.sleep(2000);
 }
   
   public void country1() throws InterruptedException {
	   driver.findElement(country1).click();
	   Thread.sleep(2000);
   }
   
   public void code1() throws InterruptedException {
	   driver.findElement(code1).click();
	   Thread.sleep(2000);
   }
	   
	   public void mentor_phone() throws InterruptedException {
			  driver.findElement(mentor_phone).sendKeys("9490933944");
			  Thread.sleep(2000);
			   }
		   
		   public void uploadresume() throws InterruptedException {
			   driver.findElement(uploadresume).sendKeys("C:\\Users\\hp\\Desktop\\sample.docx");
			   Thread.sleep(4000);
		 }
		   
//		   public void clickonsubmitresume() throws InterruptedException {
//			   driver.findElement(clickonsubmitresume).click();
//			   Thread.sleep(2000);
//		   }
//		   
		   public void technologies() throws InterruptedException {
			   driver.findElement(technologies).sendKeys("python");
			   Thread.sleep(4000);
		   }
//		   public void language() throws InterruptedException {
//		       driver.findElement(language).sendKeys("python");
//		       Thread.sleep(4000);
//					   }
				   
		   public void clickonlanguage() throws InterruptedException {
			   driver.findElement(clickonlanguage).click();
			   Thread.sleep(4000);
				        }
				   
		   public void clicklisabuildQuestions() throws InterruptedException {
			   driver.findElement(clicklisabuildQuestions).click();
			   Thread.sleep(7000);
				        }
				   
		    public void notes() throws InterruptedException {
			   driver.findElement(notes).sendKeys("Technical screening");
			   Thread.sleep(4000);
					   
					   
   }
				   
		    public void dateandtime() throws InterruptedException {
			    driver.findElement(dateandtime).sendKeys("03/17/2021, 10:07 AM");
			    Thread.sleep(4000);
					   
					   
   }
				   
		     public void timezone() throws InterruptedException {
			     driver.findElement(timezone).click();
			     Thread.sleep(4000);
					   
					   
   }
				   
			public void place() throws InterruptedException {
				  driver.findElement(place).click();
				  Thread.sleep(4000);
					   
					   
   }
				   
				   
			public void upsertandreset() throws InterruptedException {
				   driver.findElement(upsertandreset).click();
				   Thread.sleep(4000);
					   
					   
   }
				  
					   
					   
   }
				   


