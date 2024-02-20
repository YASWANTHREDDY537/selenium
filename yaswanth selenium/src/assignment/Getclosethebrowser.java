package assignment;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getclosethebrowser {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		  String get = driver.getPageSource();
		  System.out.println(get);
	 

	}

}
