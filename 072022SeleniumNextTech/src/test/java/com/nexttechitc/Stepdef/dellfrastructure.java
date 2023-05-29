package com.nexttechitc.Stepdef;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class dellfrastructure {
    WebDriver driver;
    @Given("^user landing Dell homepage$")
    public void user_landing_Dell_homepage() throws Throwable {
    	//how to open browser;
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\palak\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        //how to open URL
           driver.get("https://www.amazon.com/");
           Thread.sleep(3000);
    }

    @When("^user go to IT_infrastructure dropdown menu and able to see IT_infrastraction$")
    public void user_go_to_IT_infrastructure_dropdown_menu_and_able_to_see_IT_infrastraction() throws Throwable {
        Actions act=new Actions(driver);
        DellfrastructurePOM obj= new DellfrastructurePOM(driver);
        
        
    }
}
