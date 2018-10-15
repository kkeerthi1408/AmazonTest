package com.amazon.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.pages.*;

public class ValidateAmazontest {
	

	@Test
	
	public void verifyhomepage() 
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\kkeer\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
		AmazonHomepage home=new AmazonHomepage(driver);
		
		home.selectdropdown();
		home.typeSearchtitle();
		home.clickonSearchButton();
		
	   SearchResultspage result=new SearchResultspage(driver);
		result.productresult();
		
		
		ProductDetailspage details=new ProductDetailspage(driver);
		details.productDetailResults();
		details.productsizebasedetails();
		
		
		AddingtoCartpage cart=new AddingtoCartpage(driver);
		cart.cartresult();
		
		CartConfirmationpage confirm=new CartConfirmationpage(driver);
		confirm.CartConfirmationdetails();
		
   }
	
 
 

}
