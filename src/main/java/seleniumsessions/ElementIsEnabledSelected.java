package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsEnabledSelected {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//		
//		
//		boolean f1 = driver.findElement(By.id("fname")).isDisplayed();//true
//		System.out.println(f1);
//		
//		
//		boolean f2 = driver.findElement(By.id("fname")).isEnabled();//true
//		System.out.println(f2);
//		
//		//disabled
//		boolean f3 = driver.findElement(By.id("pass")).isEnabled();//false
//		System.out.println(f3);
//		
//		boolean f4 = driver.findElement(By.id("pass")).isDisplayed();//true
//		System.out.println(f4);
		
		//
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		boolean t1 = driver.findElement(By.name("agree")).isSelected();//input: checkbox, dropdown, radiobutton
		System.out.println(t1);//false
		
		driver.findElement(By.name("agree")).click();
		boolean t2 = driver.findElement(By.name("agree")).isSelected();//input: checkbox, dropdown, radiobutton
		System.out.println(t2);//true
		
		
	}

}
