package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUtil {
	
	static WebDriver driver;
	
	public static void main(String a[]) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By images = By.tagName("img");
		By links = By.tagName("a");
		
		int imagesCount = getEelemntsCount(images);
		System.out.println(imagesCount);
		
		List<String> eleTextList = getElementsTextList(links);
		
		System.out.println(eleTextList.contains("About Us"));
		System.out.println(eleTextList.contains("Contact Us"));


		printElementTextList(links);
		
	}
	
	public static void printElementTextList(By locator) {
		List<String> eleTextList = getElementsTextList(locator);
		for(String e : eleTextList) {
			System.out.println(e);
		}
	}
	
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();//[]
		
		for(WebElement e : eleList) {
			String eleText = e.getText();
				if(eleText.length()!=0) {
					eleTextList.add(eleText);
				}
		}
		return eleTextList;
	}
	
	
	public static int getEelemntsCount(By locator) {
		return getElements(locator).size();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	

}
