package TestPage;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginPage;


public class LoginTest extends BaseClass {
	public static WebDriver driver;
	public static LoginPage login;
	
	@BeforeMethod
	public void login(Method m) throws Exception {
		driver = setUp(null);
		System.out.println("\n" +"***** Starting Test: "+m.getName()+"*****"+"\n");
		//setUp(null);
	}
//	public void beforeMethod(Method m) throws Exception {
//		driver=setUp(null);
//		System.out.println(" ***** Starting Test " + m.getName() + " ******");
//	}

	@Test
	public void loginWithValidCredential() {
		login = new LoginPage(driver);
		login.enterValidUserName();
		login.enterValidPassword();
		login.clickOnLoginBttn();
	}
	
		
		@AfterMethod
		public void afterMethod() {
			tearDown();
		}
		
	

	
}
