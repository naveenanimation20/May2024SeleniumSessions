package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserMultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");// parent window

		String parentWindowId = driver.getWindowHandle();

		// target="_blank" -- new window/tab

		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		WebElement pressReleases = driver.findElement(By.xpath("//footer//a[contains(text(),'Press Releases')]"));
		WebElement newsArticles = driver.findElement(By.xpath("//footer//a[contains(text(),'News Articles')]"));
		WebElement csSupport = driver.findElement(By.xpath("//footer//a[contains(text(),'CS & Support')]"));

		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();
		act.click(pressReleases).perform();
		act.click(newsArticles).perform();
		act.click(csSupport).perform();

		// 1. fetch the window ids:

		Set<String> handles = driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		while (it.hasNext()) {
			String windowId = it.next();
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());

			if (!windowId.equals(parentWindowId)) {
				driver.close();
			}

			Thread.sleep(1500);
		}

		driver.switchTo().window(parentWindowId);

		System.out.println("parent window title: " + driver.getTitle());

	}

}
