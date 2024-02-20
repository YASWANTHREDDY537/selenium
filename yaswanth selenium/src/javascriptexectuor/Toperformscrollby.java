package javascriptexectuor;


import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Toperformscrollby {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("flower",Keys.ENTER);
		driver.findElement(By.linkText("Images")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()=\"20 Flowering Plants With Large Blooms\"]")).click();
			break;
		}
		catch(Exception e) {
			js.executeScript("window/scrollBy(0,700)");
		}
		}
		/*//Set<String> ele = driver.getWindowHandles();
		//String pages = driver.getWindowHandle();
		//ele.remove(pages);
		//for(String web:ele) {
			//driver.switchTo().window(web);
		for(;;) {
		try {
			driver.findElement(By.linkText("Hydrangea")).click();
			break;
		}
		catch(Exception e1)
		{
			js.executeScript("window.scrollBy(0,500)");
		}
		
	}
		}*/
	}

}
