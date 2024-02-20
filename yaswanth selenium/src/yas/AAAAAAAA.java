package yas;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAAAAAAA {


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("image",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt=\"50,000+ Image Pictures | Download Free Images on Unsplash\"][2]")).click();
		Thread.sleep(2000);
		//String url = driver.getCurrentUrl();
		//String page = driver.getPageSource();
		//driver.getWindowHandle();
		//System.out.println(url);
		//System.out.println(page);
		driver.quit();
		
	}
}
