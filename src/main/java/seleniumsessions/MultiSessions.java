package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiSessions {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//123
		driver = new ChromeDriver();//456
		driver = new ChromeDriver();//890
		
		//driver = new FirefoxDriver();//987
		driver.get("https://www.google.com");
		
		driver.quit();// 3rd chrome will be closed: 890--->null
		driver.close();// 3rd chrome will be closed
	}

}
