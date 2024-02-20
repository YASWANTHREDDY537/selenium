package yas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class QSss {
	WebDriver driver;
	@Test(enabled=true)
	public void hello() {
		
		 driver =new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test(priority = 1)
	public void h() {
		driver =new ChromeDriver();
		driver.get("https://www.goole.com");
		
		
	}

}
