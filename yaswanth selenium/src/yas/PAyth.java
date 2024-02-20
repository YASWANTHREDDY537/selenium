package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PAyth {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://tickets.paytm.com/flights/");
		driver.findElement(By.id("text-box")).click();
	}

}
