package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
 
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {

		Properties prop = new Properties();
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


	}

}
