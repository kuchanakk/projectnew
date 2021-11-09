package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exampl1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\kiran\\Downloads\\geckodrive29\\geckodriver.exe");
	
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		int val=driver.findElements(By.name("abcd")).size();
	   System.out.println(val);
	
	}

}
