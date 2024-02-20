package advanceselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_dws_001 extends Baseclass {
	@Test
	public void book() {
		 driver.findElement(By.partialLinkText("Books")).click();
		boolean booksText = driver.findElement(By.xpath("//h1[text()='Books']")).isDisplayed();
		if(booksText==true) {
			System.out.println("entered into books page");
		}
		else {
			System.out.println("not entered");
		}
	}

}
