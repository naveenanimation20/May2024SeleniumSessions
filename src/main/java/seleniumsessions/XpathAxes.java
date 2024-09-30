package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	static WebDriver driver;

	public static void main(String[] args) {

		// label[normalize-space()='No']

		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		//parent to direct child:
		//form[@id='hs-login']/input[@id='username']
		
		//form[@id='hs-login']/div -- 8 (direct child elements)
		//form[@id='hs-login']//div -- 23 (direct + indirect child elements) ---> descendant child elements
		
		//select[@id='Form_getForm_Country']/descendant::option
		//select[@id='Form_getForm_Country']//option
		
		//select[@id='Form_getForm_Country']/option -- direct(233) = 233
		//select[@id='Form_getForm_Country']//option -- direct(233) + indirect(0) = 233
		
		//child to parent:
		//backward travesring in DOM:
			//input[@id='username']/../../../../../../../../../../..
		
		//input[@id='username']/.. --immediate parent
		//input[@id='username']/parent::div -- immediate parent
		
		//child to ancestor:
		//input[@id='username']/ancestor::form
		//input[@id='input-firstname']/ancestor::div[@id='content']
		
		
		
		//following:
		//input[@id='input-email']/following::input[@id='input-password']
		
		//preceding:
		//input[@id='input-password']/preceding::input[@id='input-email']
		
		
		//input[@id='input-email']/preceding-sibling::label
		//input[@id='input-email']/preceding::label
		
		
		//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']
		//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']
		
		//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']
		
//		driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
//		driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();

		selectUser("Joe.Root");
		selectUser("Jasmine.Morgan");
		
		System.out.println(getUserDetails("Joe.Root"));
		System.out.println(getUserDetails("Jasmine.Morgan"));
		
		
		//100 in DOM
		//input[@id='input-firstname'] --> 20 ---> 1
		//*[@id='input-firstname'] --> 100 ----> 1
		
		
		

		
	}
	
	public static List<String> getUserDetails(String userName) {
		List<WebElement> userDetails = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> userDetailsList = new ArrayList<String>();
		for(WebElement e : userDetails) {
			String text = e.getText();
			userDetailsList.add(text);
		}
		return userDetailsList;
	}
	
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}
	
	

}
