package day1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class flight {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
		
		driver.get("https://www.cleartrip.com/");
		
        driver.manage().window().maximize();
       
        driver.findElementById("RoundTrip").click();
        
        driver.findElementById("FromTag").sendKeys("Chennai",Keys.TAB);
        
        driver.findElementById("ToTag").sendKeys("Newyork",Keys.TAB);
        
        driver.findElementById("DepartDate").click();
        
        //driver.findElementByLinkText("23").click();
        Thread.sleep(30000);
       
        driver.findElementById("ReturnDate").click();
        
        Thread.sleep(300);
        
        
        WebElement dropdown=driver.findElementById("Adults");
        
        Select sel=new Select(dropdown);
        sel.selectByValue("2");
        
        
       WebElement children= driver.findElementById("Childrens");
       
       Select sel2=new Select(children);
       
       sel2.selectByValue("1");
       
       WebElement infant=driver.findElementById("Infants");
       
       Select sel3 =new Select(infant);
       
       sel3.selectByValue("1");
       
       driver.findElementById("MoreOptionsLink").click();
       
     WebElement classoftravel=  driver.findElementById("Class");
     
    Select sel4=new Select(classoftravel);
    sel4.selectByValue("Economy");
    
    
   driver.findElementById("AirlineAutocomplete").sendKeys("Emirtaes",Keys.TAB);
        		
        
	}

}