package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alpha {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(new String("https://demoapps.qspiders.com/dropdown?sublist=0"));
	 WebElement drib = driver.findElement(By.id("select1"));
	 Select selection = new Select(drib);
	
	 selection.isMultiple();
	 selection.selectByIndex(1);
	 selection.selectByIndex(0);
	 selection.selectByIndex(2);
	 Thread.sleep(3000);
	 driver.quit();
	}
}
