package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TousexpathusingMultipleattrubies {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type=\"submit\" and @value=\"Log in\"]")).click();
		driver.findElement(By.xpath("")).click();
	}

}
