package week3day2;

import java.awt.List;

import java.util.*;

import org.apache.commons.collections4.iterators.ArrayListIterator;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrainCollection {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.get("https://erail.in/");
		
        driver.manage().window().maximize();
        
       
		/*
		 * WebElement TS= driver.findElementById("txtStationFrom");
		 * 
		 * //List<String> lst=new ArrayListIterator<String>(TS, 0, 40);
		 * 
		 * // LinkedList<String> lst=new ArrayListIterator(TS, 0, 40);
		 * 
		 * // S
		 * 
		 * List<> lst=new ArrayListIterator<String>(TS, 0);
		 * 
		 * 
		 * HashSet<String> hs = new HashSet<String>()
		 * 
		 * 
		 * 
		 */
        
   
        WebElement a= driver.findElementById("txtStationFrom");
                
java.util.List<WebElement> lst=new ArrayList<WebElement>();

System.out.println(lst.isEmpty());

//Collections.sort(lst);

//System.out.println(lst.add("cbe"));
	}

}
