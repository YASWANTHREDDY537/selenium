package yas;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AAS {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File shot = ts.getScreenshotAs(OutputType.FILE);
		File fs = new File("./errorshot/name.png");
		FileHandler.copy(shot, fs);
	}

}
