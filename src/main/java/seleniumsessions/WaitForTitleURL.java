package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleURL {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.findElement(By.linkText("Login")).click();

		// driver.getTitle();//loading.... checking... null

//		String title = getPageTitleIs("Free CRM software for customer relationship management, sales, and support.", 5);
//		System.out.println(title);
		
		
//		String title = getPageTitleContains("customer relationship management", 5);
//		System.out.println(title);
		
		
		ElementUtil elutil = new ElementUtil(driver);
		String url = elutil.getPageURLContains("route=account/login", 5);
		System.out.println(url);
		
	}
	
	
	public static String getPageTitleIs(String expectedTitle, int timeOut) {
		if(waitForTitleIs(expectedTitle, timeOut)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
	
	public static String getPageTitleContains(String expectedTitle, int timeOut) {
		if(waitForTitleContains(expectedTitle, timeOut)) {
			return driver.getTitle();
		}
		else {
			return "-1";
		}
	}
	

	public static boolean waitForTitleIs(String expectedTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		try {
			return wait.until(ExpectedConditions.titleIs(expectedTitle));//if title is not matched, it will be throw timeOut exception
		} catch (TimeoutException e) {
			System.out.println("title is not matched");
			return flag;
		}
	}
	
	
	public static boolean waitForTitleContains(String fractionTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		boolean flag = false;
		try {
			return wait.until(ExpectedConditions.titleContains(fractionTitle));
		} catch (TimeoutException e) {
			System.out.println("title is not matched");
			return flag;
		}
	}

}
