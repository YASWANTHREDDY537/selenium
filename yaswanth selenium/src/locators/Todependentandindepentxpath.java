package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todependentandindepentxpath {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id=\"men\"]")).click();
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//span[text()=\"nike shues\"]/../../..//button[@type=\"button\"]")).click();
	
	}

}
