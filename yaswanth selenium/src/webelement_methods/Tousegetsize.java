package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tousegetsize {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		Dimension size = driver.findElement(By.xpath("//button[@type=\"button\"]")).getSize();
		System.out.println(size);
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

	}

}
