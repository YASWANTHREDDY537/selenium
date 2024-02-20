package yas;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805682%7Cb%7C%23fb%7C&placement=&creative=550525805682&keyword=%23fb&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221592%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-311723615984%26loc_physical_ms%3D9061999%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAiApuCrBhAuEiwA8VJ6Jj72Bbct0nmb4zq2UNr6_JDgbWr74cZQXlzGfj-ipgCSFOAXeNedXhoC2ksQAvD_BwE");
		WebElement day = driver.findElement(By.id("day"));
		 WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		Select days = new Select(day);
		days.selectByVisibleText("10");
		Select months = new Select(month);
		months.selectByValue("8");
		Select years = new Select(year);
		years.selectByValue("2000");
		 List<WebElement> months1 = months.getOptions();
		for(WebElement year1:months1) {
			System.out.println(year1.getText());
			
		}
		
	}

}
