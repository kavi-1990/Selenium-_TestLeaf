package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TCFacebook {

	public static void main(String[] args) throws InterruptedException 
	
	{
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		//ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		
		
		
         driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS) ;// need to learn
		
     	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		
		
		driver.findElementById("email").sendKeys("kavirajendran43@gmail.com");
		
		driver.findElementById("pass").sendKeys("sanvi@123");
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		
		driver.findElementByXPath("//input[@name='q']").sendKeys("TestLeaf solutions",Keys.ENTER);
		
		Thread.sleep(3000);
		
		//driver.findElementById("u_2_4").click();
		
		driver.findElementByXPath("//button[@data-bt='{\"ct\":\"like_page\"}']").click();
		
		//driver.findElementByXPath("//button[@type='submit'][10]").click();
		
		
		
	
	
	
	
	}

}
