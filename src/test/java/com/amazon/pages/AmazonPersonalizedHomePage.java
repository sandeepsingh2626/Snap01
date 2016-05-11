package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.amazon.config.Configration;

public class AmazonPersonalizedHomePage 
{
    WebDriver driver;
		
    public AmazonPersonalizedHomePage(WebDriver driver)
	{
	  this.driver = driver;
	}
	  
		
	@FindBy(xpath=Configration.UserName)
	public WebElement UserAccount;
	
	
	public void GetUserAccountName()
	{
	   String UserAccountName = UserAccount.getText();
	   System.out.println("Name of User is : " + UserAccountName);
	   
	}
}
