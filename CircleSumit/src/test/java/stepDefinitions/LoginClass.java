package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class LoginClass {

 
 
		
		 @Given("User login to google")
		public void user_login_to_google() {
		    
			 System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

			 WebDriver driver = new ChromeDriver();

			 driver.get("https://mvnrepository.com");

			 driver.close();	 
			 
		 System.out.println("Hello namo");
		 
		 
		 }



	}
	

