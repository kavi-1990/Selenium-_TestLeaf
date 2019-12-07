package NewTestNGPack;

import org.testleaf.leaftaps.base.ProjectSpecificmethos;
import org.testng.annotations.Test;

public class CL extends ProjectSpecificmethos

{
	
	@Test

  public  void runCL()
{
	login();
	
	driver.findElementByLinkText("Create Lead").click();
	
	
	  driver.findElementById("createLeadForm_companyName").sendKeys("CTS");
	  
	  //driver.findElementByName("firstName").sendKeys("Kavitha");
	  // create name inside Create contact
	  
	  //driver.findElementByName("lastName").sendKeys("Rajendran");//create name inside Create contact form
	  
	  driver.findElementById("createLeadForm_firstName").sendKeys("Subha");
	  
	  driver.findElementById("createLeadForm_lastName").sendKeys("Karthick");
	  
	  driver.findElementByName("submitButton").click();
	  
	  
	
	
	
	
}
	





}
