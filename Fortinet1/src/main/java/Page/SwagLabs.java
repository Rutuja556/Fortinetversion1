package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class SwagLabs extends BaseClass {
	public SwagLabs(WebDriver rdriver) {
		driver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
    @FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-onesie\"]") WebElement TshirtRed;
    @FindBy(xpath="//button[@id='remove-sauce-labs-onesie']") private WebElement remove;
	@FindBy(xpath="//button[@name=\"add-to-cart-sauce-labs-bike-light\"]") private WebElement sauceLabs;
	@FindBy(xpath="//span[@class=\"shopping_cart_badge\"]") private WebElement verifyCart;
	
	public SwagLabs clickOntShirtRed () {
		click(TshirtRed);
		System.out.println("Clicked On Tshirt Red bike light");
		return this;
	}
	
	public SwagLabs clickOnRemoveItem() {
		click(remove);
		System.out.println("Item removed");
		return this;
	}
	
	public SwagLabs clickOnSauceLabsBikelLigh () {
		click(TshirtRed);
		System.out.println("Clicked On Sauce Labs bike light");
		return this;
	}
	
	public SwagLabs clickOnVerifyCart() {
		click(verifyCart);
		System.out.println("Clicked on verify cart");
		return this;
		
	}
	
}
