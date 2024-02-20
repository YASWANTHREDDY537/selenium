package yas;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class INs {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com");
	}
}

