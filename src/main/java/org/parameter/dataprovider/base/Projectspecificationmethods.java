package org.parameter.dataprovider.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Projectspecificationmethods 
{

	public  ChromeDriver driver;
	
	@Parameters({"url","uname","password"})
	
	@ BeforeMethod
		public void login(String url,String username,String pwd)
		{
			
			
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
			driver=new ChromeDriver();
			 
			driver.get("url");
		
			driver.findElementById("username").sendKeys("username");
			
			driver.findElementById("password").sendKeys("pwd");
			
			driver.findElementByClassName("decorativeSubmit").click();
			
			driver.findElementByLinkText("CRM/SFA").click();
			
			
		}
		
		
		  @AfterMethod
		  
		  public void close() {
		  
		  driver.close();
		  
		  
		  }
	
	
}
