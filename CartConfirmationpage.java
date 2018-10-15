package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartConfirmationpage {
	
WebDriver driver;
	
	By cartDetails=By.xpath("//*[@id=\"hlb-ptc-btn-native\"]");

	
	public CartConfirmationpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void CartConfirmationdetails()
	{
		driver.findElement(cartDetails).click();
	}

}
