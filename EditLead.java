package week2.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//div[@id='findLeads']//input[@name='firstName']").sendKeys("Fname");
		driver.findElementByXPath("//div[@id='findLeads']//button").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//div[@id='findLeads']//a[text()='10038']").click();
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[@class='subMenuButton'][text()='Edit']").click();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").clear();
		driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").sendKeys("ABC");
		driver.findElementByXPath("//input[@class='smallSubmit'][@value='Update']").click();
		String CompanyName = "ABC";
		String compName = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		boolean contains = compName.contains(CompanyName);
		if (contains) {
			System.out.println("The company name is updated");
		}
		else {
			System.out.println("The company name is NOT updated");
		}
		
		
		Thread.sleep(2000);
		driver.close();
	}

}
