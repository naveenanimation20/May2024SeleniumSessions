package seleniumsessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
		//JS alerts:
		//1. alert
		//2. confirm
		//3. prompt
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1. alert:
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		Thread.sleep(3000);
//
//		Alert alert = driver.switchTo().alert();
//		
//		String text = alert.getText();
//		System.out.println(text);
//		alert.accept(); //click on OK		
//		//alert.dismiss();//just cancel this alert
		

		//2. confirm:
//		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert();
//		String text = alert.getText();
//		System.out.println(text);
//		//alert.accept(); //click on OK
//		alert.dismiss();//just cancel this alert: click on cancel
		
		
		//3. prompt: only one text field
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		
		alert.sendKeys("naveenautomationlabs");
		Thread.sleep(3000);

		alert.accept(); //click on OK
		//alert.dismiss();//just cancel this alert: click on cancel
		
		//NoAlertPresentException: no such alert in case of no JS popup on the page.

		
	}

}
