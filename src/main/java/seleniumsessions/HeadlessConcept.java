package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessConcept {

	public static void main(String[] args) {

		//headless: no browser activity
		//no browser is visible
		//testing is happening behind the scene
		//faster
		//Cloud: linux machine, jenkins server(linux)
		//not recommended
		
		//chrome: ChromeOptions
		//firefox: FirefoxOptions
		//Edge: EdgeOptions
		
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
//		eo.addArguments("--Inprivate");

		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("--window-position", "-2400,-2400");
		
		final List<String> chromeArgs = List.of("--headless", "--incognito");
		co.addArguments(chromeArgs);
		
		
		//co.addArguments("--incognito");
		WebDriver driver = new EdgeDriver(eo);
		
//		FirefoxOptions fo = new FirefoxOptions();
//		fo.addArguments("--headless");
//		WebDriver driver = new FirefoxDriver(fo);		
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		System.out.println("title:" + driver.getTitle());
		
		driver.findElement(By.linkText("Forgotten Password")).click();
		
		System.out.println("title:" + driver.getTitle());

		driver.quit();
		
		
		//headless: htmlunitdriver
		//phantomJS/ghostDriver
		
		
		
		//129.x: blank window
		//window-size: 
		// --window-position=-2400,-2400
		
		
		
		
	}

}
