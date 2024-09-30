package seleniumsessions;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BasicAuthPopUp {

	public static void main(String[] args) {
		
		
		String username = "admin";
		String password = "admin";

		WebDriver driver = new ChromeDriver();
		//driver.get("https://"+username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");
		
		//Auth pop ups are not JS alerts
		// can not switch to auth pop ups
		
		//Selenium 4.x: HasAuthenticated:
		//only for chromiumdriver: chrome/edge
		((HasAuthentication)driver).register(() -> new UsernameAndPassword(username, password));
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		
		
		//AutoIT/Robot Class/Sikuli: windows os, 
		//linux/mac/headless/cloud/grid/aws/CIcd/jenkins
		
		
//		//recaptcha:
		//1. no automation
		//2. QA/Dev/Stage: disable captcha
		//3. hard code the captcha value in QA/dev 
//		
		
		
		
	}

}
