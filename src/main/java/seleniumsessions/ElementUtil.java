package seleniumsessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;
	private Actions act;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		act = new Actions(driver);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doClick(By locator, int timeOut) {
		waitForElementVisible(locator, timeOut).click();
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(By locator, String value, int timeOut) {
		waitForElementVisible(locator, timeOut).sendKeys(value);
	}

	public void doSendKeys(By locator, CharSequence... value) {
		getElement(locator).sendKeys(value);
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public boolean isElementDisplayed(By locator) {
		try {
			return getElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			System.out.println("Element is not displayed : " + locator);
			return false;
		}
	}

	public String doGetElementText(By locator) {
		String eleText = getElement(locator).getText();
		if (eleText != null) {
			return eleText;
		} else {
			System.out.println("Element text is null:" + eleText);
			return null;
		}
	}

	public String doElementGetAttribute(By locator, String attrName) {
		return getElement(locator).getAttribute(attrName);
	}

	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public int getEelementsCount(By locator) {
		return getElements(locator).size();
	}

	public void printElementTextList(By locator) {
		List<String> eleTextList = getElementsTextList(locator);
		for (String e : eleTextList) {
			System.out.println(e);
		}
	}

	public boolean isElementNotPresent(By locator) {
		if (getEelementsCount(locator) == 0) {
			return true;
		}
		return false;
	}

	public boolean isElementPresentMultipleTimes(By locator) {
		if (getEelementsCount(locator) >= 1) {
			return true;
		}
		return false;
	}

	public boolean isElementPresent(By locator, int expectedElementCount) {
		if (getEelementsCount(locator) == expectedElementCount) {
			return true;
		}
		return false;
	}

	public boolean isElementPresent(By locator) {
		if (getEelementsCount(locator) == 1) {
			return true;
		}
		return false;
	}

	public List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();// []

		for (WebElement e : eleList) {
			String eleText = e.getText();
			if (eleText.length() != 0) {
				eleTextList.add(eleText);
			}
		}
		return eleTextList;
	}

	public boolean doSearch(By searchField, By suggestions, String searchKey, String matchValue)
			throws InterruptedException {

		boolean flag = false;

		doSendKeys(searchField, searchKey);
		Thread.sleep(3000);

		List<WebElement> suggList = getElements(suggestions);
		int totalSuggestions = suggList.size();
		System.out.println("Total number of suggestions===" + totalSuggestions);

		if (totalSuggestions == 0) {
			System.out.println("No suggesstions found...");
			throw new FrameworkException("No Suggestions FOUND");
		}

		for (WebElement e : suggList) {
			String text = e.getText();
			if (text.contains(matchValue)) {
				e.click();
				flag = true;
				break;
			}
		}

		if (flag) {
			System.out.println(matchValue + " is found");
			return true;
		} else {
			System.out.println(matchValue + " is not found");
			return false;
		}

	}

	// *******************Select Drop Down Utils**************//

	private Select getSelect(By locator) {
		return new Select(getElement(locator));
	}

	public int getDropDownOptionsCount(By locator) {
		return getSelect(locator).getOptions().size();
	}

	public void selectDropDownValueByVisibleText(By locator, String visibleText) {
		getSelect(locator).selectByVisibleText(visibleText);
	}

	public void selectDropDownValueByIndex(By locator, int index) {
		getSelect(locator).selectByIndex(index);
	}

	public void selectDropDownValueByValue(By locator, String value) {
		getSelect(locator).selectByValue(value);
	}

	public List<String> getDropDownOptionsTextList(By locator) {
		List<WebElement> optionsList = getSelect(locator).getOptions();
		System.out.println("total number of options: " + optionsList.size());

		List<String> optionsTextList = new ArrayList<String>();
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}

		return optionsTextList;
	}

	/*
	 * select drop down value from the drop down using Select class
	 */
	public void selectDropDownValueUsingSelect(By locator, String value) {
		List<WebElement> optionsList = getSelect(locator).getOptions();
		selectDropDown(optionsList, value);
	}

	/*
	 * select drop down value from the drop down without using Select class
	 */
	public void selectDropDownValue(By locator, String value) {
		List<WebElement> optionsList = getElements(locator);
		selectDropDown(optionsList, value);
	}

	private void selectDropDown(List<WebElement> optionsList, String value) {
		System.out.println("total number of options: " + optionsList.size());
		for (WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
	}

	// *************** Actions Utils***************//

	public void doActionsClick(By locator) {
		act.click(getElement(locator)).perform();
	}

	public void doActionsSendKeys(By locator, String value) {
		act.sendKeys(getElement(locator), value).perform();
	}

	public void doActionsSendKeysWithPause(By locator, String value, long pauseTime) {
		char ch[] = value.toCharArray();
		for (char c : ch) {
			act.sendKeys(getElement(locator), String.valueOf(c)).pause(pauseTime).perform();
		}
	}

	/**
	 * This method is handling two level of parent and child menu on the basis of By
	 * locator
	 * 
	 * @param parentMenu
	 * @param childMenu
	 * @throws InterruptedException
	 */
	public void ParentChildMenu(By parentMenu, By childMenu) throws InterruptedException {
		act.moveToElement(getElement(parentMenu)).perform();
		Thread.sleep(1500);
		doClick(childMenu);
	}

	public void ParentChildMenu(String parentMenu, String childMenu) throws InterruptedException {
		act.moveToElement(getElement(By.xpath("//*[text()='" + parentMenu + "']"))).perform();
		Thread.sleep(1500);
		doClick(By.xpath("//*[text()='" + childMenu + "']"));
	}

	/**
	 * This method is handling four levels of parent and child menu on the basis of
	 * By locator
	 * 
	 * @param parentMenu
	 * @param childMenu
	 * @throws InterruptedException
	 */
	public void ParentChildMenu(By level1, By level2, By level3, By level4) throws InterruptedException {
		doClick(level1);
		Thread.sleep(1000);
		act.moveToElement(getElement(level2)).perform();
		Thread.sleep(1000);
		act.moveToElement(getElement(level3)).perform();
		Thread.sleep(1000);
		doClick(level4);
	}

	// ***********wait utils********//

	/**
	 * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible on the page.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible on the page as well. Visibility means that the element is not
	 * only displayed but also has a height and width that is greater than 0.
	 * default polling time/interval time = 500ms
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public WebElement waitForElementVisible(By locator, int timeOut, int intervalTime) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut), Duration.ofSeconds(intervalTime));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	/**
	 * wait for element visible on the page with fluent wait features
	 * @param locator
	 * @param timeOut
	 * @param pollingTime
	 * @return
	 */
	public WebElement waitForElementVisibleWithFluentFeeatures(By locator, int timeOut, int pollingTime) {		
		Wait<WebDriver> wait =	new FluentWait<WebDriver>(driver)
									.withTimeout(Duration.ofSeconds(timeOut))
									.pollingEvery(Duration.ofSeconds(pollingTime))
									.ignoring(NoSuchElementException.class)
									.ignoring(StaleElementReferenceException.class)
									.ignoring(ElementNotInteractableException.class)
									.withMessage("=====element is not found======" + locator);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));									
	}
	
	
	

	/**
	 * An expectation for checking an element is visible and enabled such that you
	 * can click it.
	 */
	public void waitForElementAndClick(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}

	/**
	 * An expectation for checking that all elements present on the web page that
	 * match the locator are visible. Visibility means that the elements are not
	 * only displayed but also have a height and width that is greater than 0.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	
	
	
	
	
	
	

	/**
	 * An expectation for checking that there is at least one element present on a
	 * web page.
	 * 
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	public List<WebElement> waitForElementsPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public String getPageTitleIs(String expectedTitle, int timeOut) {
		if (waitForTitleIs(expectedTitle, timeOut)) {
			return driver.getTitle();
		} else {
			return "-1";
		}
	}

	public String getPageTitleContains(String expectedTitle, int timeOut) {
		if (waitForTitleContains(expectedTitle, timeOut)) {
			return driver.getTitle();
		} else {
			return "-1";
		}
	}

	public boolean waitForTitleIs(String expectedTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			return wait.until(ExpectedConditions.titleIs(expectedTitle));// if title is not matched, it will be throw
																			// timeOut exception
		} catch (TimeoutException e) {
			System.out.println("title is not matched");
			return false;
		}
	}

	public boolean waitForTitleContains(String fractionTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			return wait.until(ExpectedConditions.titleContains(fractionTitle));
		} catch (TimeoutException e) {
			System.out.println("title is not matched");
			return false;
		}
	}

	public String waitForTitleContainsAndReturn(String fractionTitle, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			wait.until(ExpectedConditions.titleContains(fractionTitle));
			return driver.getTitle();
		} catch (TimeoutException e) {
			System.out.println("title is not matched");
			return "-1";
		}
	}

	public String getPageURLContains(String fractionURL, int timeOut) {
		if (waitForURLContains(fractionURL, timeOut)) {
			return driver.getCurrentUrl();
		} else {
			return "-1";
		}
	}

	public boolean waitForURLContains(String fractionURL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			return wait.until(ExpectedConditions.urlContains(fractionURL));// true
		} catch (TimeoutException e) {
			System.out.println("URL is not matched");
			return false;
		}

	}

	public String waitForURLContainsAndReturn(String fractionURL, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		try {
			wait.until(ExpectedConditions.urlContains(fractionURL));// true
			return driver.getCurrentUrl();
		} catch (TimeoutException e) {
			System.out.println("URL is not matched");
			return "-1";
		}

	}

	public Alert waitForAlertAndSwitch(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	public Alert waitForAlertUsingFluentWaitAndSwitch(int timeOut) {
		
		Wait<WebDriver> wait =	new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(timeOut))
								.ignoring(NoAlertPresentException.class)
								.withMessage("====Js alert is not present===");
		return wait.until(ExpectedConditions.alertIsPresent());

	}
	
	

	public String getAlertText(int timeOut) {
		return waitForAlertAndSwitch(timeOut).getText();
	}

	public void acceptAlert(int timeOut) {
		waitForAlertAndSwitch(timeOut).accept();
	}

	public void dismissAlert(int timeOut) {
		waitForAlertAndSwitch(timeOut).dismiss();
	}

	public void enterValueOnAlert(int timeOut, String value) {
		waitForAlertAndSwitch(timeOut).sendKeys(value);
	}

	// wait for frame:
	public void waitForFrameUsingLocatorAndSwitchToIt(By frameLocator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
	}

	public void waitForFrameUsingLocatorAndSwitchToIt(int frameIndex, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));
	}

	public void waitForFrameUsingLocatorAndSwitchToIt(String idOrName, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(idOrName));
	}

	public void waitForFrameUsingLocatorAndSwitchToIt(WebElement frameElement, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameElement));
	}

	// wait for window/tab:
	public boolean waitForNewWindowOrTab(int expectedNumberOfWindows, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

		try {
			if (wait.until(ExpectedConditions.numberOfWindowsToBe(expectedNumberOfWindows))) {
				return true;
			}
		} catch (TimeoutException e) {
			System.out.println("number of windows are not matched....");
		}

		return false;
	}

}
