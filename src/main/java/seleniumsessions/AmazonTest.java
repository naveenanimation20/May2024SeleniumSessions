package seleniumsessions;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();

		brUtil.initDriver("chrome");

		brUtil.launchURL("https://amazon.com");

		String title = brUtil.getPageTitle();
		System.out.println(title);
		if (title.contains("Amazon")) {
			System.out.println("title pass");
		} else {
			System.out.println("title fail");
		}

		System.out.println(brUtil.getPageURL());

		brUtil.quitBrowser();

	}

}

