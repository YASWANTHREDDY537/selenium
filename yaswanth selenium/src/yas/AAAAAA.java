package yas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AAAAAA {
	public static void main(String[] args) {
		ChromeOptions opton = new ChromeOptions();
		opton.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(opton);
		driver.get("https://demoapps.qspiders.com/clickHold?scenario=1&sublist=0");
		
		WebElement ele = driver.findElement(By.id("circle"));
		Actions action = new Actions(driver);
		action.clickAndHold(ele).perform();
		List<WebElement> eleq = driver.findElements(By.tagName("a"));
		System.out.println(eleq.size());
		driver.quit();
		
	}

}
