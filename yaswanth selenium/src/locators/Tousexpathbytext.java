package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tousexpathbytext {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String text = driver.findElement(By.xpath("//span[text()=\"Login was unsuccessful. Please correct the errors and try again.\"]")).getText();
		System.out.println(text);
		}

}
