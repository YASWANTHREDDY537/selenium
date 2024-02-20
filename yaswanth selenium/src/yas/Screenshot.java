package yas;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));
		driver.get("https://www.instagram.com");
		
	File shot = driver.findElement(By.xpath("//div[@role=\"button\"]")).getScreenshotAs(OutputType.FILE);
		
		File file = new File("./errorshot/shot.png");
		FileHandler.copy(shot, file);
	}

}
