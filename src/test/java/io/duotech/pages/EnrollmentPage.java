package io.duotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.duotech.utilities.Driver;

public class EnrollmentPage {
	
	public EnrollmentPage () {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (xpath = "//span[contains(text(),'SQAE Summer (06.02.2020)')]")
	public WebElement dateElement;
	
}
