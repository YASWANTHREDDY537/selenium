package yas;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allwebdrivermethods {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String url= driver.getCurrentUrl();
		System.out.println(url);
		 String resource = driver.getPageSource();
		 System.out.println(resource);
		 String windows = driver.getWindowHandle();
		 System.out.println(windows);
		 driver.manage().window().setPosition(new Point(100,39));
		 driver.manage().window().setSize(new Dimension(10,20));
		
	}

}
