package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WU_Main_menu_Bot_response {
	
	private WebDriver driver;
	
	//1. By Locators ;
	private By Chatbot_icon = By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']");
	private By Greeting_message = By.xpath("//div[contains(text() , \"Hi, Thanks for reaching out to WU, how may I help you?\")]");
	private By Existing_tranfer  = By.xpath("//div[@btn-title = 'existing_transfer']");
	
	private By Genral_eniqure = By.xpath("//div[@btn-title = 'general_inquiry']");
	private By Products_Services = By.xpath("//div[@btn-title = 'product_and_services']");
	private By WUcom_Mobileapp = By.xpath("//div[@btn-title = 'wucom_mobileapp']");
	private By Chat_with_an_agent = By.xpath("//div[@btn-title = 'liveChatUserForm']");
	private By Existing_tranfer_click  = By.xpath("//div[@btn-title = 'existing_transfer']");
	
	private By change_transfer  = By.xpath("//div[@btn-title = 'change_transfer']");
	private By cancel_refund  = By.xpath("//div[@btn-title = 'cancel_refund']");
	private By fraud  = By.xpath("//div[@btn-title = 'fraud']");
	private By need_something_else = By.xpath("//div[@btn-title = 'need_something_else']");
	private By mainmenu  = By.xpath("//div[@btn-title = 'mainMenu']");
	private By mainmenu_click = By.xpath("//div[@btn-title = 'mainMenu']");
	private By Genral_eniqure_click = By.xpath("//div[@btn-title = 'general_inquiry']");
	private By agent_locator  = By.xpath("//div[@btn-title = 'agent_locator']");
	private By send_money  = By.xpath("//div[@btn-title = 'send_money']");
	private By receive_money  = By.xpath("//div[@btn-title = 'receive_money']");
	private By pricing_fx_rates  = By.xpath("//div[@btn-title = 'pricing_fx_rates']");
	private By id_requirements = By.xpath("//div[@btn-title = 'id_requirements']");
	private By customer_complaint  = By.xpath("//div[@btn-title = 'customer_complaint']");
	private By privacy = By.xpath("//div[@btn-title = 'privacy']");
	private By fraud_information = By.xpath("//div[@btn-title = 'fraud_information']");
	
	private By general_inquire_mainmenu_click = By.xpath("//div[@btn-title = 'mainMenu']");
	private By product_and_services = By.xpath("//div[@btn-title = 'product_and_services']");
	private By bill_payments  = By.xpath("//div[@btn-title = 'bill_payments']");
	private By loyalty  = By.xpath("//div[@btn-title = 'loyalty']");
	private By money_orders  = By.xpath("//div[@btn-title = 'money_orders']");
	private By promotions  = By.xpath("//div[@btn-title = 'promotions']");
	private By amazon_paycode = By.xpath("//div[@btn-title = 'amazon_paycode']");
	private By prepaid_cards  = By.xpath("//div[@btn-title = 'prepaid_cards']");
	
	
	
	private By product_and_services_mainmenu_click = By.xpath("//div[@btn-title = 'mainMenu']");
	private By wucom_mobileapp = By.xpath("//div[@btn-title = 'wucom_mobileapp']");
	private By registration  = By.xpath("//div[@btn-title = 'registration']");
	private By password_reset  = By.xpath("//div[@btn-title = 'password_reset']");
	private By unlock_account  = By.xpath("//div[@btn-title = 'unlock_account']");
	private By account_update  = By.xpath("//div[@btn-title = 'account_update']");
	private By pin_request = By.xpath("//div[@btn-title = 'pin_request']");
	private By usage_assistance  = By.xpath("//div[@btn-title = 'usage_assistance']");
	private By wucom_mobileapp_fraud = By.xpath("//div[@btn-title = 'fraud']");
	private By wucom_mobileapp_need_something_else = By.xpath("//div[@btn-title = 'need_something_else']");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private By Existing_tranfer_click  = By.xpath("//div[@btn-title = 'liveChatUserForm']");
	
	//2. Constructor of the page class:
	public WU_Main_menu_Bot_response(WebDriver driver)  {
		this.driver = driver;
	}
	

	//3. page actions: features(behaviour) of the page the form of methods;
   public String getLoginPageTitle() {
	  return driver.getTitle();
   }
   
//   public void entermentorphonenumber(String mentorphoneNumber) {
//	  driver.findElement(mentor_phoneNumber).sendKeys(mentorphoneNumber);
//	   }
   
   public void Chatbot_icon() throws InterruptedException {
	   driver.findElement(Chatbot_icon).click();
	   Thread.sleep(5000);
}
   
   public boolean Greeting_message() throws InterruptedException {
	   return  driver.findElement(Greeting_message).isDisplayed();
   }
   
   
   
   public boolean Existing_tranfer() throws InterruptedException {
	   return  driver.findElement(Existing_tranfer).isDisplayed();
   }
   
   public boolean Genral_eniqure() throws InterruptedException {
	  return driver.findElement(Genral_eniqure).isDisplayed();
	  
   }
   
   public boolean Products_Services() {
	   return driver.findElement(Products_Services).isDisplayed();
   }
   
   public boolean WUcom_Mobileapp() {
	   return driver.findElement(WUcom_Mobileapp).isDisplayed();
   }
   public boolean Chat_with_an_agent() {
	   return driver.findElement(Chat_with_an_agent).isDisplayed();
   }
   
   public void Existing_tranfer_click() throws InterruptedException {
	    driver.findElement(Existing_tranfer_click).click();
   }
   public boolean change_transfer() {
	   return driver.findElement(change_transfer).isDisplayed();
   }
   public boolean cancel_refund() {
	   return driver.findElement(cancel_refund).isDisplayed();
   }
   public boolean fraud() {
	   return driver.findElement(fraud).isDisplayed();
   }
   public boolean agent_locator() {
	   return driver.findElement(agent_locator).isDisplayed();
   }
   public boolean mainmenu() {
	   return driver.findElement(mainmenu).isDisplayed();
   }
   public void mainmenu_click() throws InterruptedException {
	   driver.findElement(mainmenu_click).click();
	   Thread.sleep(4000);
}
   
   public void Genral_eniqure_click() throws InterruptedException {
	   driver.findElement(Genral_eniqure_click).click();
	   Thread.sleep(8000);
}
   public boolean send_money() {
	   return driver.findElement(send_money).isDisplayed();
   }
   public boolean loyalty() {
	   return driver.findElement(loyalty).isDisplayed();
   }
   public boolean money_orders() {
	   return driver.findElement(money_orders).isDisplayed();
   }
   public boolean promotions() {
	   return driver.findElement(promotions).isDisplayed();
   }
   public boolean amazon_paycode() {
	   return driver.findElement(amazon_paycode).isDisplayed();
   }
   public boolean prepaid_cards() {
	   return driver.findElement(prepaid_cards).isDisplayed();
   }
   public boolean fraud_information() {
	   return driver.findElement(fraud_information).isDisplayed();
   }
   public boolean need_something_else() {
	   return driver.findElement(need_something_else).isDisplayed();
   }
   
   
   public void general_inquire_mainmenu_click() throws InterruptedException {
	   driver.findElement(general_inquire_mainmenu_click).click();
	   Thread.sleep(4000);
}
   
   public void product_and_services() throws InterruptedException {
	   driver.findElement(product_and_services).click();
	   Thread.sleep(8000);
}
   public boolean registration() {
	   return driver.findElement(registration).isDisplayed();
   }
   public boolean password_reset() {
	   return driver.findElement(password_reset).isDisplayed();
   }
   public boolean unlock_account() {
	   return driver.findElement(unlock_account).isDisplayed();
   }
   public boolean account_update() {
	   return driver.findElement(account_update).isDisplayed();
   }
   public boolean pin_request() {
	   return driver.findElement(pin_request).isDisplayed();
   }
   public boolean usage_assistance() {
	   return driver.findElement(usage_assistance).isDisplayed();
   }
   
   
   
   
   
   
   
   
   public void product_and_services_mainmenu_click() throws InterruptedException {
	   driver.findElement(product_and_services_mainmenu_click).click();
	   Thread.sleep(4000);
}
   
   public void wucom_mobileapp() throws InterruptedException {
	   driver.findElement(wucom_mobileapp).click();
	   Thread.sleep(8000);
}
   public boolean bill_payments() {
	   return driver.findElement(bill_payments).isDisplayed();
   }
   public boolean receive_money() {
	   return driver.findElement(receive_money).isDisplayed();
   }
   public boolean pricing_fx_rates() {
	   return driver.findElement(pricing_fx_rates).isDisplayed();
   }
   public boolean id_requirements() {
	   return driver.findElement(id_requirements).isDisplayed();
   }
   public boolean customer_complaint() {
	   return driver.findElement(customer_complaint).isDisplayed();
   }
   public boolean privacy() {
	   return driver.findElement(privacy).isDisplayed();
   }
   public boolean wucom_mobileapp_fraud() {
	   return driver.findElement(wucom_mobileapp_fraud).isDisplayed();
   }
   public boolean wucom_mobileapp_need_something_else() {
	   return driver.findElement(wucom_mobileapp_need_something_else).isDisplayed();
   }
   
   
   
   
   
   
//	public VerificationPage doLogin() throws InterruptedException {
//		 driver.findElement(Country).click();
//		 driver.findElement(code).click();
//		 driver.findElement(mentor_phoneNumber).sendKeys("9704017543");
//		 driver.findElement(submitbutton).click();
//		 Thread.sleep(4000);
//		 return new VerificationPage(driver);
		 
	}
		
	
	


