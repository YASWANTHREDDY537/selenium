package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	   
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("avengers");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
