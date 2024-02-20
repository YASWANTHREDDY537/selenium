package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetmaximizietheBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		Thread.sleep(2000);
		driver.manage().window().minimize();
		

	}

}
