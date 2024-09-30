package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClose {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();//123

		// enter url
		driver.get("https://www.google.com");//123
		// get the title
		String title = driver.getTitle();//123
		System.out.println(title);

		// act vs exp: validation/checkpoint
		if (title.equals("Google")) {
			System.out.println("Correct title -- PASS");
		} else {
			System.out.println("in correct title -- FAIL");
		}

		//driver.quit();//quit browser//123
		driver.close();//close browser
		//123--null: quit
		
		driver = new ChromeDriver();//456
		driver.get("https://www.google.com");//456
		System.out.println(driver.getTitle());//456

		
		
	}

}
