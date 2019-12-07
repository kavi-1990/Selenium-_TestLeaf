package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erailprg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.get("https://erail.in/");
		
        driver.manage().window().maximize();
        
        driver.findElementById("txtStationFrom").clear();
        
        driver.findElementById("txtStationFrom").sendKeys("MAS",Keys.TAB);
        
        driver.findElementById("txtStationTo").clear();
        
        driver.findElementById("txtStationTo").sendKeys("NMKL",Keys.TAB);
        
        driver.findElementById("chkSelectDateOnly").click();
        Thread.sleep(2000);
      //Find the train first there is no locator hence xapth .. directly copied form sir
        
        WebElement train=driver.findElementByXPath("//table[contains(@class,'DataTable TrainList')]");
        
        // enter number of rows in trains
        
        List<WebElement>  numberoftrains = train.findElements(By.tagName("tr"));
        System.out.println(numberoftrains.size());
        
        
        
        
      	
	}

}
