package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bmw {
	@Test(groups = "legends")
	public  void Bmw1(){
	
	WebDriver driver = new ChromeDriver();
	Reporter.log("welcome bmw", true);
	driver.get("https://www.bmw-motorrad.in/en/models/modeloverview.html");
	driver.quit();
	}
	

}
