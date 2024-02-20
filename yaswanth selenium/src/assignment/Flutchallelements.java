package assignment;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flutchallelements {

	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.woodenstreet.com/");
		Thread.sleep(2000);
		for(;;){
	        try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			} catch (Exception e) {
				
				Thread.sleep(1000);
			}
		}
		 List<WebElement> link = driver.findElements(By.xpath("//ul[@class=\"container flex\"]/li"));
		 for(  WebElement ele:link){
			
		System.out.println(ele.getText());
		 }
		
	}

}
