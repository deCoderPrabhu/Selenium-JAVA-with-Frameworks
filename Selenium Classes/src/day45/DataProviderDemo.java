package day45;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeClass
	void setup() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider = "dp")
	void testLogin(String email, String pwd) {
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		boolean status = driver.findElement(By.xpath("//h2[1]")).isDisplayed();
		
		if(status) {
			
			driver.findElement(By.xpath("(//a[@class='list-group-item'])[normalize-space()='Logout']")).click();
			Assert.assertTrue(status);
		}else {
			Assert.fail();
		}
	}
	
	@AfterClass
	void tearDown() {
		driver.close();;
	}
	
	
	
	@DataProvider(name="dp", indices= {0,3})
	Object[][] testData() {
		
		Object [][] data = {
				{"xyz@gmail.com","test@123"},
				{"john@gmail.com","test@123"},
				{"honney@gmail.com","test@123"},
				{"johnnysins69@gmail.com","test@123"},
				{"abc@gmail.com","test@123"}
		};
		
		return data;
	}
	

}
