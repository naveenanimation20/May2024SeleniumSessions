package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

//		boolean flag = driver.findElement(By.className("img-responsive11")).isDisplayed();
//		System.out.println(flag);
//
//		if (flag) {
//			System.out.println("logo is present");
//		} else {
//			System.out.println("logo is not present");
//		}

		By logo = By.className("img-responsive11");
		if(isElementDisplayed(logo)) {
			System.out.println("logo is present");
		}
		else {
			System.out.println("logo is not present");
		}
		
	}

	public static boolean isElementDisplayed(By locator) {

		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed : " + locator);
			return false;
		}

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
