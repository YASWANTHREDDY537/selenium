package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quitpage {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
		

	}

}
