package commonmethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBases {
	
	protected static WebDriver driver;
	public static void openbrowser() {
		
		String browser="firefox";
		if(browser.equals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			driver.get("http://advantageonlineshopping.com/#/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		}else if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.get("http://advantageonlineshopping.com/#/");
driver.manage().window().maximize();
			
		}else if(browser.contentEquals("ie")) {
			
			WebDriverManager.iedriver().setup();
			 driver = new InternetExplorerDriver();
			driver.get("http://advantageonlineshopping.com/#/");

		}else {
			
			System.out.println(" not specfice browser avil");
			
		}
		
		
		
		
		
	}
	
	
	

}
