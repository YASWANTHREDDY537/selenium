package yas;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(new String("https://www.google.com"));
	}

}
