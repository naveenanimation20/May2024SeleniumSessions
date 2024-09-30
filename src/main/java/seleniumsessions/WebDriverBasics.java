package seleniumsessions;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		
		//windows os:
		//System.setProperty("webdriver.chrome.driver", "C:\\Documents\\MyDrivers\\chromedriver.exe");

		
		//mac os:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Documents/MyDrivers/chromedriver");
		
		//chrome browser(126) ----> chromedriver.exe(126.exe)
		//chrome (127) 
		
		//SM: 4.6+
		
		
		// open chrome browser
		 ChromeDriver driver = new ChromeDriver();

		// FirefoxDriver driver = new FirefoxDriver();

		// EdgeDriver driver = new EdgeDriver();

		//SafariDriver driver = new SafariDriver();

		// enter url
		driver.get("https://www.google.com");
		// get the title
		String title = driver.getTitle();
		System.out.println(title);

		// act vs exp: validation/checkpoint
		if (title.equals("Google")) {
			System.out.println("Correct title -- PASS");
		} else {
			System.out.println("in correct title -- FAIL");
		}

		// automation steps + validation point ==> automation testing

		// close browser
		driver.quit();

	}

}
