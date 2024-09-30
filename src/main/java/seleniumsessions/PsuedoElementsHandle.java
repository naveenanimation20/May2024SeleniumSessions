package seleniumsessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PsuedoElementsHandle {

	public static void main(String[] args) {
		
		
		//::before
		//::after
		//::has
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String script = "return window.getComputedStyle(document.querySelector('label[for=\"input-firstname\"]'), '::before').getPropertyValue('content')";
		
		JavascriptExecutor js = (JavascriptExecutor)driver;

		String content = js.executeScript(script).toString();
		System.out.println(content);
		
		if(content.contains("*")) {
			System.out.println("FN is mandatory field");
		}
		
	}

}
