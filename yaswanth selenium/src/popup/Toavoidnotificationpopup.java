package popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Toavoidnotificationpopup {
	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		//option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
	}

}
