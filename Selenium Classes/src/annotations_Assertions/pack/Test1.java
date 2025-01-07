package annotations_Assertions.pack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.*;

public class Test1 {
	
	@BeforeTest
	void bt() {
		System.out.println("This is test1...");
	}
	@BeforeClass
	void bc() {
		System.out.println("The Test methods are ready to start");
	}
	
	@BeforeMethod
	void login() {
		System.out.println("You are logged in...");
	}
	
	@Test
	void openapp() {
		System.out.println("The Hotfoot Application is opened..");
	}
	
	@AfterMethod
	void logout() {
		System.out.println("The user is logged out");
	}
	

}

