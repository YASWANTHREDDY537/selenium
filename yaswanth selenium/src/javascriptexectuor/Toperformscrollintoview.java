package javascriptexectuor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Toperformscrollintoview {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://worldometers.info/geography/flags-of-the-world/");
		JavascriptExecutor js =(JavascriptExecutor) driver;
		WebElement india = driver.findElement(By.xpath("//div[text()=\"India\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", india);
	}

}
