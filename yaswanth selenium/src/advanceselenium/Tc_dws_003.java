package advanceselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_dws_003 extends Baseclass {
	@Test
	public void book() {
		driver.findElement(By.partialLinkText("Electronics")).click();
		boolean Electronics = driver.findElement(By.xpath("//h1[text()='Electronics']")).isDisplayed();
		if(Electronics==true) {
			System.out.println("entered into Electronics page");
		}
		else {
			System.out.println("not entered");
		}
		
	}

}
