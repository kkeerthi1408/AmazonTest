package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductDetailspage {
	
	WebDriver driver;
	
	By productDetails=By.id("productTitle");
	By productsizebase=By.className("a-size-base");
	
	public ProductDetailspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void productDetailResults()
	{
		driver.findElement(productDetails).click();
	}
	public void productsizebasedetails()
	{
		driver.findElement(productsizebase).click();
	}

}
