package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettitleofwebpage {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(2000);
		String getTitleofwebpage = driver.getTitle();
		
		System.out.println(getTitleofwebpage);
		 

		driver.close();
	}

}
