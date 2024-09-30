package mytests;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	int age;
	
	
	@Test(expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void paymentTest() {
		System.out.println("payment test");
		int i = 9/2;
		
		ExpectedExceptionConcept obj = null;
		obj.age = 20;//NPE
		
	}
	
	
	
	

}
