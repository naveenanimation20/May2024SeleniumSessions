package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header = By.tagName("h2");
		By para = By.xpath("//*[@id=\"content\"]/div/div[1]/div/p[2]");
		By forgotPwdLink = By.linkText("Forgotten Password");
		By footerHeader = By.tagName("h5");
		
		ElementUtil elUtil = new ElementUtil(driver);
		String m1 = elUtil.doGetElementText(header);
		String m2 = elUtil.doGetElementText(para);
		String m3 = elUtil.doGetElementText(forgotPwdLink);
		String m4 = elUtil.doGetElementText(footerHeader);

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);

		
	}

}
