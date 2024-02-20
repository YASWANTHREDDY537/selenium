package advanceselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {

	@Test(priority = 3)
	public void crickbuzz() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.findElement(By.xpath("//div[text()=\"Day 1: 2nd Session\" and @title=\"Day 1: 2nd Session\"]")).click();
		Thread.sleep(3000);
		driver.quit();
		Reporter.log("welcome to amozon", true);
	}

	@Test(priority = -200)
	public void amozon() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com");
		driver.quit();
		Reporter.log("welcome of amazon", true);

	}

	@Test(priority = 10)
	public void bigbasket() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.quit();
		Reporter.log("welcome to bigbasket", true);

	}
}
