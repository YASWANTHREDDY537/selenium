package pageobjectmodel;

import org.openqa.selenium.chrome.ChromeDriver;

public class Bye extends Hello{
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		Hello h =new Hello(driver);
	
		driver.get("https://www.instagram.com");
		h.getPass().sendKeys("hello");
		
		
	}
	

}
