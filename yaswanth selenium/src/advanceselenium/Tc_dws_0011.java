package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tc_dws_0011 extends Baseclass {
	@Test
	public void book() throws InterruptedException {
		//WebElement ele = driver.findElement(By.partialLinkText("Computers"));
		//WebElement desk = driver.findElement(By.partialLinkText("Desktops"));
		Actions action = new Actions(driver);
		action.moveByOffset(626, 211).perform();
		WebElement desk = driver.findElement(By.partialLinkText("Desktops"));
		
		action.click(desk).perform();
		Thread.sleep(10000);
		
	}

}
