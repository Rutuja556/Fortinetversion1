package TestPage;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginPage;
import Page.SwagLabs;

public class SwagLabsTest extends BaseClass{

	public static WebDriver driver;
	public static LoginPage login;
	public static SwagLabs swaglabs;
	
	@BeforeMethod
	public void login(Method m) throws Exception {
		driver = setUp(null);
		System.out.println("\n" +"***** Starting Test: "+m.getName()+"*****"+"\n");
		
	}
	@Test(priority=1)
	public void Swag_Labs() {
		login = new LoginPage(driver);
		swaglabs = new SwagLabs(driver);
		
		login.enterValidUserName();
		login.enterValidPassword();
		login.clickOnLoginBttn();
		swaglabs.clickOntShirtRed();
		swaglabs.clickOnRemoveItem();
		swaglabs.clickOnSauceLabsBikelLigh();
		swaglabs.clickOnVerifyCart();
		
		
	}
		
}
