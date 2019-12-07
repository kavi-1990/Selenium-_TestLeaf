package week3day2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SortingLinkedHashMapInAscOrderByValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		//driver.get("https://erail.in/");
		
		driver.get("https://www.amazon.in/gp/most-gifted/?ref_=nav_cs_giftideas");
		
        driver.manage().window().maximize();
        
        
      //  WebElement b=driver.findElementByClassName("icon-shuffle");
		
  
		
		/*
		 * Map<String, String> linkMap = new LinkedHashMap<String, String>();
		 * 
		 * driver.findElementById("nav-hamburger-menu").getText();
		 * 
		 * for(Map.Entry<String, String> name : linkMap.entrySet())
		 * 
		 * { System.out.println("Key : " + name.getKey() + "\t\t" + "Value : " +
		 * name.getValue());}
		 */
		  
        
        driver.findElementsById("nav-hamburger-menu").get(0);
		  List<WebElement> textContainers =  driver.findElementsById("nav-hamburger-menu");
		  StringBuilder retrieved = new StringBuilder();
		  for (int i = 0; i < textContainers.size(); i++) {
		      retrieved.append(textContainers.get(i).getText());
		  }
		
		
		
		
		
	}

}
