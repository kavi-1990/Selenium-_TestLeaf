package TestNGParameter;

import org.parameter.dataprovider.base.Projectspecificationmethods;
import org.testng.annotations.Test;

public class Parameter extends Projectspecificationmethods 

{

@ Test	
	public void runCL()
	
	{
		
	driver.findElementByLinkText("Create Lead").click();
	driver.findElementById("createLeadForm_firstName").sendKeys("Subha");
	  
	driver.findElementById("createLeadForm_lastName").sendKeys("Karthick");
	  
	driver.findElementByName("submitButton").click();
	  	
		
}
	
	
	
	
	
	
}
