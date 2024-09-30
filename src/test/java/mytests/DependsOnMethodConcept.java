package mytests;

import org.testng.annotations.Test;

public class DependsOnMethodConcept {

	@Test()
	public void loginTest() {
		System.out.println("Login test");
		int i = 9/0;

	}

	@Test(dependsOnMethods = "loginTest")
	public void homePageTest() {
		System.out.println("home page test");

	}

	@Test(dependsOnMethods = "homePageTest")
	public void searchTest() {
		System.out.println("search test");

	}

}


