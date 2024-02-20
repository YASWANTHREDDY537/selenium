package yas;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AAA {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
		driver.get("https://www.woodenstreet.com/");

		driver.findElement(By.id("loginclose1")).click();

		driver.findElement(By.xpath("//a[@href=\"sofas?type=header_menu_sofas\"]")).click();
		driver.findElement(By.xpath("//p[@class=\"category-name\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"fabric-sofas?type=sofa-sets-icons\"]")).click();
		driver.findElement(By.linkText("Henry 3 Seater Sofa (Velvet, Chestnut Brown)")).click();
		driver.findElement(By.xpath("//span[text()=\"Indigo Blue\"]")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();

		/*
		 * driver.findElement(By.linkText("Bedroom")).click(); driver.findElement(By.
		 * xpath("//a [@href=\"tv-units?type=bedroom_furniture-icon\"]")).click();
		 * driver.findElement(By.linkText("heading")).click();
		 * driver.findElement(By.id("button-cart-buy-now")).click();
		 * driver.findElement(By.xpath("//a[@class=\"cart\"]")).click();
		 */

	}

}
