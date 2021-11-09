package commonmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends TestBases {

	
	public static void sshot() throws IOException {
		
		File screeshotfile=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screeshotfile, new File("D:\\10pm.png"));
		
	}
	
	
	
}
