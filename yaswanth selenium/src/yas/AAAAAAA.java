package yas;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAAAAAA {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.woodenstreet.com/offline-furniture-store?type=header");
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.xpath("//a[@class=\"store\"]")).click();
	
	Set<String> pages = driver.getWindowHandles();
	 String parent = driver.getWindowHandle();
	 pages.remove(parent);
	 for(String ele:pages) {
		 driver.switchTo().window(ele);
		driver.findElement(By.xpath("//a[@href=\"https://www.woodenstreet.com/furniture-store-bangalore?type=store\"]")).click();
	 }	
		 
	 }
	 
	
	}

