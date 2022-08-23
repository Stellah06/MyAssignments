package week2.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DeleteLead {

    public static void main(String[] args) throws InterruptedException {
        //Creating driver for Chrome browser
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        //Opening Leaftap
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Login
        WebElement elementUserName = driver.findElement(By.id("username"));
        elementUserName.sendKeys("Demosalesmanager");
        WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
        elementPassword.sendKeys("crmsfa");
        WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
        elementLogin.click();

        //Move to next page and tab with links
        WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
        elementCRMSFA.click();
        WebElement elementLeads = driver.findElement(By.linkText("Leads"));
        elementLeads.click();
        WebElement elementFindLead = driver.findElement(By.linkText("Find Leads"));
        elementFindLead.click();

        //Finding the lead
        driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
        WebElement phArea = driver.findElement(By.name("phoneAreaCode"));
        phArea.sendKeys("12", Keys.TAB);
        WebElement phNumber = driver.findElement(By.name("phoneNumber"));
        phNumber.sendKeys("123456");
        //Click Find Leads
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        WebElement firstLeadID = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr//td[1]"));
        String leadID = firstLeadID.getText();
        System.out.println("Lead Id is " + leadID);

        //Deleting Lead
        driver.findElement(By.linkText(leadID)).click();
        driver.findElement(By.linkText("Delete")).click();
        System.out.println("Lead deleted");

        //validate deletion of lead

        WebElement elementFindLead2 = driver.findElement(By.linkText("Find Leads"));
        elementFindLead2.click();
        WebElement leadId2 = driver.findElement(By.name("id"));
        leadId2.sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(3000);
        String display = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
        //String display=driver.findElement(By.className("x-paging-info")).getText();
        System.out.println(display);

        //Closing the driver/window -- Getting WebSocket Error
        //driver.close();
    }

}
