package week2.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBasic2 {
    public static void main(String[] args)  {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        //Login
        WebElement elementUserName= driver.findElement(By.id("username"));
        elementUserName.sendKeys("Demosalesmanager");
        WebElement elementPassword=driver.findElement(By.name("PASSWORD"));
        elementPassword.sendKeys("crmsfa");
        WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
        elementLogin.click();
        WebElement elementLoginConfirmation=driver.findElement(By.tagName("h2"));
        String textDisplayed=elementLoginConfirmation.getText();
        System.out.println(textDisplayed);
        //Move to next page and tab with links
        WebElement elementCRMSFA=driver.findElement(By.linkText("CRM/SFA"));
        elementCRMSFA.click();
        WebElement elementLeads=driver.findElement(By.linkText("Leads"));
        elementLeads.click();
        WebElement elementCreateLead=driver.findElement(By.linkText("Create Lead"));
        elementCreateLead.click();
        //Dropdowns
        WebElement elementCompany=driver.findElement(By.id("createLeadForm_companyName"));
        elementCompany.sendKeys("HCL");
        WebElement elementFname=driver.findElement(By.id("createLeadForm_firstName"));
        elementFname.sendKeys("Stellah");
        WebElement elementLname=driver.findElement(By.id("createLeadForm_lastName"));
        elementLname.sendKeys("J");
        WebElement elementSource=driver.findElement(By.id("createLeadForm_dataSourceId"));
        elementSource.sendKeys("Existing Customer");
        WebElement elementMarketingCampaign=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        Select dd1=new Select(elementMarketingCampaign);
        dd1.selectByIndex(6);
        WebElement elementIndustry=driver.findElement(By.id("createLeadForm_industryEnumId"));
        Select dd2=new Select(elementIndustry);
        dd2.selectByValue("IND_SOFTWARE");
        WebElement elementOwnership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        Select dd3=new Select(elementOwnership);
        dd3.selectByVisibleText("Sole Proprietorship");
        WebElement elementCreate=driver.findElement(By.name("submitButton"));
        elementCreate.click();
    }
}
