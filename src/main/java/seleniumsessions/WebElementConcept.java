package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//Create a Webelement (FE) + perform action(click, sendKeys, getText, isDisplayed)
		
		//1.
//		driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
				
		
		//2. 
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("test@gmail.com");
//		password.sendKeys("test@123");
		
		//3. By locator
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement email_ele = driver.findElement(emailId);
//		WebElement pwd_ele = driver.findElement(password);
//
//		email_ele.sendKeys("tom@gmail.com");
//		pwd_ele.sendKeys("tom@123");
		
		//4. By locator + generic method for webelement
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");
		
		//5. By locator + generic method for webelement and action
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(emailId, "test@gmail.com");
//		doSendKeys(password, "test@123");
		
		//6. By locator + generic method for webelement and action in ElementUtil class
	
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.doSendKeys(emailId, "test@gmail.com");
		elUtil.doSendKeys(password, "test@123");
	
	}
	
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	
	
	
	
	

}
