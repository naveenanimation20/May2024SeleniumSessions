package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelectors {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://app.hubspot.com/login");
		Thread.sleep(3000);

		// CSS: Cascaded Style Sheet

		// cssSelector: is a locator

		// By.cssSelector("#input-email");

		// id
		// #id
		// #input-email
		// tag#id
		// input#input-email

		// class:
		// .classname
		// .form-control
		// tag.classname
		// input.form-control

		// .c1.c2.c3...cn
		// .form-control.private-form__control.login-email
		// input.form-control.private-form__control.login-email
		// input.form-control.login-email
		// input.private-form__control.login-email
		// input.login-email

		// id and class:
		// #id.class
		// #username.login-email

		// .class#id
		// .login-email#username
		// input.login-email#username

		// input.form-control.private-form__control.login-email#username
		// input#username.form-control.private-form__control.login-email

		// tag.c1#id.c2.c3
		// input.form-control#username.private-form__control.login-email

		// for any attribute in cssselector:
		// tagname[attr='value']
		// input[name='email']
		// input[id='input-email']
		// input[placeholder='E-Mail Address']

		// input[name='email'] --- css
		// input[@name='email'] --xpath

		// input[name='email']#input-email
		// input#input-email[name='email']
		// input#input-email[name='email'].form-control

		// tagname[attr1='value'][attr2='value'][attr3='value']
		// input[name='email'][placeholder='E-Mail Address'][type='text']
		// input[name='email'][placeholder='E-Mail Address'][type='text']#input-email
		// input[name='email'][placeholder='E-Mail
		// Address'][type='text'][id='input-email']

		// text in css: NO support for text in CSS

		// contains:
		// tag[attr *= 'value']
		// input[placeholder *= 'E-Mail']
		// input[placeholder *= 'Address']

		// starts-with:
		// tag[attr ^= 'value']
		// input[placeholder ^= 'E-Mail']

		// ends-with:
		// tag[attr $= 'value']
		// input[placeholder $= 'Address']

		// parent to child:
		// parenttag childtag : direct + indirect child elements
		// form#hs-login input#username

		// parenttag > childtag : direct child elements

		// form#hs-login > div --8
		// form#hs-login div --23
		// select#Form_getForm_Country > option

		// By.cssSelector("footer a");

		// child to parent: NA -- backward traversing in not allowed with CSS

		// sibling in css: only following sibling is allowed
		// label[for='input-email'] + input ---> immediate following sibling
		// select#Form_getForm_Country > option[value='Afghanistan'] ~ option --all
		// following siblings

		// index in css:

		// select#Form_getForm_Country > option:nth-of-type(2) -- 2nd index
		// select#Form_getForm_Country > option:nth-of-type(n) -- all elements

		// select#Form_getForm_Country > option:first-child
		// select#Form_getForm_Country > option:last-child

		// select#Form_getForm_Country > option:nth-child(5)
		// select#Form_getForm_Country > option:nth-last-child(5)
		// select#Form_getForm_Country > option:nth-last-child(n) -- all

		// select#Form_getForm_Country > option:nth-child(n+4)
		// select#Form_getForm_Country > option:nth-child(5n)

		// select#Form_getForm_Country > option:nth-child(odd)
		// select#Form_getForm_Country > option:nth-child(even)

		// 10 % 2 == 0 -- even
		// 9 % 2 == 1 -- odd
		// using xpath:
		// select[@id='Form_getForm_Country']/option[position() mod 2 = 0] -- even
		// select[@id='Form_getForm_Country']/option[position() mod 2 = 1] -- odd

		// comma in css:
		// input#username , input#password , button#loginBtn , input#remember -- 4
		
		int loginImpElementsCount = driver
			.findElements(By.cssSelector("input#username , input#password , button#loginBtn , input#remember"))
					.size();
		
		System.out.println(loginImpElementsCount);
		if(loginImpElementsCount == 4) {
			System.out.println("login form elements are present");
		}
		else {
			System.out.println("FAIL");
		}
		
		//not in css:
		// input.form-control:not(input[name='search'])
		// input.form-control:not(input[name='search']):not(#input-password)
		// div.navFooterVerticalRow.navAccessibility > div:not(div.navFooterColSpacerInner)
		
		// //div[text()='Let Us Help You']/following-sibling::ul//a -- links under a column
		
		
		//                  xpath       vs          css
		//1. syntax         complex                 easy
		//2. performance    good				    good
		//3. text           yes                     no
		//4. sibling         yes                    limited (only forward)
		//5. child to parent yes                    no
		//6. child to ancestors yes                 no
		//7. index:             yes                 yes (+1)
		//8. not:               yes                 yes
		//9. comma/union:       limited             yes
		//10. space:           yes                  no
		//11. SVG:              yes                 no
		//12. SHADOW DOM:        no                 yes
		//13. endswith:          no                 yes
		
		//Relative Locators: selenium 4.x
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
