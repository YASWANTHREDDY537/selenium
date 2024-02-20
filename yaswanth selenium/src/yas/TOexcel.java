package yas;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream input = new FileInputStream("./testdata/Book177.xlsx");
		Workbook workbook = WorkbookFactory.create(input);
		String user = workbook.getSheet("Sheet1").getRow(0).getCell(0).toString();
		String pass = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String url = workbook.getSheet("Sheet1").getRow(2).getCell(0).toString();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}
}
