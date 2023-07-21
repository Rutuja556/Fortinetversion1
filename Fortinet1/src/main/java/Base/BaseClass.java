package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	

   public static Properties prop;
   public static WebDriver driver;
  
			
			public WebDriver setUp(String Url) throws Exception{
				
				prop = new Properties();
				FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Properties\\config.properties");
	            prop.load(fis);
				System.out.println(prop.getProperty("browser"));
				
				String browserName = prop.getProperty("browser");	
				if(browserName.equals("chrome")) {
				  WebDriverManager.chromedriver().setup();
				  driver = new ChromeDriver();
				  System.out.println("Chrome Browser is Executed");
				}
				else if (browserName.equals("firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
					System.out.println("Firefox Browser is Executed");
				} else if (browserName.equals("edge"))  {
					WebDriverManager.edgedriver().setup();
					driver = new EdgeDriver();
					System.out.println("Edge Browser is Executed");
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println(prop.getProperty("url"));
				driver.get(prop.getProperty("url"));
				System.out.println("Opened URL -" + prop.getProperty("url"));
				return driver;
				
			}
				public void waitForVisibility(WebElement e) {
					WebDriverWait wait = new WebDriverWait(driver,30);
					wait.until(ExpectedConditions.visibilityOf(e));
					
				}
				
				public void elementToBeClickable(WebElement e) {
					WebDriverWait wait = new WebDriverWait(driver,10);
					wait.until(ExpectedConditions.elementToBeClickable(e));
				}
				
				public void click(WebElement e) {
					waitForVisibility(e);
					elementToBeClickable(e);
					e.click();	
				}
				
				public void sendKeys(WebElement e, String Text) {
					waitForVisibility(e);
					e.sendKeys(Text);
				}
				
				public void clearText(WebElement e) {
					waitForVisibility(e);
					e.clear();
				}
				
				public String getText(WebElement e) {
					waitForVisibility(e);
					return e.getText();	
				}
				
				public String getAttribute(WebElement e, String attribute) {
					waitForVisibility(e);
					return e.getAttribute(attribute);
				}
				
				public void tearDown() {
					driver.close();
				}

		    }
			

	


