package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touselinktext {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("yaswanth reddy");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("gosala");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("gyaswanthreddy2000@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("19kh1a0537@A");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("19kh1a0537@A");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		
		
	}

}
