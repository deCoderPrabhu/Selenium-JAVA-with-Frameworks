package day44.groupings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingsMethod1 {
	
	
	@Test(priority = 1, groups="Sanity")
	void openapp() {
		System.out.println("The Bhajan Application is Opened....");
	}
	
	@Test(priority = 2, groups="regression")
	void checkReviewLink() {
		System.out.println("The Review Links is okay....playstore is opened");
		
	}
	
	@Test(priority =3, groups="Sanity")
	void openFavorites() {
		System.out.println("Open the favorites Tab...");
	}
	
	@Test(priority = 3, groups= "Sanity")
	void openSongs() {
		Assert.assertTrue(false);
		System.out.println("Songs Album view is opened...");
	}
	
	@Test(priority = 4, dependsOnMethods = "openSongs", groups = "Sanity")
	void openSongsListView() {
		System.out.println("Songs List View is opened....");
	}

}
