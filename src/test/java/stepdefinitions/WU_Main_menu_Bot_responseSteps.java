package stepdefinitions;

import org.junit.Assert;

import com.pages.WU_Main_menu_Bot_response;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WU_Main_menu_Bot_responseSteps {
	
	private WU_Main_menu_Bot_response WU_Main_menu_Bot_response = new WU_Main_menu_Bot_response(DriverFactory.getDriver());
//	//VerificationPage verificationPage = new VerificationPage(null);
//	//private VerificationPage verificationPage = new VerificationPage();
//	//private Homepage homePage = new Homepage();
//	  //Homepage homePage = new Homepage();
	
	@Given("user is on WU_page page")
	public void user_is_on_WU_page_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://dev-01.skil.ai/ai-demo/html/pages/wu-assisstant-v1.html");
		Thread.sleep(5000);
		
		}

	
	@When("Click on  Wu chatbot icon")
	public void Click_on_Wu_chatbot_icon() throws InterruptedException {
		WU_Main_menu_Bot_response.Chatbot_icon();;
		Thread.sleep(4000);
		}
	
	@Then("Greeting message is Displayed")
	public void Greeting_message_is_Displayed() throws InterruptedException {
		//loginPage.Existing_tranfer();
		Assert.assertTrue(WU_Main_menu_Bot_response.Greeting_message());
	}
	
	
	@Then("Existing transfer is Displayed")
	public void Existing_transfer_is_visible() throws InterruptedException {
		//loginPage.Existing_tranfer();
		Assert.assertTrue(WU_Main_menu_Bot_response.Existing_tranfer());
	}
	@Then("Genral enqire is Displayed")
	public void Genral_enqire_is_visisble() throws InterruptedException {
		//loginPage.Genral_eniqure();
		Assert.assertTrue(WU_Main_menu_Bot_response.Genral_eniqure());

	}
	@Then("Products services is Displayed")
	public void Products_services_is_visible() throws InterruptedException {
		//loginPage.Products_Services();
		Assert.assertTrue(WU_Main_menu_Bot_response.Products_Services());
	}
	
	@Then("WUcom Mobile app is Displayed")
	public void WUcom_Mobile_app_is_visible() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.WUcom_Mobileapp());
	}
	@Then("Chat with an agent is Displayed")
	public void Chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.Chat_with_an_agent());
	}
	
	@Then("Click on Existing transfer button")
	public void Click_on_Existing_transfer_button() throws InterruptedException {
		WU_Main_menu_Bot_response.Existing_tranfer_click();
		Thread.sleep(8000);
		}
	@Then("change transfer button Displayed")
	public void change_transfer_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.change_transfer());
	}
	@Then("cancel refund button Displayed")
	public void cancel_refund_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.cancel_refund());
	}
	@Then("fraud button Displayed")
	public void fraud_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.fraud());
	}
	@Then("need something else button Displayed")
	public void need_something_else_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.need_something_else());
	}
	@Then("mainmenu button Displayed")
	public void mainmenu_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.mainmenu());
	}
	
	@Then("Existing transfer Chat with an agent is Displayed")
	public void Existing_transfer_Chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.Chat_with_an_agent());
	}
	@Then("Click on manin menu")
	public void Click_on_manin_menu() throws InterruptedException {
		WU_Main_menu_Bot_response.mainmenu_click();
		Thread.sleep(5000);
		}
	@Then("Click on Genral enqire")
	public void Click_on_Genral_enqire() throws InterruptedException {
		WU_Main_menu_Bot_response.Genral_eniqure_click();
		Thread.sleep(8000);
		}
	@Then("send money button is Displayed")
	public void send_money_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.send_money());
	}
	@Then("receive money button is Displayed")
	public void receive_money_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.receive_money());
	}
	@Then("pricing fx rates button is Displayed")
	public void pricing_fx_rates_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.pricing_fx_rates());
	}
	@Then("id requirements button is Displayed")
	public void id_requirements_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.id_requirements());
	}
	@Then("customer complaint button is Displayed")
	public void customer_complaint_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.customer_complaint());
	}
	@Then("privacy button is Displayed")
	public void privacy_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.privacy());
	}
	@Then("fraud information button is Displayed")
	public void fraud_information_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.fraud_information());
	}
	@Then("general inquire mainmenu button Displayed")
	public void general_inquire_mainmenu_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.mainmenu());
	}
	
	@Then("general inquire Chat with an agent is Displayed")
	public void general_inquire_Chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.Chat_with_an_agent());
	}
	
	@Then("Click on general inquire main menu")
	public void Click_on_general_inquire_main_menu() throws InterruptedException {
		WU_Main_menu_Bot_response.mainmenu_click();
		Thread.sleep(5000);
		}
	@Then("Click on product and services")
	public void Click_on_product_and_services() throws InterruptedException {
		WU_Main_menu_Bot_response.product_and_services();
		Thread.sleep(8000);
		}
	@Then("bill payment button is Displayed")
	public void bill_payment_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.bill_payments());
	}
	@Then("Loyality button is Displayed")
	public void Loyality_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.loyalty());
	}
	@Then("money order button is Displayed")
	public void money_order_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.money_orders());
	}
	@Then("promotion button is Displayed")
	public void promotion_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.promotions());
	}
	@Then("amazon paycodes button is Displayed")
	public void amazon_paycodes_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.amazon_paycode());
	}
	@Then("prepaid button is Displayed")
	public void prepaid_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.prepaid_cards());
	}
	@Then("product and services mainmenu button Displayed")
	public void product_and_services_mainmenu_button_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.mainmenu());
	}
	
	@Then("product_and_services_Chat with an agent is Displayed")
	public void product_and_services_Chat_with_an_agent_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.Chat_with_an_agent());
	}
	
	@Then("Click on product and services main menu button")
	public void Click_on_product_and_services_main_menu_button() throws InterruptedException {
		WU_Main_menu_Bot_response.product_and_services_mainmenu_click();
		Thread.sleep(5000);
		}
	@Then("Click on wucom_mobileapp button")
	public void Click_on_wucom_mobileapp_button() throws InterruptedException {
		WU_Main_menu_Bot_response.wucom_mobileapp();
		Thread.sleep(8000);
		}
	
	
	@Then("registration button is Displayed")
	public void registration_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.registration());
	}
	
	@Then("password reset button is Displayed")
	public void password_reset_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.password_reset());
	}
	
	@Then("unlock account button is Displayed")
	public void unlock_account_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.unlock_account());
	}
	
	@Then("account update button is Displayed")
	public void account_update_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.account_update());
	}
	
	@Then("pin request button is Displayed")
	public void pin_request_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.pin_request());
	}
	
	@Then("usage assistance button is Displayed")
	public void usage_assistance_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.usage_assistance());
	}
	
	@Then("wucom mobileapp fraud button is Displayed")
	public void wucom_mobileapp_fraud_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.wucom_mobileapp_fraud());
	}
	
	@Then("wucom mobileapp need_something else button is Displayed")
	public void wucom_mobileapp_need_something_else_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.wucom_mobileapp_need_something_else());
	}
	
	@Then("wucom mobileapp main menu button is Displayed")
	public void wucom_mobileapp_main_menu_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.mainmenu());
	}
	
	@Then("wucom mobileapp chat with an agent button is Displayed")
	public void wucom_mobileapp_chat_with_an_agent_button_is_Displayed() throws InterruptedException {
		//loginPage.WUcom_Mobileapp();
		Assert.assertTrue(WU_Main_menu_Bot_response.Chat_with_an_agent());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	    @Given("user on Verification page")
//	    public void user_on_verification_page() {
//	    	
//	       
//	    }

//
//	    @Then("user give the verififcationcode {string}")
//	    public void user_give_the_verififcation_code(String verififcationcode) {
//	    	verificationPage.verificationcode(verififcationcode);
//
//	    }
//	    @Then("user click on verify button")
//	    public void user_click_on_verify_button() {
//	    	verificationPage.verify_button();
//	    	}
////	    
////        @Given("user on home page")
////	        public void user_on_home_page() {
////	              }
//
//
//	        @Then("user click on request meeting button")
//	        public void user_click_on_request_meeting_button() {
//	        	homePage1.Request_BotMeeting();
	        }

	    

	



