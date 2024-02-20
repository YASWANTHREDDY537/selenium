package advanceselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_dws_009 extends Baseclass {
	@Test
	public void book() {
		driver.findElement(By.linkText("awesome")).click();
	}

}
