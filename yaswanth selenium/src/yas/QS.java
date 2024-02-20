package yas;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class QS {
	public static void main(String[] args) {
		ChromeDriver driver  =new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	 //driver.manage().window().setSize(new Dimension(1200,300));
		driver.manage().window().setPosition(new Point(1200, 900));
		
	}

}
