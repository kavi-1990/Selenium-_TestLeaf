package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
		
		
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
		
		driver.manage().window().maximize();
	
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
	
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementByLinkText("Find Leads").click();
		
	//Thread.sleep(300);
		
	  driver.findElementByXPath("//span[text()='Email']").click();
		
	  driver.findElementByName("emailAddress").sendKeys("kavitharajendran990@gmail.com");
	
	//  driver.findElementByName("Find Leads").click(); not working
	  driver.findElementByXPath("//button[text()='Find Leads']").click();
	  
	  driver.findElementByClassName("x-btn-text").click();
	  
	}

}
