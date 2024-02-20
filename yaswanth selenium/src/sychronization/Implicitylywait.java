package sychronization;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitylywait {
	public static void main(String[] args) {
		
	

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1200));
	driver.get("https://www.instagram.com");
	 WebElement ref = driver.findElement(By.xpath("//input[@type=\"text\"]"));

	 ref.sendKeys("yashas");

	 WebElement refer=driver.findElement(By.xpath("//input[@type=\"password\"]"));

	 refer.sendKeys("hello");
	   
	}
}
