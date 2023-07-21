package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class VerifyCart extends BaseClass{
	
	public VerifyCart(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath="//button[text()='Checkout']") private WebElement checkout;
	
	public VerifyCart clickOnCkeckout () {
		click(checkout);
		System.out.println("Clicked on checkout");
		return this;
		
	}
	
}
