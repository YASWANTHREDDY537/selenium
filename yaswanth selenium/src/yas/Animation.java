package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Animation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://poki.com/en/g/super-dangerous-dungeons");
		Thread.sleep(9000);
		WebElement frame = driver.findElement(By.name("gameFrame"));
		driver.switchTo().frame(frame);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
		Thread.sleep(10000);
	//action.moveByOffset(1302, 62).click().release();
		action.sendKeys(Keys.ENTER).perform();
		/*Thread.sleep(10000);
		for(;;) {
			try {
		
		action.sendKeys(Keys.SPACE).perform();
		break;
			}
			catch(Exception e) {
				
			
		Thread.sleep(2000);
			}
		}*/
		action.sendKeys(Keys.ARROW_LEFT).perform();
		Thread.sleep(5000);
	}
}
