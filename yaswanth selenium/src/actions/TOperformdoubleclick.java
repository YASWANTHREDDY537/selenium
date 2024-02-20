package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TOperformdoubleclick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		WebElement element = driver.findElement(By.id("add"));
		Actions action = new Actions((driver));
		action.doubleClick(element).perform();
		Thread.sleep(3000);
		
	WebElement minus = driver.findElement(By.id("minus"));
	action.doubleClick(minus).perform();		
	}

}
