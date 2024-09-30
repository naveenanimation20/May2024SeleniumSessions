package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodChainingRegisterPage {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		
		Actions act = new Actions(driver);
		
		Action action = act.sendKeys(firstName, "Mukul")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("Prashar")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("Prashar123@gmail.com")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("98989898988")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("Prashar@123")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys("Prashar@123")
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.SPACE)
			.pause(500)
			.sendKeys(Keys.TAB)
			.pause(500)
			.sendKeys(Keys.ENTER)
			.build();
		
		action.perform();
		
		
		
		
	}

}
