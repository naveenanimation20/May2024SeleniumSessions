package seleniumsessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserWindowHandingConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");//parent window
		
		// target="_blank" -- new window/tab
		
		WebElement executiveProfile = driver.findElement(By.xpath("//footer//a[contains(text(),'Executive Profile')]"));
		//executiveProfile.click(); //child window
		Actions act = new Actions(driver);
		act.click(executiveProfile).perform();//child window
		
		//1. fetch the window ids for parent and child windows
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String parentWidnowId = it.next();
		System.out.println("parent window id : " + parentWidnowId);
		
		String childWindowId = it.next();
		System.out.println("child window id : " + childWindowId);
		

		//2. switching work:
		
		driver.switchTo().window(childWindowId);
		System.out.println("child window title: " + driver.getTitle());
		driver.close();//close the child window
		//driver is lost
		
		driver.switchTo().window(parentWidnowId);//back to parent window
		System.out.println("parent window title: " + driver.getTitle());

		driver.quit();//quit the parent window
				
	}

}
