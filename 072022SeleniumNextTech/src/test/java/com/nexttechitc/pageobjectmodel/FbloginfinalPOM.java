package com.nexttechitc.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginfinalPOM {
	WebDriver driver;
	  public  FbloginfinalPOM (WebDriver driver) {
	     this.driver=driver;
	     PageFactory.initElements(driver, this);
	  }
	
	  @FindBy(id="email")
	  
	   WebElement enter_email;
	     
	   public WebElement email(){
	   return enter_email;
	   }
	
	   @FindBy(id="pass")
		 WebElement enter_password;
		 public WebElement password() {
		 return  enter_password;
		     }
		 
		 
		 @FindBy(xpath="//*[@id=\"loginbutton\"]")
		 WebElement click_login;
		 public WebElement login() {
		return click_login;
	}

}