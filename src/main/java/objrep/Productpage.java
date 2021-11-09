package objrep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	
	static WebDriver driver;

public Productpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// @FindBy(att="value") static webElement name;
	@FindBy(linkText="POPULAR ITEMS") static WebElement popitem;
	@FindBy(id="details_16") static WebElement tb;
	@FindBy(id="details_10") static WebElement lap;
	@FindBy(id="details_21") static WebElement spk;
	@FindBy(xpath="//*[@id=\"Description\"]/h1") static WebElement htext;


	
	public static WebElement poplink() {
		
		return popitem;
	}

public static WebElement tablink() {
		
		return tb;
	}
public static WebElement laplink() {
	
	return lap;
}
public static WebElement spkrlink() {
	
	return spk;
}
public static WebElement producttext() {
	
	return htext;
}
		

}
