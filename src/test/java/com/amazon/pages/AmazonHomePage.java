package com.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.config.Configration;

public class AmazonHomePage 
{
	WebDriver driver;
	
	public AmazonHomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	@FindBy(xpath=Configration.NaviagateIcon)
	public WebElement NaviagateIcon;
	
	
	public AmazonLoginPage MoveToSignInPage()
	{
		NaviagateIcon.click();
		
		return PageFactory.initElements(driver, AmazonLoginPage.class);
	}
}
