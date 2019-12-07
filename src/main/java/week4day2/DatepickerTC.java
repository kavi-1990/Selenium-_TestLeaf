package week4day2;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DatepickerTC {

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
		
		
		driver.findElementByXPath("//div[text()='show more']").click();
		
		
		String month="January 2020";
		
		Date dt=new Date();
		
		String exp_date="25";
		
	String text=driver.findElementByXPath("//div[text()='November 2019']").getText();
	
	System.out.println("text");
while(true) {
	
if(text.equals(month))
		
	{
		
		break;
	}
	
	
else
{
	//driver.findElementByXPath("(//div[@class='name']/following-sibling::div)[1]").click();
	
	driver.findElementByXPath("//ul[@class='daysName']/following-sibling::ul[1]").click();
	
}
	
	}
	

 List<WebElement> alldatesnavigate= driver.findElementsByXPath("//ul[@class='days']");

for( WebElement ele: alldatesnavigate)
{
	
	
	System.out.println(ele.getText());
}













}
	
	

}
