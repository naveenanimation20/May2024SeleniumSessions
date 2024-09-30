package seleniumsessions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to init the driver on the basis of given browser name
	 * 
	 * @param browserName
	 * @return this returns driver
	 */
	public WebDriver initDriver(String browserName) {

		System.out.println("browser name : " + browserName);

		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;

		default:
			System.out.println("plz pass the right browser....");
			throw new BrowserException("====INVALID BROWSER=====");
		}

		return driver;

	}

	/**
	 * 
	 * @param url
	 */
	public void launchURL(String url) {
		if (url.indexOf("http") != 0) {
			throw new BrowserException("http(s) is missing in URL");
		}
		driver.get(url);
	}
	
	
	
	
	
	public void launchURL(URL url) {
		driver.navigate().to(url);
	}

	/**
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	public String getPageURL() {
		return driver.getCurrentUrl();
	}

	public void quitBrowser() {
		driver.quit();
	}

	public void closeBrowser() {
		driver.close();
	}

}
