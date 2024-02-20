package yas;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.chrome.ChromeDriver;

public class QWE {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ChromeDriver driver = new ChromeDriver();
		FileInputStream fs = new FileInputStream("./testdata/Book177.xlsx");
		Workbook wb =WorkbookFactory.create(fs);
		String url = wb.getSheet("Sheet1").getRow(0).getCell(1).toString();
		driver.get(url);
		
		
	}
}
