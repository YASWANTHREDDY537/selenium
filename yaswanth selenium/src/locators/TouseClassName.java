package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TouseClassName {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.navigate().to("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
		driver.findElement(By.className("email")).sendKeys("yashwanth@gmail.com");
	*/
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.className("_aa4b _add6 _ac4d _ap35")).sendKeys("yaswanth");
	}
}
