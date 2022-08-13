package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        //Login
        WebElement elementUserName = driver.findElement(By.id("username"));
        elementUserName.sendKeys("Demosalesmanager");
        WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
        elementPassword.sendKeys("crmsfa");
        WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
        elementLogin.click();
        WebElement elementLoginConfirmation = driver.findElement(By.tagName("h2"));
        String textDisplayed = elementLoginConfirmation.getText();
        System.out.println(textDisplayed);
        //Move to next page and tab with links
        WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
        elementCRMSFA.click();
        WebElement elementLeads = driver.findElement(By.linkText("Leads"));
        elementLeads.click();
        WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
        elementCreateLead.click();
        //Dropdowns
        WebElement elementCompany = driver.findElement(By.id("createLeadForm_companyName"));
        elementCompany.sendKeys("HCL");
        WebElement elementFname = driver.findElement(By.id("createLeadForm_firstName"));
        elementFname.sendKeys("Stellah");
        WebElement elementLname = driver.findElement(By.id("createLeadForm_lastName"));
        elementLname.sendKeys("J");
        WebElement elementFnamelocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
        elementFnamelocal.sendKeys("Stellah06");
        WebElement elementDept = driver.findElement(By.name("departmentName"));
        elementDept.sendKeys("IT");
        WebElement elementDesc = driver.findElement(By.name("description"));
        elementDesc.sendKeys("Functional Testing manual and automation");
        WebElement elementMail = driver.findElement(By.id("createLeadForm_primaryEmail"));
        elementMail.sendKeys("stellah.j6988@gmail.com");
        WebElement elementState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dd1 = new Select(elementState);
        dd1.selectByValue("TX");
        WebElement elementCreate = driver.findElement(By.name("submitButton"));
        elementCreate.click();
        String title=driver.getTitle();
        if(title.contains("Lead")) {
           // System.out.println(title);
            System.out.println("Lead created");
        }else
            System.out.println("Lead not created");
        WebElement elementDuplicate=driver.findElement(By.linkText("Duplicate Lead"));
        elementDuplicate.click();
        Thread.sleep(3000);
        WebElement elementCompany1 = driver.findElement(By.id("createLeadForm_companyName"));
        elementCompany1.clear();
        elementCompany1.sendKeys("CTS");
        WebElement elementFname1 = driver.findElement(By.id("createLeadForm_firstName"));
        elementFname1.clear();
        elementFname1.sendKeys("Richelle");
        driver.findElement(By.name("submitButton")).click();
        String title1=driver.getTitle();
        System.out.println(title1);
       // driver.close();
    }
}