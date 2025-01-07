package annotations_Assertions.pack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;

public class Test2 {
	
	@Test
	void openapp() {
		System.out.println("The Bhajan Application is opened...");
	}
	
	@BeforeMethod
	void login() {
		System.out.println("The user is logged in...");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("The User is logged out");
	}
	
	@AfterClass
	void ac() {
		System.out.println("Lets start Test1...");
	}
	
	@AfterTest
	void at() {
		System.out.println("The Test2 is ended");
	}
	
}
