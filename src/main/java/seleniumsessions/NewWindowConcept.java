package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");
		String parentWindowId = driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.TAB);//it will open a blank tab and switch to it as well
		
		driver.switchTo().newWindow(WindowType.WINDOW);//it will open a blank window and switch to it as well
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		driver.close();
		
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent title: "  + driver.getTitle());
		
		
	}

}
