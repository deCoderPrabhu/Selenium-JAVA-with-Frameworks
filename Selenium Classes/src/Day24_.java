import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Day24_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.demoblaze.com/index.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement> elements =  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h4[@class='card-title']")));
		
		for(WebElement p_name :elements) {
			System.out.println(p_name.getText());
		}
		driver.quit();

	}

}
