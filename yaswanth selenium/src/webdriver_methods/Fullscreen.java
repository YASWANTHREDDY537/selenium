package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Fullscreen {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		
		
	}

}
