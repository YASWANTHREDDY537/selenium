package webelement_methods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuttucation {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
			List<WebElement> ele = driver.findElements(By.xpath("//div[@aria-label=\"iphone 15 pro\"]/../../../.."));
			for( WebElement elee:ele) {
				System.out.println(elee.getText());
			}
			driver.quit();
	}

}
