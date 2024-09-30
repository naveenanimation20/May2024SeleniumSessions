package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		
		//script -----sync (wait)-----> app(browser)
		
		//wait:
		//1. static wait: Thread.sleep(10000); --> Java
		//10 secs --> 2 secs: 10 secs
		//10 secs ---> 15 secs: 10 secs
		
		//2. dynamic wait: 
		//10 secs: 2 secs : 2 secs
		//10 secs: 0 sec: 0 sec
		//10 secs: 10 secs: 10 secs
		//10 secs: 15 secs: NSE
		//15 secs: 13 secs: 13 secs
		
		//2.1: Implicitly Wait
		//2.2: Explicit Wait
						//2.2.a: WebDriverWait
						//2.2.b: FluentWait
		
		
		
		
	}

}
