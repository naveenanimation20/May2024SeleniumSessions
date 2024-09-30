package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	public static void main(String[] args) {

		//locators in Selenium
		//create web element (FE) + perform action(click)
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");	
		
		
		By header = By.tagName("h1");
		By successPageHeader = By.tagName("h1");
		
		
		//1. id: is an attribute: unique -- I
//		driver.findElement(By.id("input-firstname")).sendKeys("Surya");
//		driver.findElement(By.id("input-lastname")).sendKeys("Automation");
		
		//2. name: is an attribute, can be duplicate -- II
		//driver.findElement(By.name("firstname")).sendKeys("surya");
		
		//3. className: is an attribute, can be duplicate -- III
		//driver.findElement(By.className("form-control")).sendKeys("Surya");
		
		//4. xpath: is not an attribute. address of the webelement in DOM
//		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Surya");
//		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Automation");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
		
		//5. cssSelector: is not an attribute.
		//CSS: Cascaded Style Sheet
//		driver.findElement(By.cssSelector("#input-firstname")).sendKeys("Surya");
//		driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary")).click();
		
		//6. linkText: only for links, but text can be duplicate
		//htmltag = <a>
		//driver.findElement(By.linkText("Forgotten Password")).click();
		
		//7. partialLinkText: only for links
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//Forgotten username
		//Forgotten Password
		
		//8. tagName:
//		String header = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(header);
//		if(header.equals("Register Account")) {
//			System.out.println("PASS");
//		}
//		else {
//			System.out.println("FAIL");
//		}
		
		
		
		
	}

}
