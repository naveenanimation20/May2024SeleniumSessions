package seleniumsessions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitConcept {
	
	static WebDriver driver;


	public static void main(String[] args) {
		
		//Wait(until();) --> FluentWait(C): unit(){} + individual methods(){}
								//--> WebDriverWait (C): no methods
		
			driver = new ChromeDriver();
			driver.get("https://www.orangehrm.com/30-day-free-trial/");
			
			By firstName = By.id("Form_getForm_Name");
			
			//wait with fluent wait features:
//			Wait<WebDriver> wait =	new FluentWait<WebDriver>(driver)
//										.withTimeout(Duration.ofSeconds(10))
//										.pollingEvery(Duration.ofSeconds(2))
//										.ignoring(NoSuchElementException.class)
//										.withMessage("=====element is not found======");
//			
//			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");			
		
			
			//WebDriverWait with fluent wait features:
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wait.pollingEvery(Duration.ofSeconds(2))
//				.ignoring(NoSuchElementException.class)
//				.ignoring(StaleElementReferenceException.class)
//				.ignoring(ElementNotInteractableException.class)
//				.withMessage("=====element is not found======" + firstName);
//			
//			wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Naveen");			

		
//			driver.switchTo().newWindow(WindowType.WINDOW);
//			driver.get("https://www.google.com");
//			System.out.println(driver.getTitle());//Google
//			
//			driver.switchTo().newWindow(WindowType.TAB);//moving back to parent window and opening a new tab in parent
//			driver.get("https://www.yahoo.com");

			
		
	}
	
	//WebDriverWait without fluent wait features:
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}

}
