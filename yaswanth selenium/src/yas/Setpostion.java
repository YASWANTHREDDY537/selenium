package yas;


import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setpostion {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		  driver.manage().window().setPosition(new Point(23,49));
	}

}
