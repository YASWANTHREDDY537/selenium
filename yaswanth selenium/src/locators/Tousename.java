package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tousename {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("hello");
		Thread.sleep(2000);	
		driver.findElement(By.name("password")).sendKeys("nopassword");
		}

}
