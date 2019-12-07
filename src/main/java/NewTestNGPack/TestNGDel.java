package NewTestNGPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testleaf.leaftaps.base.ProjectSpecificmethos;
import org.testng.annotations.Test;

public class TestNGDel  extends ProjectSpecificmethos


{
	
	
	@Test
	
	public void rundel() throws InterruptedException
	
	{
		login();
		
		
Actions builder=new Actions(driver);
		
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
		
		
		
		/*
		 * // WebElement
		 * firstresultinglead=driver.findElementByXPath("//a[text()='10008']");
		 * 
		 * WebElement
		 * firstresultinglead=driver.findElementByXPath("(//a[@class='linktext'])[4]");
		 * 
		 * builder.click(firstresultinglead).perform();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * WebElement deleteleadbtn=driver.findElementByXPath("//a[text()='Delete']");
		 * 
		 * builder.click(deleteleadbtn).perform();
		 * 
		 * 
		 */		
		
		

		
		
		
	}
	
	
	
	
	
	
	
	
	

}
