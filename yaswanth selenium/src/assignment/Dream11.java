package assignment;

import java.time.Duration;
import java.util.Set;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
		driver.get("https://www.dream11.com/");
		 Set<String> windows = driver.getWindowHandles();
		 System.out.println(windows);
		 driver.quit();
	}
}
