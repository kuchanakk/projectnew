package pack1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoItexampl {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://addtext.com/");
		driver.findElement(By.xpath("//*[@id=\"html\"]/body/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]")).click();
	
		Thread.sleep(5000);
		java.lang.Runtime.getRuntime().exec("C:\\Users\\kiran\\Desktop\\upload.exe");
	}

}
