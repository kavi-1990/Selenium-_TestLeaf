package AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;
		
		driver.get("https://www.flipkart.com/");
		
        driver.manage().window().maximize();
        
        //driver.getKeyboard().sendKeys(Keys.ESCAPE);
        
        driver.findElementByXPath("//button[text()='✕']").click();
        
        WebElement electronics= driver.findElementByXPath("//span[text()='Electronics']");
        
        Actions builder=new Actions(driver);
        
        builder.moveToElement(electronics).perform();
        
        driver.findElementByPartialLinkText("Mi").click();
        
        
        
        
	
	
	
	}

}
