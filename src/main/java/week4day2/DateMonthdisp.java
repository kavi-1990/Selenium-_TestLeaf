package week4day2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.ca.Cal;

public class DateMonthdisp {

	public static void main(String[] args) 
	{
		
		
	  // TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable--notification")	;
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MINUTES);
		driver.manage().window().maximize();
		
		Actions builder=new Actions(driver);// forgot to add builder 
		
		
		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.findElementByPartialLinkText("Start your wonderful journey").click();
		
	    WebElement Chooseroad=driver.findElementByXPath("//div[@class='items'][2]");
			
		builder.click(Chooseroad).perform();
		
		WebElement nxtbutton=driver.findElementByXPath("//button[@class='proceed']");
		
		builder.click(nxtbutton).perform();
		
		Date date = new Date();
		
		DateFormat sdf = new SimpleDateFormat("dd"); // Get pnly date not month , time 
		
		String today = sdf.format(date); // Get today's date
		
		System.out.println(today);
		
		int tomorrow=Integer.parseInt(today)+1;// Toget tomorrow date
	    
		System.out.println(tomorrow);
		
		String Selmon=driver.findElementByXPath("//div[@class='month picked']").getText();// To display the selected month
		
		System.out.println(Selmon);
		
		SimpleDateFormat outputformat=new SimpleDateFormat("MM");// To get month in number.
		
		System.out.println(outputformat.format(date.getTime()));
		
		
		
		
				
		

	}

}
