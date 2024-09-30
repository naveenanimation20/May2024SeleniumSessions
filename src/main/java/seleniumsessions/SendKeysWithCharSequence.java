package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithCharSequence {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String name = "Naveen";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Labs");
		String lastName = null;
		
		driver.findElement(By.id("input-email")).sendKeys(name," ",sb," ",sf, "Selenium", lastName);

		
		//CharSequence -- I
			//String
			//StringBuffer
			//StringBuilder
		
		String hostname = "http://www.naveen.com";
		String port = "8080";
		String param = "/index.html";
		
		driver.findElement(By.id("input-email")).sendKeys(hostname,port,param);
				
		
	}

}
