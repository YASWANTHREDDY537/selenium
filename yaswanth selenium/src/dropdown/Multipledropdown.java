package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipledropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement listbox = driver.findElement(By.id("cars"));
		
	   //select class
		Select multiselect=new Select(listbox);
		System.out.println(multiselect.isMultiple());
		//To select
		multiselect.selectByIndex(0);
		multiselect.selectByValue("199");
		Thread.sleep(2000);
		//To deSelect
//	multiselect.deselectByIndex(0);
//		multiselect.deselectByValue("199");
		multiselect.deselectAll();
		List<WebElement> option = multiselect.getOptions();
		for(WebElement ste:option) {
			System.out.println(ste.getText());
		}
		
	}

}