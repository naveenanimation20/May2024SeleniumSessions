package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorsWithLabels {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		WebElement emailLabel = driver.findElement(By.xpath("//label[text()='E-Mail Address']"));
		WebElement pwdLabel = driver.findElement(By.xpath("//label[text()='Password']"));

	
		//driver.findElement(with(By.id("input-email")).below(label)).sendKeys("mianl@gmail.com");
		
		driver.findElement(with(By.id("input-email")).below(emailLabel).above(pwdLabel)).sendKeys("minal@gmail.com");

		
	
	
	}

}
