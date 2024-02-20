package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getpostion {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com");
		   Point getposition = driver.manage().window().getPosition();
		System.out.println(getposition);
		
	}

}
