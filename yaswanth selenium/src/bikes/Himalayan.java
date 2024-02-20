package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Himalayan {
	@Test(groups = "alpha")
	public void him() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		driver.quit();
	}

}
