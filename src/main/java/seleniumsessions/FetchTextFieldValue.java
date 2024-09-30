package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTextFieldValue {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		
		
//		driver.findElement(By.id("email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("naveen@123");
//
//		
//		String text = driver.findElement(By.id("password")).getAttribute("value");
//		System.out.println(text);
		
		By emailId = By.id("email");
		By password = By.id("password");
		By hereLink = By.linkText("here");
		
		doSendKeys(emailId, "naveen@gmail.com");
		String v1 = doElementGetAttribute(emailId, "value");
		System.out.println(v1);
		
		
		String v2 = doElementGetAttribute(password, "placeholder");
		System.out.println(v2);
		
		String hrefVal = doElementGetAttribute(hereLink, "href");
		System.out.println(hrefVal);
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	//WE: FE
	//WEs: FEs
	//text: getText
	//attribute: getAttribute
	//type: sendkeys
	//click: click
	//isDisplayed, isEnabled, isSelected
	
	
	//CDP 
	//125 --> sel 4.22 (125)
	//126 --> sel 4.22(125)
	//127 --> sel 4.22(125/126)
	
	//“WARNING: Unable to find an exact match for CDP version 127, returning the closest version; found: 126; Please update to a Selenium version that supports CDP version 127

}
