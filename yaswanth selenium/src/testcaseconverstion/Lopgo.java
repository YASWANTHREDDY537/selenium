package testcaseconverstion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lopgo {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			Window maximum = driver.manage().window();
			maximum.maximize();
		Timeouts wait = driver.manage().timeouts();
		wait.implicitlyWait(Duration.ofSeconds(10));
			 driver.navigate().to("https://www.facebook.com");
			 boolean textmm = driver.findElement(By.xpath("//img[@alt=\"Facebook\"]")).isDisplayed();
			 if(textmm==true) {
				 System.out.println("facebook is displayes");
			 }
			 else {
				 System.out.println("not ");
			 }
			
	}
}
