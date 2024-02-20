package iiframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11iframe {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.dream11.com/");
		// driver.switchTo().frame(0);
		driver.switchTo().frame("send-sms-iframe");
		//WebElement webelement = driver.findElement(By.id("send-sms-iframe"));
		//driver.switchTo().frame(webelement);
		 driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		// driver.switchTo().parentFrame();
		 //driver.findElement(By.linkText("About Us")).click();
		
		 
		
		
	}
}
