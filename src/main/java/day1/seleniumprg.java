package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.get("http://leaftaps.com/opentaps/control/main");
		
        driver.manage().window().maximize();
        
        driver.findElementById("username").sendKeys("demosalesmanager");

        driver.findElementById("password").sendKeys("crmsfa");
        
        driver.findElementByClassName("decorativeSubmit").click();
	    
        driver.findElementByLinkText("CRM/SFA").click();
        
        driver.findElementByLinkText("Leads").click();
        
        driver.findElementByLinkText("Create Lead").click();
        
        driver.findElementById("createLeadForm_companyName").sendKeys("Oracle");
        
        driver.findElementById("createLeadForm_firstName").sendKeys("kavitha");
        
        driver.findElementById("createLeadForm_lastName").sendKeys("Rajendran");
        
        driver.findElementByName("submitButton").click();
        
        
        
        
        
        
		
	}

}
