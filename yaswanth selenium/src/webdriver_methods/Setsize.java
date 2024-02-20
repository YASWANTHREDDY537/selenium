package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com");
		 driver.manage().window().setSize(new Dimension(1234,500));
		 
		 
		
		
	}

}
