package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAta {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(18));
		 FileInputStream fs =new FileInputStream("./testdata/Book177.xlsx");
		 Workbook book = WorkbookFactory.create(fs);
		String url = book.getSheet("Sheet1").getRow(0).getCell(0).toString();
		driver.get(url);
		 
		 
		 
	}

}
