package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class App {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(new String("https://demoapps.qspiders.com/dragDrop?sublist=0"));
		WebElement drag = driver.findElement(By.xpath("//div[text()=\"Drag Me\"]"));
	
		Actions action = new Actions(driver);
		action.clickAndHold(drag).moveByOffset(787, 238).release().perform();
		
	}
}
