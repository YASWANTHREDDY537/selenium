package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getcurrentpageurl {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 String get = driver.getCurrentUrl();
		 System.out.println(get);
	}
}
