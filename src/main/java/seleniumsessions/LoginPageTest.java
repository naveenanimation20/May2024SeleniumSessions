package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageTest {
	

	public static void main(String[] args) {
		
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver("chrome");
		
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println(brUtil.getPageTitle());

		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		
		elUtil.doSendKeys(emailId, "test@gmail.com");
		elUtil.doSendKeys(password, "test@123");
		
		brUtil.quitBrowser();
		
	}

}
