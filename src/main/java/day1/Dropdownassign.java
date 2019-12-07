package day1;

import java.awt.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownassign {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
    
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
        driver.manage().window().maximize();
        
        
        driver.findElementById("dropdown1").click();
        
     WebElement index1=  driver.findElementById("dropdown1");
        
        Select sel1=new Select(index1);
        
       sel1.selectByIndex(1);
       
       WebElement names=driver.findElementByName("dropdown2");
       Select sel2=new Select(names);
       
       sel2.selectByVisibleText("UFT/QTP");
       
       
       /*sel1.selectByValue(2);*/
       
       
    WebElement  valuess=  driver.findElementById("dropdown3");
    
    Select sel4=new Select(valuess);
    
    sel4.selectByValue("4");
       
   
    
     
    
		/*
		 * WebElement aloption= driver.findElementById("dropdown3");
		 * 
		 * Select listofelement=new Select(aloption);
		 * 
		 * System.out.println(listofelement.getOptions());
		 * 
		 * System.out.println(listofelement.si);
		 */
     
    
    
		/*
		 * Select dropdown=new Select(driver.findElementById("dropdown3"));
		 * 
		 * List <WebElement> list=dropdown.getOptions();
		 * 
		 * for(WebElement we:list) {
		 * 
		 * System.out.println(we.getText()); }
		 */
    
    
    
   /* WebElement numberofoption=driver.findElementByClassName("dropdown");
    
    int size=numberofoption.getSize();
    
    System.out.println(size);*/
     
     
       
       
       
		
		

	}

}
