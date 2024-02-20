package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		  Dimension getsizeofbrowser = driver.manage().window().getSize();
		  System.out.println(getsizeofbrowser);
		
		
		
	}

}
