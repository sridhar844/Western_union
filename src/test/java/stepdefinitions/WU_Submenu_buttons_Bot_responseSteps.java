package stepdefinitions;



import com.pages.WU_Submenu_buttons;
import org.junit.Assert;


import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WU_Submenu_buttons_Bot_responseSteps {
	
	
	private WU_Submenu_buttons WU_Submenu_buttons= new WU_Submenu_buttons(DriverFactory.getDriver());
//	//VerificationPage verificationPage = new VerificationPage(null);
//	//private VerificationPage verificationPage = new VerificationPage();
//	//private Homepage homePage = new Homepage();
//	  //Homepage homePage = new Homepage();
	
	@Given("user is on WU page1")
	public void user_is_on_WU_page1() throws InterruptedException {
		DriverFactory.getDriver().get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html");
		Thread.sleep(5000);
		
		}

	
	@When("Click on  Wu chatbot icon1")
	public void Click_on_Wu_chatbot_icon1() throws InterruptedException {
		WU_Submenu_buttons.Chat_icon();
		Thread.sleep(4000);
		}
	
	@Then("Click on Existing transfer0")
	public void Click_on_Existing_transfer0() throws InterruptedException {
		//loginPage.Existing_tranfer();
		WU_Submenu_buttons.Existing_transfer();
		Thread.sleep(4000);
	}
	
	
	@Then("Click on change transfer")
	public void Click_on_change_transfer() throws InterruptedException {
		//loginPage.Existing_tranfer();
		WU_Submenu_buttons.change_transfer();
		Thread.sleep(4000);
	}
	
	@Then("change transfer bot response is Displayed")
	public void change_transfer_bot_response_is_Displayed() throws InterruptedException {
		//loginPage.Genral_eniqure();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_bot_response());

	}
	@Then("change transfer main menu button is Displayed")
	public void change_transfe_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.Products_Services();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	
	@Then("change transfer chat with an agent is Displayed")
	public void change_transfer_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("click on main menu button")
	public void click_on_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(4000);
	}
	
	@Then("Click on Existing transfer1")
	public void Click_on_Existing_transfer1() throws InterruptedException {
		WU_Submenu_buttons.Existing_transfer_click();
		Thread.sleep(8000);
		}
	@Then("Click on cancel refund button")
	public void Click_on_cancel_refund_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.cancel_refund();
		Thread.sleep(4000);
	}
	@Then("cancel refund bot response is Displayed")
	public void cancel_refund_bot_response_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.cancel_refund_bot_response());
	}
	@Then("cancel refund main menu button is Displayed")
	public void cancel_refund_main_menu_button_isDisplayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		//WU_Submenu_buttons.change_transfer_mainmenu()();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("cancel refund chat with an agent is Displayed")
	public void cancel_refund_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		//WU_Submenu_buttons.Existing_transfer();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on cancel refund main menu button")
	public void Click_on_cancel_refund_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	
	@Then("Click on Existing transfer2")
	public void Click_on_Existing_transfer2() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.Existing_transfer_click();
		Thread.sleep(4000);
	}
	@Then("Click on fraud button")
	public void Click_on_fraud_button() throws InterruptedException {
		WU_Submenu_buttons.fraud();
		Thread.sleep(4000);
		}
	@Then("fraud button bot response is Displayed")
	public void fraud_button_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.fraud_bot_response());
		}
	@Then("fraud button main menu button is Displayed")
	public void fraud_button_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("fraud button chat with an agent is Displayed")
	public void fraud_button_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on fraud main menu button")
	public void Click_on_fraud_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Existing transfer3")
	public void Click_on_Existing_transfer3() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.Existing_transfer_click();
		Thread.sleep(4000);
	}
	@Then("Click on need something else button")
	public void Click_on_need_something_else_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.need_something_else();
	}
	@Then("need something else bot response is Displayed")
	public void need_something_else_bot_response_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.need_something_else_bot_response());
	}
	@Then("need something else transfer status is Displayed")
	public void need_something_else_transfer_status_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.transfer_status());
	}
	@Then("need something else send money is Displayed")
	public void need_something_else_send_money_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.Need_something_else_change_transfer());
	}
	
	@Then("need something else change transfer is Displayed")
	public void need_something_else_change_transfer_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.Need_something_else_change_transfer());
	}
	
	@Then("need something else main menu button is Displayed")
	public void need_somethin_else_main_menu_button_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
		}
	@Then("need something else chat with an agent is Displayed")
	public void need_something_else_with_an_agent_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
		}
	@Then("Click on need something else main menu button")
	public void Click_on_need_something_else_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry")
	public void Click_on_Genral_inquiry0() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on send money button")
	public void Click_on_send_money_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.send_money();
		Thread.sleep(4000);
	}
	
	
	@Then("send money bot response is Displayed")
	public void send_money_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.send_money_bot_response());
		}
	@Then("send money main menu button is Displayed")
	public void send_money_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("send money chat with an agent is Displayed")
	public void send_money_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on send money main menu button")
	public void Click_on_send_money_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry1")
	public void Click_on_Genral_inquiry1() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on receive money button")
	public void Click_on_receive_money_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.receive_money();
	}
	@Then("receive money bot response is Displayed")
	public void receive_money_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.receive_money_bot_response());
		}
	@Then("receive money main menu button is Displayed")
	public void receive_money_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("receive money chat with an agent is Displayed")
	public void receive_money_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on receive money main menu button")
	public void Click_on_receive_money_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry2")
	public void Click_on_Genral_inquiry2() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on pricing fx rates button")
	public void Click_on_pricing_fx_rates_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.pricing_fx_rates();
	}
	@Then("pricing fx rates bot response is Displayed")
	public void pricing_fx_rates_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.privacy_bot_response());
		}
	@Then("pricing fx rates main menu button is Displayed")
	public void pricing_fx_rates_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("pricing fx rates chat with an agent is Displayed")
	public void pricing_fx_rates_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on pricing fx rates main menu button")
	public void Click_on_pricing_fx_rates_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry3")
	public void Click_on_Genral_inquiry3() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on id requirements button")
	public void id_requirements() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.id_requirements();
	}
	@Then("id requirements bot response is Displayed")
	public void id_requirements_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.id_requirements_bot_response());
		}
	@Then("id requirements main menu button is Displayed")
	public void id_requirements_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("id requirements chat with an agent is Displayed")
	public void id_requirements_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on id requirements main menu button")
	public void Click_on_id_requirements_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry4")
	public void Click_on_Genral_inquiry4() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on customer complaint button")
	public void Click_on_customer_complaint_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.customer_complaint();
	}
	@Then("customer complaint bot response is Displayed")
	public void customer_complaint_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.customer_complaint_bot_response());
		}
	@Then("customer complaint main menu button is Displayed")
	public void customer_complaint_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("customer complaint chat with an agent is Displayed")
	public void customer_complaint_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on customer complaint main menu button")
	public void Click_on_customer_complaint_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry5")
	public void Click_on_Genral_inquiry5() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on privacy button")
	public void Click_on_privacy_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.privacy();
		}
	@Then("privacy bot response is Displayed")
	public void privacy_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.privacy_bot_response());
		}
	@Then("privacy main menu button is Displayed")
	public void privacy_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("privacy chat with an agent is Displayed")
	public void privacy_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on privacy main menu button")
	public void Click_on_privacy_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on Genral inquiry6")
	public void Click_on_Genral_inquiry6() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.general_inquiry();
		Thread.sleep(4000);
	}
	@Then("Click on fraud information button")
	public void Click_on_fraud_information_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.fraud_information();
	}
	@Then("fraud information bot response is Displayed")
	public void fraud_information_bot_response_is_Displayed() throws InterruptedException {
		Assert.assertTrue(WU_Submenu_buttons.fraud_information_bot_response());
		}
	@Then("fraud information main menu button is Displayed")
	public void fraud_information_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("fraud information chat with an agent is Displayed")
	public void fraud_information_chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on fraud information main menu button")
	public void Click_on_fraud_information_main_menu_button() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
//	@Then("Click on Genral inquiry")
//	public void Click_on_Genral_inquiry6() throws InterruptedException {
//		//loginPage.WUcom_Mobileapp();
//		WU_Submenu_buttons.general_inquiry();
//		Thread.sleep(4000);
	
	
	@Then("Click on product and services button")
	public void click_on_product_and_services_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.product_and_services();
		Thread.sleep(3000);
	}


	@Then("Click on bill payments button")
	public void click_on_bill_payments_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.bill_payments();
		Thread.sleep(3000);
	}
	@Then("bill payments bot response is Displayed")
	public void bill_payments_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.bill_payments_bot_response());
	}
	@Then("bill payments main menu button is Displayed")
	public void bill_payments_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("bill payments chat with an agent is Displayed")
	public void bill_payments_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on bill payments main menu button")
	public void click_on_bill_payments_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on product and services1")
	public void click_on_product_and_services1() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.product_and_services();
		Thread.sleep(3000);
	}
	@Then("Click on loyalty button")
	public void click_on_loyalty_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.loyalty();
		Thread.sleep(3000);
	}
	@Then("loyalty bot response is Displayed")
	public void loyalty_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.loyalty_bot_response());
	}
	@Then("loyalty main menu button is Displayed")
	public void loyalty_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("loyalty chat with an agent is Displayed")
	public void loyalty_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on loyalty main menu button")
	public void click_on_loyalty_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on product and services2")
	public void click_on_product_and_services2() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.product_and_services();
		Thread.sleep(3000);
	}
	@Then("Click on money orders button")
	public void click_on_money_orders_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.money_orders();
		Thread.sleep(3000);
	}
	@Then("money orders bot response is Displayed")
	public void money_orders_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.money_orders_bot_response());
	}
	@Then("money orders main menu button is Displayed")
	public void money_orders_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("money orders chat with an agent is Displayed")
	public void money_orders_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on money orders main menu button")
	public void click_on_money_orders_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on product and services3")
	public void click_on_product_and_services3() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.product_and_services();
		Thread.sleep(3000);
	}
	@Then("Click on promotions button")
	public void click_on_promotions_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.promotions();
		Thread.sleep(3000);
	}
	@Then("promotions bot response is Displayed")
	public void promotions_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.promotions_bot_response());
	}
	@Then("promotions main menu button is Displayed")
	public void promotions_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("promotions chat with an agent is Displayed")
	public void promotions_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on promotions main menu button")
	public void click_on_promotions_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on product and services4")
	public void click_on_product_and_services4() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.product_and_services();
		Thread.sleep(3000);
	}
	@Then("Click on amazon paycode button")
	public void click_on_amazon_paycode_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.amazon_paycode();
		Thread.sleep(3000);
	}
	@Then("amazon paycode bot response is Displayed")
	public void amazon_paycode_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.amazon_paycode_bot_response());
	}
	@Then("amazon paycode main menu button is Displayed")
	public void amazon_paycode_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("amazon paycode chat with an agent is Displayed")
	public void amazon_paycode_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on amazon paycode main menu button")
	public void click_on_amazon_paycode_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on product and services5")
	public void click_on_product_and_services5() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.product_and_services();
		Thread.sleep(3000);
	}
	@Then("Click on prepaid cards button")
	public void click_on_prepaid_cards_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.prepaid_cards();
		Thread.sleep(3000);
	}
	@Then("prepaid cards bot response is Displayed")
	public void prepaid_cards_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.prepaid_cards_bot_response());
	}
	@Then("prepaid cards main menu button is Displayed")
	public void prepaid_cards_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("prepaid cards chat with an agent is Displayed")
	public void prepaid_cards_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on prepaid cards main menu button")
	public void click_on_prepaid_cards_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp button")
	public void click_on_wucom_mobileapp_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on registration button")
	public void click_on_registration_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.registration();
		Thread.sleep(3000);
	}
	@Then("registration bot response is Displayed")
	public void registration_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.registration_bot_response());
	}
	@Then("registration main menu button is Displayed")
	public void registration_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("registration chat with an agent is Displayed")
	public void registration_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on registration main menu button")
	public void click_on_registration_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp1")
	public void click_on_wucom_mobileapp1() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on password reset button")
	public void click_on_password_reset_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.password_reset();
		Thread.sleep(3000);
	}
	@Then("password reset bot response is Displayed")
	public void password_reset_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.password_reset_bot_response());
	}
	@Then("password reset main menu button is Displayed")
	public void password_reset_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("password reset chat with an agent is Displayed")
	public void password_reset_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on password reset main menu button")
	public void click_on_password_reset_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp2")
	public void click_on_wucom_mobileapp2() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on unlock account button")
	public void click_on_unlock_account_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.unlock_account();
		Thread.sleep(3000);
	}
	@Then("unlock account bot response is Displayed")
	public void unlock_account_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.unlock_account_bot_response());
	}
	@Then("unlock account main menu button is Displayed")
	public void unlock_account_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("unlock account chat with an agent is Displayed")
	public void unlock_account_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on unlock account main menu button")
	public void click_on_unlock_account_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp3")
	public void click_on_wucom_mobileapp3() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on account update button")
	public void click_on_account_update_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.account_update();
		Thread.sleep(3000);
	}
	@Then("account update bot response is Displayed")
	public void account_update_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.account_update_bot_response());
	}
	@Then("account update main menu button is Displayed")
	public void account_update_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("account update chat with an agent is Displayed")
	public void account_update_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on account update main menu button")
	public void click_on_account_update_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp4")
	public void click_on_wucom_mobileapp4() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on pin request button")
	public void click_on_pin_request_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.pin_request();
		Thread.sleep(3000);
	}
	@Then("pin request bot response is Displayed")
	public void pin_request_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.pin_request_bot_response());
	}
	@Then("pin request main menu button is Displayed")
	public void pin_request_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("pin request chat with an agent is Displayed")
	public void pin_request_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on pin request main menu button")
	public void click_on_pin_request_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp5")
	public void click_on_wucom_mobileapp5() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on usage assistance button")
	public void click_on_usage_assistance_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.usage_assistance();
		Thread.sleep(3000);
	}
	@Then("usage assistance bot response is Displayed")
	public void usage_assistance_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.usage_assistance_bot_response());
	}
	@Then("usage assistance main menu button is Displayed")
	public void usage_assistance_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("usage assistance chat with an agent is Displayed")
	public void usage_assistance_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on usage assistance main menu button")
	public void click_on_usage_assistance_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);

	}
	@Then("Click on wucom mobileapp6")
	public void click_on_wucom_mobileapp6() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);

	}
	@Then("Click on Issue sending button")
	public void click_on_Issue_sending_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.fraud();
		Thread.sleep(3000);

	}
	@Then("Issue sending bot response is Displayed")
	public void Issue_sending_bot_response_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.fraud_bot_response());
	}
	@Then("Issue sending main menu button is Displayed")
	public void Issue_sending_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("Issue sending chat with an agent is Displayed")
	public void Issue_sending_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on Issue sending main menu button")
	public void click_on_Issue_sending_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}
	@Then("Click on wucom mobileapp7")
	public void click_on_wucom_mobileapp7() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.wucom_mobileapp();
		Thread.sleep(3000);
	}
	@Then("Click on need something else1 button")
	public void click_on_need_something_else1_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.need_something_else();
		Thread.sleep(3000);
	}
	@Then("need something else bot response1 is Displayed")
	public void need_something_else_bot_response1_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.need_something_else_bot_response());
	}
	@Then("need something else transfer status1 is Displayed")
	public void need_something_else_transfer_status1_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.transfer_status());
	}
	@Then("need something else send money1 is Displayed")
	public void need_something_else_send_money1_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.need_something_else_send_money());
	}
	@Then("need something else change transfer1 is Displayed")
	public void need_something_else_change_transfer1_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.Need_something_else_change_transfer());
	}
	@Then("need something else1 main menu button is Displayed")
	public void need_something_else1_main_menu_button_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_mainmenu());
	}
	@Then("need something else1 chat with an agent is Displayed")
	public void need_something_else1_chat_with_an_agent_is_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(WU_Submenu_buttons.change_transfer_chat_with_agent());
	}
	@Then("Click on need something else1 main menu button")
	public void click_on_need_something_else1_main_menu_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WU_Submenu_buttons.change_transfer_mainmenu_click();
		Thread.sleep(3000);
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}
