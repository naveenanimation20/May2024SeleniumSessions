package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		
		driver = new ChromeDriver();

		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		//drag and drop
		//element to element
		
		By sourceElement = By.id("draggable");
		By targetElement = By.id("droppable");

		//a1.a2.a3 --> build.perform
		Actions act = new Actions(driver);

//		act.clickAndHold(driver.findElement(sourceElement))
//					.moveToElement(driver.findElement(targetElement))
//							.release()
//								.build().perform();
		
		//dragAndDropAction.perform();
		
		//.build() --> No
		//.perform() --> yes
		//.build().perform() --> yes
		//.build() --> return Action --> can be reused
		
		//Actions -- class -- is used to achieve the builder pattern using method chaining to perform various actions in a sequence
		//Action -- Interface -- build() will return Action (single or composite action) --which can be used later to peform
		
		
		act.dragAndDrop(driver.findElement(sourceElement), driver.findElement(targetElement)).perform();
		
	}

}
