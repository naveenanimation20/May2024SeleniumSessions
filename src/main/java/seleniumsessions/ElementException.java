package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementException {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//create the webelement + perform action (SK)
		WebElement element = driver.findElement(By.id("input-email11"));//NoSuchElementException
		element.sendKeys("test@gmail.com");
		
		
		
	}

}
