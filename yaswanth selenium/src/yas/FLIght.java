package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FLIght {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tickets.paytm.com/flights/");
		//driver.findElement(By.xpath("//input[@value=\"rTrip\"]")).click();
		WebElement fromlocation = driver.findElement(By.xpath("//input[@value=\"Delhi\"]"));
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeAsyncScript("argument[0]",fromlocation.click());
		fromlocation.clear();
		fromlocation.sendKeys("Bengaluru",Keys.ENTER);
		WebElement tolocation = driver.findElement(By.xpath("//span[text()=\"BOM\"]"));
		tolocation.clear();
		tolocation.sendKeys("Delhi, India");
		driver.findElement(By.xpath("(//div[text()=\"15\"])[1]")).click();
		driver.findElement(By.xpath("(//div[text()=\"17\"])[1]")).click();
		driver.findElement(By.id("travellerClass")).click();
		driver.findElement(By.xpath("(//img[@role=\"button\"])[2]")).click();
		driver.findElement(By.xpath("(//img[@role=\"button\"])[4]")).click();
		driver.findElement(By.id("flightSearch")).click();
		
	}

}
