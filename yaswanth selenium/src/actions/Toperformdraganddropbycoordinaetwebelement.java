package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Toperformdraganddropbycoordinaetwebelement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement web = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"]"));
		driver.switchTo().frame(web);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt=\"The peaks of High Tatras\"]"));
		Actions action = new Actions(driver);
		action.click(image1).perform();
		//action.dragAndDropBy(image1, 600, 0).perform();
		//action.clickAndHold(image1).moveByOffset(600, 0).release().perform();		
	}

}
