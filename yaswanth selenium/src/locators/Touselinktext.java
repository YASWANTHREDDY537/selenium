package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Touselinktext {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
	}

}
