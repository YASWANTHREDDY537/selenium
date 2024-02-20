package yas;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(17));
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("hello");
		driver.findElement(By.name("lastname")).sendKeys("hello");
		//driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("98765343");
		List<WebElement> div = driver.findElements(By.tagName("a"));
		System.out.println(div.size());
		driver.findElement(By.cssSelector("")
		
		driver.quit();
		
		
		
	}

}
