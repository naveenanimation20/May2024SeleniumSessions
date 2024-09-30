package seleniumsessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//sel 3.x
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//sel 4.x
		
		
		//global wait:
		//it will be applied on all the web elements by default
		//it can not be applied for the specific web elements
		//it can not be applied for the non webelements: title, url, windows, JS pop ups
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//login page: 10 secs
		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");//10
		//10 secs: 2 secs: 2 secs
		//10 secs: 12 secs: NSE timeout
		//10 secs: 5 secs: 5 secs
		
		
		driver.findElement(By.id("input-password")).sendKeys("naveen@123");//10
		driver.findElement(By.xpath("//input[@value='Login']")).click();//10
		
		//1
		//2
		//3
		//4
		//50		
		
		//home page: 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20
		//e4 
		//e5
		//e6

		//login page: 10 secs:
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//10
		
		//register page: 5 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//5

		//search : 0 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));//0 -- nullify of imp wait
		
		//home page: 0 sec
		//e7 e8 e9

			
		
	}

}
