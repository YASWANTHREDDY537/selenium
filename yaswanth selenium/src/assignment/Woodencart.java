package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodencart {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("loginclose1")).click();
		driver.findElement(By.linkText("Study & Office")).click();
		driver.findElement(By.partialLinkText("Study Tables")).click();
		driver.findElement(By.linkText("Calisto Engineered Wood Study Table (Exotic Teak Frosty White)")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
		
		driver.findElement(By.xpath("//a[@href=\"sofas?type=header_menu_sofas\"]")).click();
		driver.findElement(By.xpath("//p[@class=\"category-name\"]")).click();
		driver.findElement(By.xpath("//a[@href=\"fabric-sofas?type=sofa-sets-icons\"]")).click();
		driver.findElement(By.linkText("Henry 3 Seater Sofa (Velvet, Chestnut Brown)")).click();
		driver.findElement(By.xpath("//span[text()=\"Indigo Blue\"]")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();

		
		driver.findElement(By.linkText("Storage")).click();
		driver.findElement(By.partialLinkText("TV Units")).click();
		driver.findElement(By.linkText("Harvey Tv Unit (Exotic Teak Finish)")).click();
		driver.findElement(By.id("button-cart-buy-now")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		driver.quit();

	}

}
