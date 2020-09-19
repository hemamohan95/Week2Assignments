package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Leads").click();
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys("Volante");
        driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
        driver.findElementById("createLeadForm_lastName").sendKeys("Mohan");
        WebElement source = driver.findElementById("createLeadForm_dataSourceId");
        Select dropDown = new Select(source);
        dropDown.selectByVisibleText("Employee");
        WebElement marketCampaign = driver.findElementById("createLeadForm_marketingCampaignId");
        Select dropDown1 = new Select(marketCampaign);
        dropDown1.selectByValue("9001");
        WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
        Select dropDown2 = new Select(industry);
        dropDown2.selectByIndex(16-1);
        WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
        Select dropDown3 = new Select(ownership);
        dropDown3.selectByIndex(5);
        WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
        Select dropDown4 = new Select(country);
        dropDown4.selectByVisibleText("India");
        driver.findElementByName("submitButton").click();
        String title = driver.getTitle();
		System.out.println("The title of the result page is: "+title);
		Thread.sleep(2000);
		driver.close();
	}

}
