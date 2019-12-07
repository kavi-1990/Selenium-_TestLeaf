package week4day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class TCZoomCar {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		//System.setProperties(null);
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");

		//ChromeDriver options=new ChromeDriver()
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable--notification")	;
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);// forgot to add builder 
		
		
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.findElementByPartialLinkText("Start your wonderful journey").click();
		
	//driver.findElementByPartialLinkText(" Nelson Manickam Road").click();// takes a lot of time so xpath tired
			
	   WebElement Chooseroad=driver.findElementByXPath("//div[@class='items'][2]");
			
		builder.click(Chooseroad).perform();
		
		WebElement nxtbutton=driver.findElementByXPath("//button[@class='proceed']");
		
		builder.click(nxtbutton).perform();
		
		//driver.findElementByPartialLinkText("Next").click();// takes a lot of time so xpath tired
		 
		/*
		 * WebElement
		 * monthspicked=driver.findElementByXPath("//div[@class='month picked']");
		 * builder.click(monthspicked).perform();
		 */
		
		
		/*
		 * WebElement monsel= builder.click(monsel).perform();
		 */
		Thread.sleep(3000);

		driver.findElementByXPath("//div[@class='month'][1]").click();
	
		
  Thread.sleep(3000); 
  Date date = new Date(); // Get the current date
  DateFormat sdf = new SimpleDateFormat("dd"); //Get only the date (and not
		  //month, year, time etc) 
   String today = sdf.format(date); // Get today's date
        
    WebElement  dtsel= driver.findElementByXPath("//div[@class='day picked low-price']");
     builder.click(dtsel).perform();
          
		  int tomorrow = Integer.parseInt(today)+1; // Convert to integer and add 1 to it
		  System.out.println(tomorrow); // Print tomorrow's date
		  
		  
	
		  
		  
		 

	}

}
