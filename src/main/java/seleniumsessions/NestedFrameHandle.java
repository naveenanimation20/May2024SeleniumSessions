package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-scenario/");//page
		
		Thread.sleep(1000);
		
		
//		driver.switchTo().frame("pact1")
//				.switchTo().frame("pact2")
//						.switchTo().frame("pact3")
//									.findElement(By.id("glaf"))
//											.sendKeys(" Selenium");
		
		String header = driver.switchTo().frame("pact1")
		.switchTo().frame("pact2")
				.switchTo().frame("pact3")
						.switchTo().parentFrame()
								.switchTo().parentFrame()
										.switchTo().defaultContent().findElement(By.tagName("h3")).getText();
			System.out.println(header);					
		
	
//		driver.switchTo().frame("pact1");//f1		
//		driver.findElement(By.id("inp_val")).sendKeys("Testing");
		
//		driver.switchTo().frame("pact2");//f2
//		driver.findElement(By.id("jex")).sendKeys("Automation");
//		
//		driver.switchTo().frame("pact3");//f3
//		driver.findElement(By.id("glaf")).sendKeys("Good Package");
		//f3-->f2
//		driver.switchTo().parentFrame();//f2
//		driver.findElement(By.id("jex")).sendKeys(" Selenium");
//
//		driver.switchTo().parentFrame();//f1
//		driver.findElement(By.id("inp_val")).sendKeys(" with Passion");

		//f1-->page: DC/PF
		//driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();//if parent is browser then it will switch to browser page.
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		//f1-->f2:
//		driver.switchTo().frame("pact2");//f2
//		driver.findElement(By.id("jex")).sendKeys("Selenium");
		
		//f1-->f3: wont work
//		driver.switchTo().frame("pact3");//f3
//		driver.findElement(By.id("glaf")).sendKeys("Good Perks");
		
		
		//page --> f1: yes
		//f1-->f2:yes
		//f2-->f3:yes
		//page-->f2: no
		//page -->f3: no
		//page-->f1-->f2-->f3: yes
		
		//f3-->f2: yes (PF)
		//f2 --> f1: yes (PF)
		//f1 --> page : yes (PF,DC)
		
		//f3 --> f2(PF) --> f1(PF)
		
		
		//f3---DC--> page
//		driver.switchTo().defaultContent();//f1 or f2 or page(yes):
//		
//		//driver.findElement(By.id("inp_val")).sendKeys(" with Naveen");
//
//		String header = driver.findElement(By.tagName("h3")).getText();
//		System.out.println(header);
		
		

		
		
	}

}
