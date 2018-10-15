package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomepage {
	
	WebDriver driver;
	
	By searchDropdown=By.xpath("//*[@id=\"searchDropdownBox\"]");
	By searchTitle=By.id("twotabsearchtextbox");
	By searchButton=By.className("nav-input");
	
	public AmazonHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void selectdropdown()
	{
	
	  driver.findElement(searchDropdown).click();
	  Select Dropdown= new Select(driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")));
	  Dropdown.selectByIndex(12);
        
	 }

    public void typeSearchtitle()
	{
		driver.findElement(searchTitle).sendKeys("iphone x phone");
	}
	
	public void clickonSearchButton()
	{
		driver.findElement(searchButton).click();
	}
    
	
	

}
