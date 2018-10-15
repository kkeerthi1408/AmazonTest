package com.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultspage {
	
	WebDriver driver;
	
	 By productTitle= By.linkText("Apple iPhone X, Fully Unlocked 5.8\", 256 GB - Silver");
	
	
	public SearchResultspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void productresult()
	{
		
		driver.findElement(productTitle).click();
		
		

	}

}







