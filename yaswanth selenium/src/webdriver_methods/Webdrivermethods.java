package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {
	public static void main(String[] args) throws InterruptedException {
		    ChromeDriver driver = new ChromeDriver();
		    driver.get("https://www.google.com");
		    Thread.sleep(2000);
		    String gettitle = driver.getTitle();
		    System.out.println(gettitle);
		    String url = driver.getCurrentUrl();
		    System.out.println(url);
		    String source = driver.getPageSource();
		    System.out.println(source);
		    driver.manage().window().fullscreen();
		    Point getpostion = driver.manage().window().getPosition();
		    System.out.println(getpostion);
		    driver.manage().window().setPosition(new Point(100,20));
		    Dimension dimension = driver.manage().window().getSize();
		    System.out.println(dimension);
		    System.out.println(dimension.getHeight());
		    System.out.println(dimension.getWidth());
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
		    driver.manage().window().setSize(new Dimension(1200,300));
	}

}
