package AUI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionCreLead {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe");
		
		 
		ChromeDriver driver=new ChromeDriver();// with this only chrome driver loads 
		
		
		driver.get("http://leaftaps.com/opentaps/control/logout");
	
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementById("password").sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElementByLinkText("CRM/SFA").click();
	
		driver.findElementByLinkText("Create Lead").click();
		
		
		  driver.findElementById("createLeadForm_companyName").sendKeys("infosys");
		  
		  //driver.findElementByName("firstName").sendKeys("Kavitha");
		  // create name inside Create contact
		  
		  //driver.findElementByName("lastName").sendKeys("Rajendran");//create name inside Create contact form
		  
		  driver.findElementById("createLeadForm_firstName").sendKeys("Viji");
		  
		  driver.findElementById("createLeadForm_lastName").sendKeys("Lakshmi");
		  
		  
		  driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Viji");
		  
		  driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Lakshmi");
		  
//driver.findElementById("createLeadForm_personalTitle  ").sendKeys(
		  //"Misskavitha"); //salutations
		  
		  driver.findElementByName("personalTitle").sendKeys("Miss");//salutations
		  
		  WebElement source =driver.findElementById("createLeadForm_dataSourceId");
		  //selecting source from drop down
		  
		  Select sel=new Select(source);
		  
		  sel.selectByVisibleText("Employee");
		  
		  //sel.selectByValue("LEAD_OTHER");
		 		
		driver.findElementByName("generalProfTitle").sendKeys("testing");//entering title
		
		driver.findElementByName("annualRevenue").sendKeys("2000000");//annual revenue
		
		WebElement industry=driver.findElementById("createLeadForm_industryEnumId");// select industry
		
		Select sel1=new Select(industry);
		
		sel1.selectByIndex(3);
		
		
	WebElement ownership=	driver.findElementById("createLeadForm_ownershipEnumId");
		
		Select sel2=new Select(ownership);
		
		sel2.selectByIndex(4);
		
		driver.findElementById("createLeadForm_sicCode").sendKeys("600100");
		
		driver.findElementById("createLeadForm_description").sendKeys("selenium Testing lead ");
		
		driver.findElementById("createLeadForm_importantNote").sendKeys("Testing is important ");
		
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("641038");
		
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("64100894");
		
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("0422-23450456");
		
		driver.findElementById("createLeadForm_departmentName").sendKeys("Testing automation");
		
		WebElement currency=driver.findElementById("createLeadForm_currencyUomId");
		
		Select sel3=new Select(currency);
		
		sel3.selectByVisibleText("USD - American Dollar");
		
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("2");
		
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("dollar");
		
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Reception team");

		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/crmsfa/control/main");

		driver.findElementById("createLeadForm_generalAddress1").sendKeys("Coimbatore NRG st");

		driver.findElementById("createLeadForm_generalAddress2").sendKeys("Perunbakkam");

		driver.findElementById("createLeadForm_generalCity").sendKeys("Coimbatore");

	WebElement state=driver.findElementById("createLeadForm_generalStateProvinceGeoId");

	 Select sel4=new Select(state);
	 
	 sel4.selectByVisibleText("Texas");
	 
	WebElement country= driver.findElementById("createLeadForm_generalCountryGeoId");
		
	Select sel5=new Select(country);
	
	sel5.selectByVisibleText("United Kingdom");
	
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("641038");
		
	driver.findElementById("createLeadForm_generalPostalCode").sendKeys("60000");
	
		
	WebElement marketcampain=driver.findElementById("createLeadForm_marketingCampaignId");
	
	Select sel6= new Select(marketcampain);
	
	sel6.selectByVisibleText("Catalog Generating Marketing Campaigns");
	
	driver.findElementById("createLeadForm_primaryEmail").sendKeys("lakshmiviji10192@gmail.com");
	
	//driver.findElementById("").sendKeys("");// to add phone number
	
	driver.findElementByName("submitButton").click();

	//driver.findElementById("createLeadForm_firstName").isEnabled();// verify first name
	
		
		

	}

}
