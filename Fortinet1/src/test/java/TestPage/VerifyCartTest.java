package TestPage;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginPage;
import Page.SwagLabs;
import Page.VerifyCart;

public class VerifyCartTest extends BaseClass{
	public static WebDriver driver;
	public static LoginPage login;
	public static SwagLabs swaglabs;
	public static VerifyCart verifycart;
	
	@BeforeMethod
	public void login(Method m) throws Exception {
		driver = setUp(null);
		System.out.println("\n" +"***** Starting Test: "+m.getName()+"*****"+"\n");
		
	}
	@Test
	public void Verify_cart() {
		login = new LoginPage(driver);
		swaglabs = new SwagLabs(driver);
		verifycart= new VerifyCart(driver);
		
		login.enterValidUserName();
		login.enterValidPassword();
		login.clickOnLoginBttn();
		swaglabs.clickOntShirtRed();
		swaglabs.clickOnRemoveItem();
		swaglabs.clickOnSauceLabsBikelLigh();
		swaglabs.clickOnVerifyCart();
		verifycart.clickOnCkeckout();
		
	}

}
