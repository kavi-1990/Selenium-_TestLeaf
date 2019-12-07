package day1;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownalloption {

	
	
	
public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS) ;
    
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
        driver.manage().window().maximize();
        
        
        Select sel=new Select(driver.findElementById("dropdown1"));      
        
        java.util.List<WebElement> list=sel.getOptions();
        
        for(WebElement We:list)
        {
        	
        	System.out.println(We.getText());
        	
        	System.out.println(We.getTagName());
        	
        
        	
       	
        }
 
       int lastoption=list.size(); 
        
       System.out.println(lastoption);
        
       
       int lastbefore=list.size()-1;
       
       System.out.println(lastbefore);
       
      
        
	}
}
