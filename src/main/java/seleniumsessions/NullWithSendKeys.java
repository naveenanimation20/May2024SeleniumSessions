package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NullWithSendKeys {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//driver.findElement(By.id("input-email")).sendKeys(null);
		//IllegalArgumentException: Keys to send should be a not null CharSequence
		
		String name = "";
		System.out.println(name.length());
		driver.findElement(By.id("input-email")).sendKeys(name);

		
	}

}
