package week4.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AdministratorCertifications {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //open URL, maximize and add implicit wait
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        // enter login details
        driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Password#123");
        driver.findElement(By.name("Login")).click();
        //Click on learn more
        driver.findElement(By.xpath("//*[@title='Learn More']")).click();
        //Switching to new window
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handles = new ArrayList<>(windowHandles);
        driver.switchTo().window(handles.get(1));
        //Click confirm in new page
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        //Click shadow DOM element
        Shadow dom = new Shadow(driver);
        WebElement learning = dom.findElementByXPath("//span[text()='Learning']");
        learning.click();

        //Click Learning on Trailhead
        WebElement trailHead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
        trailHead.click();

        //Click on Salesforce Certification
        WebElement sfCertification = dom.findElementByXPath(" //a[text()='Salesforce Certification']");
        sfCertification.click();

        //Click on salesforce administrator
        driver.findElement(By.xpath("//*[@class='roleMenu-item_text']")).click();

        //Click on Certification Administrator
        driver.findElement(By.xpath("//a[text()='Administrator']")).click();
        //Get the list of certificates
        List<WebElement> elements = driver.findElements(By.className("credentials-card_title"));
        System.out.println("Certifications Available");
        System.out.println("---------------------------");
        for (WebElement eachElement : elements) {
            System.out.println(eachElement.getText());
        }
        //close windows
        driver.quit();
    }

}

