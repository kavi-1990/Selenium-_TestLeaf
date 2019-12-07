package AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException
	
	{
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		driver.manage().window().maximize();
        
		WebElement username=driver.findElementByXPath("//input[@id='username']");
		
		Actions builder=new Actions(driver);
	    
	    builder.moveToElement(username).click(username).sendKeys("Demosalesmanager").perform();
	    
	   WebElement password=  driver.findElementByXPath("//input[@id='password']");
	  
	  builder.moveToElement(password).click(password).sendKeys("crmsfa").perform();
	    
	  WebElement loginbut=  driver.findElementByXPath("//input[@class='decorativeSubmit']");
	  
	  builder.click(loginbut).perform();
	    
	 WebElement crmsfalink= driver.findElementByXPath("//*[contains(text(),'CRM/SFA')]");
	 
	 builder.click(crmsfalink).perform();
	 
	 WebElement leadslink=driver.findElementByXPath("//*[contains(text(),'Leads')]");
	    
	   builder.click(leadslink) .perform();	
	   
	 WebElement  findleads=driver.findElementByXPath("//a[text()='Find Leads']");
	 
	 builder.click(findleads).perform();
	 
	WebElement phone= driver.findElementByXPath("//span[text()='Phone']");
	
	builder.click(phone).perform();
	
		
		  WebElement countrycode=driver.findElementByXPath("//input[@name='phoneCountryCode']");
		  
		  builder.click(countrycode).sendKeys("").perform();
		 
	
	WebElement phareacode=driver.findElementByXPath("//input[@name='phoneAreaCode']");
	
	builder.click(phareacode).sendKeys("212").perform();
	
	//builder.moveToElement(phareacode).sendKeys("212").perform();
	
	WebElement phnum=driver.findElementByXPath("//input[@name='phoneNumber']");
	builder.click(phnum).sendKeys("681-3029").perform();
	
	Thread.sleep(3000);
	
	WebElement findleadsbtn=driver.findElementByXPath("//button[text()='Find Leads']");
	builder.click(findleadsbtn).perform();
	
  WebElement firstresultinglead=driver.findElementByXPath("//a[text()='10008']");

 builder.click(firstresultinglead).perform();

 Thread.sleep(4000);
	
	WebElement deleteleadbtn=driver.findElementByXPath("//a[text()='Delete']");
	
	builder.click(deleteleadbtn).perform();
	
	
	
	}

}
