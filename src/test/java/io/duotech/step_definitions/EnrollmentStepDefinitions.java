package io.duotech.step_definitions;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.duotech.pages.EnrollmentPage;
import io.duotech.pages.HomePage;
import io.duotech.utilities.BrowserUtilities;
import io.duotech.utilities.ConfigReader;
import io.duotech.utilities.Driver;

public class EnrollmentStepDefinitions {
	
	
//	@Given("The user is on homepage")
//	public void homepage () {
//		System.out.println("My own step def");
//	}
	
	@Given("The user is on homepage")
	public void the_user_is_on_homepage() {
	   
		Driver.getDriver().get(ConfigReader.getConfiguration("url"));
	   
	}

	@When("The user clicks on enroll button")
	public void the_user_clicks_on_enroll_button() {
		 HomePage homepage = new HomePage();
		 homepage.enrollButton.click();
		 BrowserUtilities.waitFor(2);

	}

	@Then("The title of the page should be Enroll | duotech")
	public void the_title_of_the_page_should_be_Enroll_duotech() {
		  String actual = Driver.getDriver().getTitle();
		  String expected = "Enroll | duotech";
		  Assert.assertEquals(expected, actual);

	}
	
//	@Then("The correct message should be there")
//	public void the_correct_message_should_be_there() {
//	    String expected = "SQAE Summer (06.02.2020)";
//	    String actual = new EnrollmentPage().dateElement.getText();
//	    Assert.assertEquals(expected, actual);
//	    
//	}

}
