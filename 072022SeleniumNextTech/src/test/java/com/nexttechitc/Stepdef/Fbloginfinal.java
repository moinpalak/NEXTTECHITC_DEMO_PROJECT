package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.pageobjectmodel.FbloginfinalPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbloginfinal {
	WebDriver driver;
	@Given("^User visits facebook home page$")
	public void user_visits_facebook_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\palak\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");		  
		driver=new ChromeDriver();
		// how to open URL
				driver.get("https://www.facebook.com/login/");
		      Thread.sleep(3000);
		      //To maximize the window
		      driver.manage().window().maximize();
	}
	

	@When("^User enters valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void user_enters_valid_and_valid(String arg1, String arg2) throws Throwable {
		FbloginfinalPOM enter=new FbloginfinalPOM(driver);
		enter.email().sendKeys(arg1);
		enter.password().sendKeys(arg2);
	}

	@When("^User clicks on iogin button$")
	public void user_clicks_on_iogin_button() throws Throwable {
		FbloginfinalPOM obj=new FbloginfinalPOM(driver);
		obj.email().click();
}
	
    @Then("^user will be able to successfully login\\.$")
	public void user_will_be_able_to_successfully_login() throws Throwable {
	}
}