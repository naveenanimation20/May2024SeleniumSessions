package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementIsPresent {

static WebDriver driver;
	
	public static void main(String a[]) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logo = By.className("img-responsive");
		By rightPanelLinks = By.xpath("//div[@class='list-group']/a");
		By naveen = By.id("test");
		By forgotPwdLink = By.linkText("Forgotten Password");
		
//		int count = driver.findElements(logo).size();
//		
//		if(count == 1) {
//			System.out.println("logo is present");
//		}
//		else {
//			System.out.println("logo is not present");
//		}
		
		System.out.println(isElementPresent(logo));
		
		System.out.println(isElementPresent(logo, 1));
		
		System.out.println(isElementPresent(rightPanelLinks, 13));
		
		System.out.println(isElementPresent(naveen, 0));
		
		System.out.println(isElementPresentMultipleTimes(forgotPwdLink));
		
	}
	
	
	public static boolean isElementNotPresent(By locator) {
		if(getEelementsCount(locator) == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isElementPresentMultipleTimes(By locator) {
		if(getEelementsCount(locator) >= 1) {
			return true;
		}
		return false;
	}
	
	public static boolean isElementPresent(By locator, int expectedElementCount) {
		if(getEelementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}
	
	public static boolean isElementPresent(By locator) {
		if(getEelementsCount(locator)==1) {
			return true;
		}
		return false;
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static int getEelementsCount(By locator) {
		return getElements(locator).size();
	}
	
	

}
