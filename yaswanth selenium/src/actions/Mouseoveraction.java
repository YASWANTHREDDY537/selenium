package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseoveraction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
	
		Actions action = new Actions(driver);
		 WebElement element = driver.findElement(By.linkText("Dining & Kitchen"));
		 WebElement element1 = driver.findElement(By.linkText("Study & Office"));
		 
		 action.moveToElement(element).perform();
		 Thread.sleep(4000);
		 action.moveToElement(element1).perform();
	}
}
