package yas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AA {


	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.woodenstreet.com/");
		for( ;;) {
			try {
			driver.findElement(By.id("loginclose1")).click();
			break;
		}
			
		catch (Exception e) {
			
		}
	
}
	 }}

