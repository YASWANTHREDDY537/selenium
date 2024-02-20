package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opendemoweb {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		 driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.id("Email")).sendKeys("gyaswanthreddy2000@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("19kh1a0537@A");
	}

}
