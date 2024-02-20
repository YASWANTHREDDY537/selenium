package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivisionpopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()=\"June 2024\"]/../..//p[text()=\"12\"]")).click();
			break;
		}
		catch(Exception e) {
			driver.findElement(By.xpath("//span[@aria-label=\"Next Month\"]")).click();
		}
		}
		driver.quit();
	}


}
