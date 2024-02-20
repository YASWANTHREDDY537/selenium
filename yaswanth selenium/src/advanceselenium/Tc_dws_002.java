package advanceselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_dws_002 extends Baseclass {
	@Test
	public void book() {
		driver.findElement(By.partialLinkText("Computers")).click();
		boolean Computers = driver.findElement(By.xpath("//h1[text()='Computers']")).isDisplayed();
		if(Computers==true) {
			System.out.println("entered into Computers page");
		}
		else {
			System.out.println("not entered");
		}
	}

}
