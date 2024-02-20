package yas;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class INsta {
 
	
	public static void main(String[] args) {
		ChromeOptions oprion = new ChromeOptions();
		oprion.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(oprion);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
	}
}

