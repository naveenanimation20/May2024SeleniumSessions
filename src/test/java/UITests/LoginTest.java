package UITests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class LoginTest extends BaseTest {

	// AAA:
	// test: only one assertion should be mentioned
		

	@Test(priority = 1)
	public void pageTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "Account Login");

	}

	@Test(priority = 2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("route=account/login"));
	}

	@Test(priority = 3)
	public void pageLogoTest() {
		Assert.assertTrue(driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed());
	}
	
	
}
