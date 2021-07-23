package stepdefinitions;

import com.pages.WU_Submenu_buttons;
import com.pages.WU_Main_menu_Bot_response;
import com.pages.RequestMeetingPage;
import com.pages.Existing_transfer_Bot_response;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestMeetingSteps {
	
	
	private WU_Main_menu_Bot_response loginpage = new WU_Main_menu_Bot_response(DriverFactory.getDriver());
	private Existing_transfer_Bot_response verificationPage;
	//private VerificationPage verificationPage = new VerificationPage();
	//private Homepage homePage = new Homepage();
	private WU_Submenu_buttons homePage;
	private RequestMeetingPage requestmeetingpage;
	
	@Given("user has already logged into Requestmeeting page")
	public void user_has_already_logged_into_Requestmeeting_page() throws InterruptedException {
		DriverFactory.getDriver().get("https://dev-api.iempowernow.com/b/login-business");
		verificationPage = loginpage.doLogin();
		homePage = verificationPage.doLogin();
		requestmeetingpage = homePage.Request_BotMeeting();
       }
	@Given("user is on Requestmeeting page")
	public void user_is_on_Requestmeeting_page() {
       }
	
	@When("user enter applicant name")
	public void user_enter_applicant_name() throws InterruptedException {
		requestmeetingpage.applicantname();
	}

@Then("user enter applicant email")
	public void user_enter_applicant_email() throws InterruptedException {
	requestmeetingpage.applicantemail();;
	}

@Then("user enter country")
public void user_enter_country() throws InterruptedException {
	requestmeetingpage.country1();;
}
@Then("user enter code")
public void user_enter_code() throws InterruptedException {
	requestmeetingpage.code1();;
}
@Then("user enter mentor phone")
public void user_enter_mentor_phone() throws InterruptedException {
	requestmeetingpage.mentor_phone();;
}
@Then("user uploaded resume")
public void user_uploaded_resume() throws InterruptedException {
	requestmeetingpage.uploadresume();;
}
//@Then("user click on the submit resume")
//public void user_click_on_the_submit_resume() throws InterruptedException {
//	requestmeetingpage.clickonsubmitresume();;
//}
@Then("user enter technologies")
public void user_enter_technologies() throws InterruptedException {
	requestmeetingpage.technologies();
}
//@Then("user enter language")
//public void user_enter_language() throws InterruptedException {
//	requestmeetingpage.language();;
//}
@Then("user click on language")
public void user_click_on_language() throws InterruptedException {
	requestmeetingpage.clickonlanguage();
}
@Then("user click on built questions")
public void user_click_on_built_questions() throws InterruptedException {
	requestmeetingpage.clicklisabuildQuestions();
}
@Then("user enter notes")
public void user_enter_notes() throws InterruptedException {
	requestmeetingpage.notes();
}
@Then("user enter date and time")
public void user_enter_date_and_time() throws InterruptedException {
	requestmeetingpage.dateandtime();
}
@Then("user enter timezone")
public void user_enter_timezone() throws InterruptedException {
	requestmeetingpage.timezone();
}
@Then("user enter place")
public void user_enter_place() throws InterruptedException {
	requestmeetingpage.place();
}
@Then("user click on upsert and reset button")
public void user_click_on_upsert_and_reset_button() throws InterruptedException {
	requestmeetingpage.upsertandreset();
}
//@Then("user enter applicant name")
//public void user_enter_applicant_name() throws InterruptedException {
//	homePage.Request_BotMeeting();
//}
//@Then("user enter applicant name")
//public void user_enter_applicant_name() throws InterruptedException {
//	homePage.Request_BotMeeting();
//}
}
