package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass{
	
	public LoginPage(WebDriver rdriver)
	{
		driver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]") private WebElement username;
	@FindBy(xpath="//input[@placeholder=\"Password\"]") private WebElement password;
	@FindBy(xpath="//input[@type=\"submit\"]") private WebElement login;
	
	public LoginPage enterValidUserName() {
		sendKeys(username, "standard_user");
		System.out.println("Entered UserName");
		return this;
	}

	public LoginPage enterValidPassword() {
		sendKeys(password,"secret_sauce");
		System.out.println("Entered Password");
		return this;
	}
	
	public LoginPage clickOnLoginBttn () {
		click(login);
		return this;
	}

	

}
