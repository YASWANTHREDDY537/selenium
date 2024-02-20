package advanceselenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tc_dws_0012 extends Baseclass {
	@Test
	public void book() {
		 driver.findElement(By.partialLinkText("Books")).click();
		boolean booksText = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		Assert.assertEquals(booksText, true ,"hello");
	}

}
