package day42;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MyFirstTestcase {
	
	WebDriver driver;
	
	@Test(priority = 1)
	void open() {
		System.out.println("The application is opened....");
	}
	
	@Test(priority = 2)
	void login() {
		System.out.println("You logged into the application.....");
	}
	
	@Test(priority = 3)
	void logout() {
		System.out.println("You logged out of the application...");
	}
	
	
	
	

}
