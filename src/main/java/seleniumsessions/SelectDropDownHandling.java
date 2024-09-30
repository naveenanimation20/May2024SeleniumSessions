package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {

	static WebDriver driver;

	public static void main(String[] args) {

		// drop down -- htmltag: <select>
		// use Select class in Selenium
		// select -- option

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/30-day-free-trial/");

		By country = By.id("Form_getForm_Country");
		
		//WebElement countryEle = driver.findElement(country);
//		
		//Select select = new Select(countryEle);
//		
//		select.selectByVisibleText("Brazil");
		//select.selectByIndex(5);//month, day
		//select.selectByValue("Belgium");
				
		selectDropDownValueByVisibleText(country, "India");
		selectDropDownValueByIndex(country, 5);
		selectDropDownValueByValue(country, "Brazil");
		
		
//		List<WebElement> optionsList = select.getOptions();
//		System.out.println(optionsList.size());
		
		int count = getDropDownOptionsCount(country);
		System.out.println(count-1);
	}
	
	public static int getDropDownOptionsCount(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions().size();
	}
	
	
	public static void selectDropDownValueByVisibleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void selectDropDownValueByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropDownValueByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	

	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
