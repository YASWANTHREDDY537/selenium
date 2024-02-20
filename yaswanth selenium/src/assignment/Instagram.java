package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		 WebElement ref = driver.findElement(By.xpath("//input[@type=\"text\"]"));

		 ref.sendKeys("yashas");
		 ref.sendKeys(Keys.CONTROL+"A");
		 ref.sendKeys(Keys.CONTROL+"c");
		 WebElement refer=driver.findElement(By.xpath("//input[@type=\"password\"]"));
	
		 refer.sendKeys(Keys.CONTROL+"v");
		 Thread.sleep(4000);
		 
	}

}
