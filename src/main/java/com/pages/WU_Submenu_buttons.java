package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WU_Submenu_buttons {
	
	
private WebDriver driver;
	
	
private By Chatbot_icon = By.xpath("//button[@data-content = 'Hi, Thanks for reaching out to WU, how may I help you?']");
private By Existing_transfer = By.xpath("//div[@btn-title = 'existing_transfer']");
private By change_transfer = By.xpath("//div[@btn-title = 'change_transfer']");
private By change_transfer_bot_response = By.xpath("//div[contains(text() ,  'You can correct any minor typographical or spelling errors. We do not allow full name change. Click')]");
private By change_transfer_mainmenu = By.xpath("//div[@btn-title = 'mainMenu']");
private By change_transfer_chat_with_agent = By.xpath("//div[@btn-title = 'liveChatUserForm']");
private By change_transfer_mainmenu_click = By.xpath("//div[@btn-title = 'mainMenu']");
private By Existing_transfer_click = By.xpath("//div[@btn-title = 'existing_transfer']");


private By cancel_refund = By.xpath("//div[@btn-title = 'cancel_refund']");
private By cancel_refund_bot_response = By.xpath("//div[contains(text() ,  \"You may be able to cancel your money transfer if it has not been picked up or deposited. Click\")]");


private By fraud = By.xpath("//div[@btn-title = 'fraud']");
private By fraud_bot_response = By.xpath("//div[contains(text() ,  'It looks like you may need to chat with an agent? ')]");



private By need_something_else = By.xpath("//div[@btn-title = 'need_something_else']");
private By need_something_else_bot_response = By.xpath("//div[contains(text() ,  'Sure! Let me know what you need.')]");
private By transfer_status = By.xpath("//div[@btn-title = 'transfer_status']");
private By need_something_else_send_money = By.xpath("//div[@btn-title = 'send_money']");
private By Need_something_else_change_transfer = By.xpath("//div[@btn-title = 'change_transfer']");



private By general_inquiry = By.xpath("//div[@btn-title = 'general_inquiry']");
private By agent_locator = By.xpath("//div[@btn-title = 'agent_locator']");
private By agent_locator_bot_response = By.xpath("//div[contains(text() , \"You can find agent's location by visiting\")]");


private By send_money = By.xpath("//div[@btn-title = 'send_money']");
private By send_money_bot_response = By.xpath("//div[contains(text() ,  'There are different ')]");


private By receive_money = By.xpath("//div[@btn-title = 'receive_money']");
private By receive_money_bot_response = By.xpath("//div[contains(text() ,  'This depends on the money transfer delivery options available in the destination country. You must be at least 18 years old to send or receive money with Western Union. Click ')]");



private By pricing_fx_rates = By.xpath("//div[@btn-title = 'id_requirements']");
private By pricing_fx_rates_bot_response = By.xpath("//div[contains(text() ,  \"Western Union is required to comply with the laws and regulations of the originating / destination country where we do business. For this reason, additional details might be required depending on transfer details.\")]");



private By customer_complaint = By.xpath("//div[@btn-title = 'customer_complaint']");
private By customer_complaint_bot_response = By.xpath("//div[contains(text() ,  \"We'd love to hear your feedback about our product and service to continuously improve the way we serve our valued customers. Visit our\")]");


private By fraud_information = By.xpath("//div[@btn-title = 'fraud_information']");
private By fraud_information_bot_response = By.xpath("//div[contains(text() , 'To learn more about how to protect yourself from fraud, visit our ')]");

private By id_requirements = By.xpath("//div[@btn-title = 'id_requirements']");
private By id_requirements_bot_response = By.xpath("//div[contains(text() ,  \"Western Union is required to comply with the laws and regulations of the originating / destination country where we do business. For this reason, additional details might be required depending on transfer details.\")]");


private By privacy = By.xpath("//div[@btn-title = 'privacy']");
private By privacy_bot_response = By.xpath("//div[contains(text() ,  \"Click \")]");

private By product_and_services = By.xpath("//div[@btn-title = 'product_and_services']");
private By bill_payments = By.xpath("//div[@btn-title = 'bill_payments']");
private By bill_payments_bot_response = By.xpath("//div[contains(text() ,  \"Log on to your \")]");


private By loyalty = By.xpath("//div[@btn-title = 'loyalty']");
private By loyalty_bot_response = By.xpath("//div[contains(text() ,  \"To thank you when you choose Western Union and because we continue to earn your business, we have created our My WU loyalty program. Learn more about My WU and our special offers by going to \")]");


private By money_orders = By.xpath("//div[@btn-title = 'money_orders']");
private By money_orders_bot_response = By.xpath("//div[contains(text() ,  \"You may be able to cash your money order at banks and other retailers (grocery stores, check-cashing locations or other stores where you’ve been able to cash checks). In some circumstances, the bank or retailer may charge you to cash your money order. You may also be able to deposit the money order into your bank account (depositing into their bank account is the best option). Note, not all Western Union locations, including where you buy a money order, are able to cash them\")]");



private By promotions = By.xpath("//div[@btn-title = 'promotions']");
private By promotions_bot_response = By.xpath("//div[contains(text() ,  \"On WU.com or the \")]");



private By amazon_paycode = By.xpath("//div[@btn-title = 'amazon_paycode']");
private By amazon_paycode_bot_response = By.xpath("//div[contains(text() ,  \"Also known as Pay @ WU, is a feature which allows Amazon customers to pay for their order in cash at participating Western Union locations. Amazon refers to this feature as PayCode. During checkout at www.amazon.com, customers will see Amazon PayCode as a payment option. The customer can take this information to participating Western Union locations to pay for his/her order\")]");


private By prepaid_cards = By.xpath("//div[@btn-title = 'prepaid_cards']");
private By prepaid_cards_bot_response = By.xpath("//div[contains(text() ,  \"Western Union and NetSpend have teamed up to offer a powerful prepaid MasterCard. It gives you the convenience of sending and receiving money transfers via the NetSpend card. You can enroll online at\")]");


private By wucom_mobileapp = By.xpath("//div[@btn-title = 'wucom_mobileapp']");
private By registration = By.xpath("//div[@btn-title = 'registration']");
private By registration_bot_response = By.xpath("//div[contains(text() ,  \"If you have not done so, create a profile on WU.com. Then follow the instructions on the screen for \")]");


private By password_reset = By.xpath("//div[@btn-title = 'password_reset']");
private By password_reset_bot_response = By.xpath("//div[contains(text() ,  \"If you forgot your password, you can choose the \")]");


private By unlock_account = By.xpath("//div[@btn-title = 'unlock_account']");
private By unlock_account_bot_response = By.xpath("//div[contains(text() ,  \"Click \")]");

private By account_update = By.xpath("//div[@btn-title = 'account_update']");
private By account_update_bot_response = By.xpath("//div[contains(text() ,  \"You can update almost any information in your profile by going to \")]");

private By pin_request = By.xpath("//div[@btn-title = 'pin_request']");
private By pin_request_bot_response = By.xpath("//div[contains(text() ,  \"While creating a profile online on \")]");



private By usage_assistance = By.xpath("//div[@btn-title = 'usage_assistance']");
private By usage_assistance_bot_response = By.xpath("//div[contains(text() ,  \"There are different \")]");
















	//private By verify  = By.xpath("//button[@name = 'Verify']");
	
//	private By mentor_phoneNumber = By.xpath("//input[@name = 'mentor_phone']");
//	private By submitbutton = By.xpath("//button[@name = 'Submit']");
	
	//2. Constructor of the page class:
	public WU_Submenu_buttons(WebDriver driver)  {
		this.driver = driver;
	}
	

	//3. page actions: features(behaviour) of the page the form of methods;
   public String getHomepageTitle() {
	  return driver.getTitle();
   }
   
//   public void verificationcode(String verififcationcode) {
//	  driver.findElement(verification_code).sendKeys(verififcationcode);
//	   }
   
   public void Chat_icon() throws InterruptedException {
	   driver.findElement(Chatbot_icon).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void Existing_transfer() throws InterruptedException {
	   driver.findElement(Existing_transfer).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void change_transfer() throws InterruptedException {
	   driver.findElement(change_transfer).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void change_transfer_mainmenu_click() throws InterruptedException {
	   driver.findElement(change_transfer_mainmenu_click).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
	
   public void Existing_transfer_click() throws InterruptedException {
	   driver.findElement(Existing_transfer_click).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void cancel_refund() throws InterruptedException {
	   driver.findElement(cancel_refund).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void fraud() throws InterruptedException {
	   driver.findElement(fraud).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void need_something_else() throws InterruptedException {
	   driver.findElement(need_something_else).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void general_inquiry() throws InterruptedException {
	   driver.findElement(general_inquiry).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void agent_locator() throws InterruptedException {
	   driver.findElement(agent_locator).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void send_money() throws InterruptedException {
	   driver.findElement(send_money).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void receive_money() throws InterruptedException {
	   driver.findElement(receive_money).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void customer_complaint() throws InterruptedException {
	   driver.findElement(customer_complaint).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void pricing_fx_rates() throws InterruptedException {
	   driver.findElement(pricing_fx_rates).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void privacy() throws InterruptedException {
	   driver.findElement(privacy).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void fraud_information() throws InterruptedException {
	   driver.findElement(fraud_information).click();
	   Thread.sleep(4000);
   }
   
   public void id_requirements() throws InterruptedException {
	   driver.findElement(id_requirements).click();
	   Thread.sleep(4000);
   }
   
   
   public void product_and_services() throws InterruptedException {
	   driver.findElement(product_and_services).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void bill_payments() throws InterruptedException {
	   driver.findElement(bill_payments).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void loyalty() throws InterruptedException {
	   driver.findElement(loyalty).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void money_orders() throws InterruptedException {
	   driver.findElement(money_orders).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void promotions() throws InterruptedException {
	   driver.findElement(promotions).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void amazon_paycode() throws InterruptedException {
	   driver.findElement(amazon_paycode).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void prepaid_cards() throws InterruptedException {
	   driver.findElement(prepaid_cards).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void wucom_mobileapp() throws InterruptedException {
	   driver.findElement(wucom_mobileapp).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void registration() throws InterruptedException {
	   driver.findElement(registration).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void password_reset() throws InterruptedException {
	   driver.findElement(password_reset).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void unlock_account() throws InterruptedException {
	   driver.findElement(unlock_account).click();
	   Thread.sleep(4000);
   }
   
   
   public void pin_request() throws InterruptedException {
	   driver.findElement(pin_request).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   public void usage_assistance() throws InterruptedException {
	   driver.findElement(usage_assistance).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
//   public void unlock_account() throws InterruptedException {
//	   driver.findElement(unlock_account).click();
//	   Thread.sleep(4000);
//   }
   
   
   
   public void account_update() throws InterruptedException {
	   driver.findElement(account_update).click();
	   Thread.sleep(4000);
	   //return new RequestMeetingPage(driver);
   }
   
     public boolean change_transfer_bot_response() throws InterruptedException {
	   return  driver.findElement(change_transfer_bot_response).isDisplayed();
   }
   
   
   public boolean id_requirements_bot_response() throws InterruptedException {
	   return  driver.findElement(id_requirements_bot_response).isDisplayed();
   }
   public boolean change_transfer_mainmenu() throws InterruptedException {
	   return  driver.findElement(change_transfer_mainmenu).isDisplayed();
   }
   public boolean change_transfer_chat_with_agent() throws InterruptedException {
	   return  driver.findElement(change_transfer_chat_with_agent).isDisplayed();
   }
   public boolean cancel_refund_bot_response() throws InterruptedException {
	   return  driver.findElement(cancel_refund_bot_response).isDisplayed();
   }
   public boolean fraud_bot_response() throws InterruptedException {
	   return  driver.findElement(fraud_bot_response).isDisplayed();
   }
   public boolean need_something_else_bot_response() throws InterruptedException {
	   return  driver.findElement(need_something_else_bot_response).isDisplayed();
   }
   public boolean transfer_status() throws InterruptedException {
	   return  driver.findElement(transfer_status).isDisplayed();
   }public boolean need_something_else_send_money() throws InterruptedException {
	   return  driver.findElement(need_something_else_send_money).isDisplayed();
   }
   public boolean Need_something_else_change_transfer() throws InterruptedException {
	   return  driver.findElement(Need_something_else_change_transfer).isDisplayed();
   }
   public boolean agent_locator_bot_response() throws InterruptedException {
	   return  driver.findElement(agent_locator_bot_response).isDisplayed();
   }
   public boolean send_money_bot_response() throws InterruptedException {
	   return  driver.findElement(send_money_bot_response).isDisplayed();
   }
   public boolean pricing_fx_rates_bot_response() throws InterruptedException {
	   return  driver.findElement(pricing_fx_rates_bot_response).isDisplayed();
   }
   
   public boolean customer_complaint_bot_response() throws InterruptedException {
	   return  driver.findElement(customer_complaint_bot_response).isDisplayed();
   }
   public boolean privacy_bot_response() throws InterruptedException {
	   return  driver.findElement(privacy_bot_response).isDisplayed();
   }
   
   
   public boolean receive_money_bot_response() throws InterruptedException {
	   return  driver.findElement(receive_money_bot_response).isDisplayed();
   }
   
   
   
   public boolean fraud_information_bot_response() throws InterruptedException {
	   return  driver.findElement(fraud_information_bot_response).isDisplayed();
   }
   
   public boolean bill_payments_bot_response() throws InterruptedException {
	   return  driver.findElement(bill_payments_bot_response).isDisplayed();
   }
   
   
   
   public boolean loyalty_bot_response() throws InterruptedException {
	   return  driver.findElement(loyalty_bot_response).isDisplayed();
   }
   public boolean money_orders_bot_response() throws InterruptedException {
	   return  driver.findElement(money_orders_bot_response).isDisplayed();
   }
   
   
   
   public boolean promotions_bot_response() throws InterruptedException {
	   return  driver.findElement(promotions_bot_response).isDisplayed();
   }
   public boolean amazon_paycode_bot_response() throws InterruptedException {
	   return  driver.findElement(amazon_paycode_bot_response).isDisplayed();
   }
   
   
   
   public boolean prepaid_cards_bot_response() throws InterruptedException {
	   return  driver.findElement(prepaid_cards_bot_response).isDisplayed();
   }
   public boolean registration_bot_response() throws InterruptedException {
	   return  driver.findElement(registration_bot_response).isDisplayed();
   }
   
   
   
   public boolean password_reset_bot_response() throws InterruptedException {
	   return  driver.findElement(password_reset_bot_response).isDisplayed();
   }
   
   
   public boolean unlock_account_bot_response() throws InterruptedException {
	   return  driver.findElement(unlock_account_bot_response).isDisplayed();
   }
   public boolean pin_request_bot_response() throws InterruptedException {
	   return  driver.findElement(pin_request_bot_response).isDisplayed();
   }
   
   
   
   public boolean usage_assistance_bot_response() throws InterruptedException {
	   return  driver.findElement(usage_assistance_bot_response).isDisplayed();
   }
   
   
   
   public boolean account_update_bot_response() throws InterruptedException {
	   return  driver.findElement(account_update_bot_response).isDisplayed();
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
	

}


