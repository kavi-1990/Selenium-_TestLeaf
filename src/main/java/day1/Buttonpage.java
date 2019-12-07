package day1;

import java.awt.Button;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttonpage {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.get("http://leafground.com/pages/Button.html");
		
		/*
		 * driver.findElementById("home").click();
		 * 
		 * Thread.sleep(6000);
		 */
	
		/*
		 * WebElement element= driver.findElementById("position");
		 * 
		 * Point pointer =element.getLocation();
		 * 
		 * int xcord=pointer.getX();
		 * 
		 * int ycord=pointer.getY();
		 * 
		 * System.out.println(xcord+";"+ycord);
		 */
	
	// To get x & y coordinates of button .
		
		System.out.println(driver.findElementById("position").getLocation());
	
	
	
		/*
		 * WebElement elements=driver.findElementById("size");
		 * 
		 * int Buttoheight=elements.getSize().getHeight();
		 * 
		 * int buttonwidht=elements.getSize().getWidth();
		 */
	
	
		System.out.println(driver.findElementById("size").getSize());
	
	/*System.out.println(Buttoheight+";"+buttonwidht+"pixcels");*/
	
	
		/*
		 * WebElement elementcolor=driver.findElementById("color");
		 * 
		 * System.out.println(elementcolor);
		 * 
		 */
	
	System.out.println(driver.findElementById("color").getCssValue("background-color"));
	
	
System.out.println(driver.findElementById("size").getCssValue("background-color"));
	}

}
