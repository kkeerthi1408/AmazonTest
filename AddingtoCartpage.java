package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class AddingtoCartpage {

WebDriver driver;
	
	By productcart= By.id("add-to-cart-button");
	
	public AddingtoCartpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void cartresult()
	{
		driver.findElement(productcart).click();
		
		
		
	}

	

}
