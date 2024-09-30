package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitForFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		
		
		By frameLocator = By.name("main");
		
		ElementUtil elUtil = new ElementUtil(driver);
		elUtil.waitForFrameUsingLocatorAndSwitchToIt(frameLocator, 5);
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);	
	}

}
