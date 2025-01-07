package day44.dependencyMethod;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyMethod {
	
	SoftAssert sa = new SoftAssert();
	
	@Test(priority = 1)
	void openapp() {
		sa.assertTrue(true);
		System.out.println("The Application is opened....");
		sa.assertAll();
	}
	
	@Test(priority = 2, dependsOnMethods = "openapp")
	void openSongs() {
		sa.assertTrue(true);
		System.out.println("The Songs Album is visble...");
		sa.assertAll();
	}
	@Test(priority= 2, dependsOnMethods = "openapp")
	void CalenderView() {
		sa.assertTrue(true);
		System.out.println("The Calender is opened...");
		sa.assertAll();
	}
	
	@Test(priority = 3,dependsOnMethods = "openSongs")
	void songsListView() {
		sa.assertTrue(false);
		System.out.println("The Songs ListView is Visible");
		sa.assertAll();
	}
	
	
	
	

}
