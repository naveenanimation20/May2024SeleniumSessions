package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowMaximizeMinimize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		//viewport -- window size: 
		
		
	}

}
