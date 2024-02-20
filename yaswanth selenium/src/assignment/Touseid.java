package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touseid {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.actitime.com/free-online-trial");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("yaswanthreddy");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("yash");
		Thread.sleep(2000);		
		driver.findElement(By.id("Email")).sendKeys("yash@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Company")).sendKeys("yash");
		
		driver.findElement(By.id("confirm-button")).click();
	driver.navigate().back();	
	}

}
