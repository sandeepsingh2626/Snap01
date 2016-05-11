package com.amazon.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.amazon.config.Configration;
import com.amazon.pages.AmazonHomePage;
import com.amazon.pages.AmazonLoginPage;
import com.amazon.pages.AmazonPersonalizedHomePage;

public class TestAmazonLoginPage 
{
	
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
	    driver = new FirefoxDriver();
	    String baseUrl = Configration.testsite;
	    driver.get(baseUrl);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
	
	@Test
	public void Test1()
	{
		AmazonHomePage homepage = PageFactory.initElements(driver,AmazonHomePage.class);
		AmazonLoginPage loginpage = homepage.MoveToSignInPage();
		AmazonPersonalizedHomePage  personhomepage = loginpage.DoLogin("sandeepsingh2626@gmail.com", "05420120");
		personhomepage.GetUserAccountName();
	}
	
	@Test
	public void Test2()
	{
		System.out.println(" A competitor of Amazon");
	}
	
	
	
	@AfterTest
	public void TearDown()
	{
		driver.close();
	}
	
}
