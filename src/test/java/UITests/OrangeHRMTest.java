package UITests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class OrangeHRMTest extends BaseTest {

	@Test(priority = 1)
	public void pageTitleTest() {
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, "30-Day Advanced Free Trial | OrangeHRM");

	}

	@Test(priority = 2)
	public void pageURLTest() {
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertTrue(actualURL.contains("30-day-free-trial"));
	}

}

