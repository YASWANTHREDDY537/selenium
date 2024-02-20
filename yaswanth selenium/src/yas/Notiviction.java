package yas;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Notiviction {

	public static void main(String[] args) {
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://demoapps.qspiders.com/browserNot?sublist=0");
		driver.findElement(By.id("browNotButton")).click();
		
		
	}
}
