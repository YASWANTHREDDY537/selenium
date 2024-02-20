package advanceselenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_DWS__0013 extends Baseclass {
	
	String expectedtitle="Demo Web Shop. Books";
	@Test
	public void tocheckBooksPage() {
	    driver.findElement(By.partialLinkText("Books")).click();
	    String actualtitle = driver.getTitle();
	    //System.out.println(actualtitle);
//	    if(expectedtitle.contains("Books")) {
//	    Reporter.log("Books page got opened successfully", true);
//	    }
//	    else {
//	    	Reporter.log("Books page failed to open", true);
//	    }
	    Assert.assertEquals(actualtitle, expectedtitle, "Books page failed to open");
	}
}