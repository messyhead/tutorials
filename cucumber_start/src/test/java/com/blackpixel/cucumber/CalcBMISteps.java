package com.blackpixel.cucumber;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcBMISteps {

	private WebDriver browser;
	private String baseUrl;

	@Before(value = "@BMI_Calculator")
	public void initialise() {
		//System.setProperty("webdriver.chrome.driver", "/home/mike/Dropbox/Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
		browser = new ChromeDriver();
		baseUrl = "http://www.nhlbi.nih.gov/health/educational/lose_wt/BMI/bmi-m.htm";
		browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		browser.get(baseUrl);
	}
	
	@After(value="@BMI_Calculator")
	public void tearDown() {
		browser.close();
	}

	@When("\"([^\"]*)\" and \"([^\"]*)\" are entered into the calculator$")
	public void and_are_entered_into_the_calculator(String height, String weight) {
		WebElement heightBox = browser.findElement(By.name("htc"));
		heightBox.sendKeys(height);
		WebElement weightBox = browser.findElement(By.name("kg"));
		weightBox.sendKeys(weight);
	}
	
	@When("^Calculate BMI button is clicked$")
	public void Calculate_BMI_button_is_clicked() {
	    WebElement computeBMI = browser.findElement(By.cssSelector("input[type='button'][value='Compute BMI']"));
	    computeBMI.click();
	}

	@Then("^the BMI should be \"([^\"]*)\"")
	public void the_BMI_should_be_(String expectedBMI) {
		String actualBMI = browser.findElement(By.id("yourbmi")).getAttribute("value");
		assertTrue(actualBMI.equals(expectedBMI));
	}
	
}
