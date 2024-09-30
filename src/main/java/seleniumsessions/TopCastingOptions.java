package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		//1. valid but only for Local -- only for chrome
		//ChromeDriver driver = new ChromeDriver();
		
		//2. recommended and valid -- Local
//		WebDriver driver = new ChromeDriver();
//		 driver = new FirefoxDriver();
		
		//3. recommended and valid -- remote machine(cloud, AWS, server, machine) - GRID
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		//4. valid but not recommended
		//SearchContext driver = new ChromeDriver();
		
		//5. recommended and valid
//		 RemoteWebDriver driver = new ChromeDriver();
//		 driver = new FirefoxDriver();
//		 driver = new EdgeDriver();
		
		//6. valid but only for chrome/edge
		//ChromiumDriver driver = new ChromeDriver();
		
		//7. valid but not recommended
		//SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);
		
		
		
	}

}
