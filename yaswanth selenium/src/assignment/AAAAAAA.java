package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAAAAAA {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("images",Keys.ENTER);
		driver.findElement(By.linkText("Images")).click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		for(;;) {
			try {
				driver.findElement(By.xpath("//img[@alt=\"1,308,740 Global Stock Photos - Free & Royalty-Free Stock Photos from  Dreamstime\"]")).click();
				break;
			}
			catch (Exception e) {
				js.executeScript("window.scrollBy(0,1500)")		;
				}
		}
		}

}
