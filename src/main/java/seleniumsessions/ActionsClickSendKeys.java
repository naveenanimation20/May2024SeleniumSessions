package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(driver.findElement(By.id("input-firstname")), "naveen").perform();
		
		act.click(driver.findElement(By.name("agree"))).perform();
		
		
		//WE.SK --> sendkeys
		//AC.SK -- move --> click --> send keys (user actions)
		
		//WE.Click ---> click
		//AC.Click -- move ---> click (user actions)
		
		//two ways of entering the value into a text field:
		//WE.SK
		//AC.SK
		//JS.SK
		
		
	}
	
	public void doActionsClick(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
	}
	
	public void doActionsSendKeys(By locator, String value) {
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	

}
