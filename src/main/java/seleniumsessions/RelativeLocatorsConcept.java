package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//sele 4.x:
//					above	
//					 |	
//		    left <-- ele -> right
//		    		 |
//		    		 |
//		near    	below
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(4000);

		
		WebElement ele = driver.findElement(By.linkText("Prince George, Canada"));
		
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
		System.out.println(rank);
		
		String aqi = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
		System.out.println(aqi);
		
		String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
		System.out.println(belowCity);

		String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
		System.out.println(aboveCity);

		String near = driver.findElement(with(By.tagName("a")).near(ele)).getText();
		System.out.println(near);
			
	}

}
