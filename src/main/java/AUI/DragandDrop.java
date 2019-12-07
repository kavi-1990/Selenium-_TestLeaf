package AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;
		
		driver.get("http://leafground.com/pages/drop.html");
		
        driver.manage().window().maximize();
        
       WebElement drag= driver.findElementByXPath("//p[text()='Drag me to my target']");
        
       	WebElement drop	=driver.findElementById("droppable");
        
        Actions builder=new Actions(driver);
        
        builder.dragAndDrop(drag, drop).perform();
		
		
	}

}
