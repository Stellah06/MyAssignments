package week2.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class EditLead {
    public static void main(String[] args) {
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
        WebElement fname = driver.findElement(By.xpath("(//input[@name='firstName'])[3]"));
        fname.sendKeys("Stellah");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        driver.findElement(By.linkText("Stellah")).click();
        String title = driver.getTitle();
        if (title.contains("View")) {
            System.out.println("In Vew Lead UI");
        } else {
            System.out.println("Wrong UI");
        }
        //Editing company
        driver.findElement(By.linkText("Edit")).click();
        WebElement companyName = driver.findElement(By.name("companyName"));
        companyName.sendKeys("Walmart");
        WebElement updateLead = driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@name='submitButton']"));
        updateLead.click();

        //Check the updated value
        String updatedCompany = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
        System.out.println(updatedCompany);
        if (updatedCompany.contains("Walmart")) {
            System.out.println("Company name updated");
        } else {
            System.out.println("Company name not updated");
        }
        //Closing the driver/window
       // driver.close();
    }
}