package org.testleaf.leaftaps.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificmethos 

{
public  ChromeDriver driver;
//@ BeforeMethod
	public void login()
	{
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
		 
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
		
		
	}
	
	
	  @AfterMethod
	  
	  public void close() {
	  
	  driver.close();
	  
	  
	  }
	 
}
