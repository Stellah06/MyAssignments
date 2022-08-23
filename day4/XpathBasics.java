package week2.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBasics {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        WebElement elementUserName = driver.findElement(By.xpath("//input[@name='USERNAME']"));
        elementUserName.sendKeys("Demosalesmanager");
        WebElement elementPassword = driver.findElement(By.xpath("//input[@name='PASSWORD']"));
        elementPassword.sendKeys("crmsfa");
        WebElement elementLogin = driver.findElement(By.xpath("//input[contains(@class,'tiveSub')]"));
        elementLogin.click();
        WebElement elementLoginConfirmation = driver.findElement(By.tagName("h2"));
        String textDisplayed = elementLoginConfirmation.getText();
        System.out.println(textDisplayed);
        //Move to next page and tab with links
        WebElement elementCRMSFA = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
        // with xpath with href - (//a[contains(@href,'/crmsfa/')])[1]
        elementCRMSFA.click();
        WebElement elementLeads = driver.findElement(By.xpath("//a[(text()='Leads')]"));
        elementLeads.click();
        WebElement elementCreateLead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
        elementCreateLead.click();

        WebElement elementCompany = driver.findElement(By.xpath("(// ChromeDriver();\n" +
                "        driver.get(\"http://leaftaps.com/opentaps\");\n" +
                "        driver.manage().window().mainput[@name='companyName'])[2]"));
        elementCompany.sendKeys("HCL");
        WebElement elementFname = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
        elementFname.sendKeys("Stellah");
        WebElement elementLname = driver.findElement(By.xpath("((//input[@name='lastName'])[3])"));
        elementLname.sendKeys("J");
        WebElement elementCreate=driver.findElement(By.xpath("//input[@name='submitButton']"));
        elementCreate.click();
    }
}