package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		//JavaScriptExecutor 
		//Java ---> JS code ---> JavaScriptExecutor(I) -- executeScript(JS)
		
		
		driver = new ChromeDriver();//top casting
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);
		
		//interface casting:
//		JavascriptExecutor js = (JavascriptExecutor)driver;//casting
//		String title = js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url = js.executeScript("return document.URL;").toString();
//		System.out.println(url);
		
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		String title = jsUtil.getPageTitle();
		System.out.println(title);
		
		//jsUtil.generateJsAlert("I am on the login Page");
		
//		String pageText = jsUtil.getPageInnerText();
//		System.out.println(pageText);
//		
//		if(pageText.contains("Companies & Contacts")) {
//			System.out.println("PASS");
//		}
		
//		WebElement ele = driver.findElement(By.xpath("//h3[text()='Deals & Sales Pipeline']"));
//		WebElement forgotPwdLink = driver.findElement(By.linkText("Forgot Password?"));		
		
		//jsUtil.scrollIntoView(forgotPwdLink);
		
		//jsUtil.drawBorder(forgotPwdLink);
		
		WebElement loginForm = driver.findElement(By.id("hs-login"));
		
		WebElement emailId = driver.findElement(By.id("username"));

		//jsUtil.drawBorder(loginForm);
		//jsUtil.drawBorder(emailId);

		jsUtil.flash(emailId);
		jsUtil.flash(loginForm);

	}
	
	public static String getTitle() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}
	
	public static String getURL() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		String title = js.executeScript("return document.URL;").toString();
		return title;
	}
	
	

}
