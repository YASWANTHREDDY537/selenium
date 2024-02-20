package yas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("mobiles");
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

}
