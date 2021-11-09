package pack1;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonmethods.Exceldata;
import commonmethods.Screenshot;
import commonmethods.TestBases;
import objrep.Productpage;

public class Testexampl extends TestBases {

	static Productpage pd;
	static Exceldata excel;
	static Screenshot sc ;
	@BeforeMethod
	public static void openbrowser() {
		
		TestBases tb = new TestBases();
		
		tb.openbrowser();
		 
	}
	@Test
public static void tablettest() throws InterruptedException, IOException {
	 pd= new Productpage(driver);
	Thread.sleep(15000);
	
	pd.poplink().click();
	Thread.sleep(15000);
	pd.tablink().click();
	String actualtabtext=pd.producttext().getText();

 excel = new Exceldata();
String expectedtabletext=excel.readdata(3, 0);

if(actualtabtext.contains(expectedtabletext)) {
	
	System.out.println(" tabet test is pass");
	excel.writedata(3, 1, "valid data");
	
}else {
	
	System.out.println(" tabet test is fail");
	excel.writedata(3, 1, "invalid data");
 sc = new Screenshot();
sc.sshot();
	
}


}
	

@Test
public static void laptoptest() throws InterruptedException, IOException {
	
	pd= new Productpage(driver);
	Thread.sleep(15000);
	pd.poplink().click();
	Thread.sleep(15000);

pd.laplink().click();
String actuallaptext=pd.producttext().getText();

 excel = new Exceldata();
String expectedlaptext=excel.readdata(1, 0);

if(actuallaptext.contains(expectedlaptext)) {
	
	System.out.println(" laptop test is pass");
	excel.writedata(1, 1, "valid data");
	
}else {
	
	System.out.println(" laptop test is fail");
	excel.writedata(1, 1, "invalid data");
 sc = new Screenshot();
sc.sshot();
	
}


	
}




@Test
public static void spktest() throws InterruptedException, IOException {
	
	pd= new Productpage(driver);
	Thread.sleep(15000);
	pd.poplink().click();
	Thread.sleep(15000);

pd.spkrlink().click();
String actualapktext=pd.producttext().getText();

 excel = new Exceldata();
String expectedspktext=excel.readdata(2, 0);

if(actualapktext.contains(expectedspktext)) {
	
	System.out.println(" spk test is pass");
	excel.writedata(2, 1, "valid data");
	
}else {
	
	System.out.println(" spk test is fail");
	excel.writedata(2, 1, "invalid data");
 sc = new Screenshot();
sc.sshot();
	
}

	
}
@AfterMethod
public static void closebrowser() {
	
	driver.close();
}

	
}
