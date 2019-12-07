package AUI;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;
		
		driver.get("http://leafground.com/pages/selectable.html");
		
        driver.manage().window().maximize();
        	
        
      WebElement item3= driver.findElementByXPath("//li[text()='Item 3']");
      
      WebElement item5= driver.findElementByXPath("//li[text()='Item 5']");

      
		
		  Actions builder=new Actions(driver);
		  
		  builder.keyDown(Keys.CONTROL).click(item3).click(item5).keyUp(Keys.CONTROL).
		  perform();
		 
		
	}

}
