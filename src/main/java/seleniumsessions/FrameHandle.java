package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();//browser

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//page
		Thread.sleep(3000);
		
		int frameCount = driver.findElements(By.tagName("frame")).size();
		System.out.println(frameCount);
		
		
		//frame: deprecated
		//iframe: w3c
		
		//driver.switchTo().frame(2);	
		//driver.switchTo().frame("main");
		driver.switchTo().frame(driver.findElement(By.name("main")));
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
	}

}
