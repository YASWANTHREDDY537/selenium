package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POpup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.id("loginclose1")).click();
		driver.findElement(By.partialLinkText("Stores")).click();

		String parent = driver.getWindowHandle();
		Set<String> pages = driver.getWindowHandles();
		pages.remove(parent);
		for (String id : pages) {
		driver.switchTo().window(id);
		driver.findElement(By.xpath("//a[@href=\"https://www.woodenstreet.com/furniture-store-bangalore?type=store\"]")).click();
			break;
		}
	}
}
