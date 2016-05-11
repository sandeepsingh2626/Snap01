package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.config.Configration;

public class AmazonLoginPage 
{
    WebDriver driver;
	
	public AmazonLoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
  
	@FindBy(xpath=Configration.UserName)
	public WebElement UserName;
	
	@FindBy(xpath=Configration.Password)
	public WebElement Password;
	
	@FindBy(xpath=Configration.Login)
	public WebElement Login;
	
	
	
	
	public AmazonPersonalizedHomePage DoLogin(String User, String Pass)
	{
	   UserName.sendKeys(User);
	   Password.sendKeys(Pass);
	   Login.click();
	   
	   return PageFactory.initElements(driver, AmazonPersonalizedHomePage.class);
	}
}
