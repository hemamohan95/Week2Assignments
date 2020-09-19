package week2.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateAccount {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("demosalesmanager");
        driver.findElementById("password").sendKeys("crmsfa");
        driver.findElementByClassName("decorativeSubmit").click();
        driver.findElementByLinkText("CRM/SFA").click();
        driver.findElementByLinkText("Accounts").click();
        driver.findElementByLinkText("Create Account").click();
        driver.findElementById("accountName").sendKeys("Debit Limited Account");
        driver.findElementByName("description").sendKeys("Selenium Automation Tester");
        driver.findElementById("groupNameLocal").sendKeys("Local");
        driver.findElementById("officeSiteName").sendKeys("chennai");
        driver.findElementByClassName("inputBox").sendKeys("100000");
        WebElement industry = driver.findElementByName("industryEnumId");
        Select dropDown = new Select(industry);
        dropDown.selectByVisibleText("Computer Software");
        WebElement ownership = driver.findElementByName("ownershipEnumId");
        Select dropDown1 = new Select(ownership);
        dropDown1.selectByVisibleText("S-Corporation");
        WebElement source = driver.findElementByName("dataSourceId");
        Select dropDown2 = new Select(source);
        dropDown2.selectByValue("LEAD_EMPLOYEE");
        WebElement market= driver.findElementById("marketingCampaignId");
        Select dropDown3 = new Select(market);
        dropDown3.selectByIndex(6);
        WebElement state = driver.findElementById("generalStateProvinceGeoId");
        Select dropDown4 = new Select(state);
        dropDown4.selectByValue("TX");
        driver.findElementByClassName("smallSubmit").click();
        
        
        
		

	}

}
