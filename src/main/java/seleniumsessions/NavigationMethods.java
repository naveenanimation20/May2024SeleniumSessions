package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		//back and forward browser simulation
		
		WebDriver driver = new ChromeDriver();//normal
		
//		driver.get("https://www.google.com/");
//		System.out.println(driver.getTitle());
//		
//		Thread.sleep(1000);
//		
//		//driver.navigate().to("https://www.amazon.com/");
//		driver.get("https://www.amazon.com/");
//		System.out.println(driver.getTitle());
//
//		Thread.sleep(1000);
//
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//
//		
//		Thread.sleep(1000);
//
//		driver.navigate().forward();
//		System.out.println(driver.getTitle());
//
//		
//		Thread.sleep(1000);
//
//		driver.navigate().back();
//		System.out.println(driver.getTitle());
//		
		
		//
//		driver.get("https//google.com");
		//driver.navigate().to("https://www.amazon.com/");
		//driver.navigate().to(new URL("https://www.amazon.com"));
		
		driver.navigate().refresh();
		
	}

}
