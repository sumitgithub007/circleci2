package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;

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

			 driver.get("https://mvnrepository.com");

			 driver.close();	 
			 
		 System.out.println("Hello namo");
		 
		 
		 
		 }



	}
	

