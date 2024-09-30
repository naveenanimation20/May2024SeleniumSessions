package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGHandle {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("q")).sendKeys("macbook pro");
		driver.findElement(By.xpath("//form[contains(@class,'header-form-search')]//*[local-name()='svg' and @fill='none']")).click();	}

}
