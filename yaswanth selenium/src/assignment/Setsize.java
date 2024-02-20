package assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.dominos.co.in/");
		 driver.manage().window().setSize(new Dimension(800,0));
		 
		 
		
		
	}

}
