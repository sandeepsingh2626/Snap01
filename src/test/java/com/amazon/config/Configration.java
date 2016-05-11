package com.amazon.config;

public class Configration 
{
	//# Website URL
	
	public static final String testsite = "https://www.amazon.in";
  
	//# Element Locators: AmazonHomePage

	public static final String NaviagateIcon =".//*[@id='nav-link-yourAccount']/span[2]/span";

	//# Element Locators: AmazonLoginPage

	public static final String UserName = "//div[1]/input[attribute::id]";
    public static final String Password =".//input[@id='ap_password']";
    public static final String Login =".//input[@id='signInSubmit']";

	//# Element Locators: AmazonPersonalizedHomePage

    public static final String UserAccount=".//*[@id='nav-link-yourAccount']/span[@class='nav-line-1']";
}
