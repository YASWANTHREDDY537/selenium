package advanceselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_dws_007 extends Baseclass {
	@Test
	public void book() {
		driver.findElement(By.partialLinkText("Gift Cards")).click();
	}

}
