package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import org.junit.Assert;

import org.openqa.selenium.By;


public class LoginClass {

 
 
		
		 @Given("User login to google")
		public void user_login_to_google() {
		    
				 ChromeOptions chr = new ChromeOptions();
			 chr.addArguments("--no-sandbox");
			 chr.addArguments("--headless");
			 chr.addArguments("--no-sandbox");
			 chr.addArguments("--disable-dev-shm-usage");
			 
			 chr.addArguments("--disable-gpu");
			 
				  //  
			 
			 System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

			 WebDriver driver = new ChromeDriver(chr);

			 //driver.get("https://mvnrepository.com");
			 driver.get("https://www.amazon.in/");
			 System.out.println("Title is ="+driver.getTitle());
			 Assert.assertEquals("sumit", "sumit");
			
				 System.out.println("url  is ="+driver.getCurrentUrl());
				String d= driver.findElement(By.xpath("//div[@id='nav-xshop']/a[1]")).getText();
		 System.out.println("value of xpath is ="+d);

			 driver.close();	 
			 
		 System.out.println("Hello namo");
		 
		 
		 
		 }



	}
	

