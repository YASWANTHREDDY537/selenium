package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WE {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(new String("https://www.instagram.com"));
		//String VLU = driver.findElement(By.name("password")).getAttribute("class");
		//System.out.println(VLU);
		boolean key = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isSelected();
		System.out.println(key);
		driver.quit();
}

}
