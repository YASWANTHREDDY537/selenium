package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitleofwebpage {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		String getTitleofwebpage = driver.getTitle();
		driver.close();
		System.out.println(getTitleofwebpage);
		 

	}

}
