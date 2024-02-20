package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetquitTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.quit();
	}

}
