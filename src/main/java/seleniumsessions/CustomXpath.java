package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(4000);

		//xpath: XML Path: HTML XML PATH: address of the element in the DOM
		//DOM: HTML + XML
		
		//1. absolute xpath: /html/body/div[2]/div/div/div/div[2]/div/form/input
		//2. relative xpath: relative attributes of the element: id, class, name, type, text
		
		
		//htmltag[@attr = 'value']
		
		//input[@id='input-email'] --- 1
		//input[@name='email'] --1
		//input[@type='text'] ---2
		
		//htmltag[@attr1='value' and attr2='value']
		//input[@name='email' and @id='input-email'] ---1
		//input[@name='email' and @id='input-email' and @type='text']---1
		//input[@name='email' and @id='input-email' and @type='text' and @placeholder='E-Mail Address']---1
		
		//input[@type='text' or @name='password'] -- 3
		
		
		//text():
		//htmltag[text()='value']
		//a[text()='Register']
		
		//h2[text()='New Customer']
		//label[text()='E-Mail Address']
		
		//a -- total links
		//img
		//h1
		//input
		//a[@href]
		//input[@id]
		
		//amazon:
		//a -- 381 -- total links on the page
		//a[@href] -- 372
		//a[not(@href)] -- 4
		
		
//		driver.findElements(By.xpath("//a[@href]"));
//		driver.findelements(By.tagName("a"));
		
		//contains():
		//htmltag[contains(@attr,'value')]
		//input[contains(@id, 'firstname')]
		
		//htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
		//input[contains(@id, 'firstname') and contains(@placeholder, 'First')]
		
		//htmltag[contains(@attr1,'value') and @attr2='value']
		//input[contains(@id, 'firstname') and @placeholder= 'First Name']
		//input[@placeholder= 'First Name' and contains(@id, 'firstname')]
		
		//input[@placeholder= 'First Name' and contains(@id, 'firstname') and @type='text']
		
		//contains() with text():
		//htmltag[contains(text(),'value')]
		//h1[contains(text(),'Register')]
		//legend[contains(text(),'Personal')]
		//p[contains(text(),'shop faster')]
		
		//dynamic IDs/attributes
//		<input "id=firstname_123">
//		<input "id=firstname_456">
//		<input "id=firstname_890">
//		<input "id=firstname">

		
		//input[contains(@id,'firstname_')]
		
		//<span "type=text" your transaction id is 1234 /span>
		
		By mesg = By.xpath("//span[contains(text(),'your transaction id is')]");
		String trText = driver.findElement(mesg).getText();		
		
		//contains() with attribute and no contains with text:
		//htmltag[contains(@attr,'value') and text()='value']
		//a[contains(@href,'/wishlist') and text()='Wish List']
		
		//contains() with attribute and contains() with text:
		//htmltag[contains(@attr,'value') and contains(text(),'value')]
		//a[contains(@href,'/wishlist') and contains(text(),'Wish List')]
		
		//starts-with():
		//htmltag[starts-with(@attr, 'value')]
		//input[starts-with(@placeholder, 'First')]
		
		//h1[starts-with(text(), 'Register')]
		
		//ends-with(): NA
		
		//Class:
		
		//Only one class name should be used if you are using .className()
		//driver.findElement(By.className("form-control private-form__control login-email")).sendKeys("test@gmail.com");//not valid
		//InvalidSelectorException: Compound class names not permitted
		
		//valid
		//driver.findElement(By.xpath("//input[@class='form-control private-form__control login-email']")).sendKeys("test@gmail.com");
		
		//valid:
		//driver.findElement(By.xpath("//input[contains(@class,'login-email')]")).sendKeys("test@gmail.com");
		
		//valid:
		//driver.findElement(By.className("login-email")).sendKeys("test@gmail.com");
		
		//driver.findElement(By.xpath("//input[@@@@@id,testing//test]/option")).sendKeys("test@gmail.com");//InvalidSelectorException: invalid selector
		
		//driver.findElement(By.xpath("//input[@id='username11']")).sendKeys("test@gmail.com");//NoSuchElementException: no such element: Unable to locate element
		
		
		//indexing in xpath:
		// (//a[text()='Forgotten Password'])[2]
		By.xpath("(//a[text()='Forgotten Password'])[2]");
		
		// (//input[@class='form-control'])[1]
		// (//input[@class='form-control'])[position()=1]
		// (//input[@class='form-control'])[position()=last()]

		// (//input[@class='form-control'])[last()]
		
		// (//input[@class='form-control'])[last()-1]
		
		// ((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
		
		driver.findElement
		(By.xpath("((//div[@class='navFooterVerticalRow navAccessibility']/div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]"))
			.getText();
		
		
		
	}

}
