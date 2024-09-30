package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {

		// single element -- FE ---> WebElement
		// multiple elements -- FEs -- > List<WebElement>

		// total links
		// print the text of each link and ignore the blank text
		// find out the broken links

		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

		int totalLinks = linksList.size();
		System.out.println("total links ==>" + totalLinks);

		// index:
		for (int i = 0; i < totalLinks; i++) {
			String text = linksList.get(i).getText();
			if (text.length() != 0) {
				System.out.println(i + "=" + text);
			}
		}

		System.out.println("---------");
		// for each:

		int count = 0;
		for (WebElement e : linksList) {
			String text = e.getText();
			if (text.length() != 0) {
				System.out.println(count + "="+text);
			}
			count++;
		}

	}

}
