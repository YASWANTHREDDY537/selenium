package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOhandlealertpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		WebElement frame = driver.findElement(By.name("login_page"));
		driver.switchTo().frame(frame);
		driver.findElement(By.linkText("CONTINUE")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		//alert.accept();
		alert.dismiss();
		driver.quit();
	}

}