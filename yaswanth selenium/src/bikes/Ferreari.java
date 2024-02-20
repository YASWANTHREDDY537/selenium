package bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ferreari {
	
	@Test(groups = "alpha")
	public void ferre() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bikeexif.com/tag/ferrari-motorcycle");
		driver.quit();
	}

}
