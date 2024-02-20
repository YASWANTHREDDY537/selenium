package advanceselenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Tc_dws_004 extends Baseclass {
	@Test
	public void book() {
		driver.findElement(By.partialLinkText("Apparel & Shoes")).click();
		boolean ApparelShoes = driver.findElement(By.xpath("//h1[text()='Apparel & Shoes']")).isDisplayed();
		if(ApparelShoes==true) {
			System.out.println("entered into Apparel & Shoes page");
		}
		else {
			System.out.println("not entered");
		}
	}

}
