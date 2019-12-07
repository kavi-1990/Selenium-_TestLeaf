package week4day2;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AcmeTestapp {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;// need to learn
		
    
		driver.get("https://acme-test.uipath.com/account/login");
		
        driver.manage().window().maximize();
        
        driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
        
        driver.findElementById("password").sendKeys("leaf@12",Keys.TAB);
        
        driver.findElementById("buttonLogin").click();
        
        Thread.sleep(3000);
		
        Actions builder=new Actions(driver);// always use xpath.
		
        
        WebElement Vendors=driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");
		
        builder.moveToElement(Vendors).perform();
        
        WebElement searchven=  driver.findElementByLinkText("Search for Vendor");
		
	     builder.click(searchven).perform();
		
		
		WebElement vendorname=driver.findElementByXPath("//input[@id='vendorName']");
		builder.sendKeys(vendorname, "Blue Lagoon").perform();
		 
		
		WebElement searchbtn=driver.findElementByXPath("//button[@id='buttonSearch']");
		
		builder.click(searchbtn).perform();
		
		
		/*
		 * WebElement country=driver.findElementByXPath("//th[text()='Country']");
		 * builder.
		 */

		
		WebElement logbtn=driver.findElementByLinkText("Log Out");
		
		builder.click(logbtn).perform();
		
		driver.close();
	}

}
