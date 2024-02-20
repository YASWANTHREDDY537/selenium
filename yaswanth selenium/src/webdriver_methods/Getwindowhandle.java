package webdriver_methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandle {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		 String getwindowhandle = driver.getWindowHandle();
		 System.out.println(getwindowhandle);//B58F798DD713F11DB7500AB0D66B84D0
	}

}
