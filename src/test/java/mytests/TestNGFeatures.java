package mytests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGFeatures {

//	BS - connectWithDB
//	BT -- createUser
//	BC -- openBrowser
//	
//			BM -- loginToApp
//			cart test
//			AM -- logout
//	
//			BM -- loginToApp
//			payment test
//			AM -- logout
//	
//			BM -- loginToApp
//			search test
//			AM -- logout
//	
//	AC -- close browser
//	AT -- delete user
//	AS -- disconnectWithDB

	// 1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS - connectWithDB");
		System.out.println("BS - connectWithAPI");
	}

	// 2
	@BeforeTest
	public void createUser() {
		System.out.println("BT -- createUser");
	}

	// 3
	@BeforeClass
	public void openBrowser() {
		System.out.println("BC -- openBrowser");
	}

	// 4 //7 //10
	@BeforeMethod
	public void loginToApp() {
		System.out.println("BM -- loginToApp");
		System.out.println("BM -- clearCache");
	}

	// 1
	@Test
	public void searchTest() {
		System.out.println("search test");
	}

	// 5
	@Test
	public void cartTest() {
		System.out.println("cart test");
	}

	// 8
	@Test
	public void paymentTest() {
		System.out.println("payment test");
	}

	// 6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	// 13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	// 14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete user");
	}

	// 15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS -- disconnectWithDB");
	}

}
