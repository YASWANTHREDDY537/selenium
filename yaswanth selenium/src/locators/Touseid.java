package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touseid {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("yaswanthreddy@Gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("password");
		Thread.sleep(2000);		
		driver.findElement(By.name("login")).click();
		driver.quit();
	}

}
