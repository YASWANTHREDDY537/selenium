package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsize {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com");
		 Dimension getsizeofwindow = driver.manage().window().getSize();
		 System.out.println(getsizeofwindow);
		 System.out.println(getsizeofwindow.getHeight());
		 System.out.println(getsizeofwindow.getWidth());
		 driver.quit();
		 
		
		
	}

}
