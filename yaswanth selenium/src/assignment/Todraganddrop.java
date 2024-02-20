package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Todraganddrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.findElement(By.id("Accepted Elements")).click();
		
	WebElement iframe = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"and@data-src=\"../../demoSite/practice/droppable/accepted-elements.html\"]"));
	 driver.switchTo().frame(iframe);
	WebElement drag = driver.findElement(By.id("draggable"));
	WebElement drag2 = driver.findElement(By.id("draggable-nonvalid"));
	WebElement ele = driver.findElement(By.id("droppable"));
	
	 Actions action = new Actions(driver);

	 action.clickAndHold(drag).moveToElement(ele).release().perform();
	 action.clickAndHold(drag2).moveToElement(ele).release().perform();
	 driver.switchTo().defaultContent();
	 Thread.sleep(2000);
	 
		driver.findElement(By.id("Propagation")).click();
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@class=\"demo-frame lazyloaded\"and@data-src=\"../../demoSite/practice/droppable/propagation.html\"]"));
	 
		driver.switchTo().frame(iframe2);
		WebElement drag3 = driver.findElement(By.id("draggable"));
		WebElement drag4 = driver.findElement(By.id("droppable2-inner"));
		
		action.clickAndHold(drag3).moveToElement(drag4).release().perform();
		Thread.sleep(2000);
		driver.quit();
		
	}
}
