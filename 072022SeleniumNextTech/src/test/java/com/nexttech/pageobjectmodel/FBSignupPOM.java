package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBSignupPOM<WebElemant> {
	WebDriver deriver;

	WebDriver driver;
	public  FBSignupPOM (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	  
	@FindBy(xpath="//*[@name=\"firstname\"]")
	WebElement edit_firstname;
	public WebElement firstname() {
	return edit_firstname;
	  }
	@FindBy(name="lastname")
	WebElement edit_lastname;
	public WebElement lastname() {
	return  edit_lastname;
	   }
	    
	@FindBy(name="reg_email__")
	WebElement edit_email;
	public WebElement email() {
	return  edit_email;
	}


	@FindBy(id="password_step_input")
	 WebElement edit_password;
	 public WebElement password() {
	 return  edit_password;
	     }
	    
	   @FindBy(xpath="//*[@id=\"month\"]")
	public WebElement click_month;
	    
	      
	 @FindBy(id="day")
	public WebElement click_day;
	        
	        
	 @FindBy(id="year")
	public WebElement click_year;
	 
	 
	 @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/label")
	 WebElement click_gender_male;
	 public WebElement gendermale() {
	return click_gender_male;
	 }
	 
	 @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[11]/button")
	 WebElement click_signup;
	 public WebElement signup() {
		 return click_signup;
	}
	}