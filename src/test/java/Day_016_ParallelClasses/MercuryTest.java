package  Day_016_ParallelClasses;
import org.testng.annotations.Test;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
public class MercuryTest
{
	WebDriver driver;

	@Test
	public void Open_Mercury() throws Exception {
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		
		//OpenUrl
		driver.get("https://www.google.co.in/");

		
		//Close Browser		
		driver.quit();
	}
}                                                  












