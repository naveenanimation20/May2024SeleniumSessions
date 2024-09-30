package UITests;

import org.testng.annotations.Test;

public class Testing {

	@Test
	public void loginTest() {
		System.out.println("login test");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("search test");
		int i = 9/0;

	}

}
