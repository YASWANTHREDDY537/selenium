package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetwholewindowScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File shot = ts.getScreenshotAs(OutputType.FILE);
		File ref = new File("./errorshot/google.png");
		FileHandler.copy(shot, ref);
		driver.quit();

	}

}
