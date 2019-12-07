package AUI;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionEditleads {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		driver.manage().window().maximize();
        
		
	//WebElement username=driver.findElementByXPath("//input[@id='text']");
	  
		Thread.sleep(3000);
	
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
 
 Thread.sleep(300);
 
 WebElement firstname=driver.findElementByXPath("(//input[@name='firstName'])[3]");
	
 builder.click(firstname).sendKeys("Viji").perform();

 WebElement findleadsbtn=driver.findElementByXPath("//button[text()='Find Leads']");
 
 builder.click(findleadsbtn).perform();
 
 
 WebElement firstresultingleadclick=driver.findElementByXPath("(//a[@class='linktext'])[4]");
 builder.click(firstresultingleadclick).perform();
 
//WebElement editbtn= driver.findElementByXPath("//*[@class='subMenuButton'][3]");
 
 WebElement editbtn=driver.findElementByXPath("(//a[@class='linktext'])[4]");

builder.click(editbtn).perform();
 
 
WebElement updatecmpy=driver.findElementByXPath("//*[@id='updateLeadForm_companyName']");

builder.click(updatecmpy).sendKeys("oracle").perform();



WebElement cliupdatbtn=driver.findElementByXPath("//*[@name='submitButton'][1]");

builder.click(cliupdatbtn).perform();

	}

}
