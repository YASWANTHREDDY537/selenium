package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrenturl {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kfc.com/");
        Thread.sleep(2000);
		
		 String currenturl = driver.getCurrentUrl();
		 System.out.println(currenturl);

		driver.close();

	}

}
