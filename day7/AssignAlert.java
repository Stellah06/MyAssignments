package week4.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AssignAlert {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //open URL, maximize and add implicit wait
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //login to leaftaps
        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        //Click CRM/SFA
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        //Click on contacts
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        //Click on merger contacts
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        //selecting from contact
        driver.findElement(By.xpath("//img[@alt='Lookup']/parent::a")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handlers=new ArrayList<>(windowHandles);
        driver.switchTo().window(handlers.get(1));
        //click on first contact
        driver.findElement(By.xpath("//div[@class='x-grid3-body']//tr[1]/td//a")).click();
        driver.switchTo().window(handlers.get(0));
        System.out.println(windowHandles);
        //selecting to contact
        driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[2]")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> handlers1=new ArrayList<>(windowHandles1);
        System.out.println(windowHandles1);
        driver.switchTo().window(handlers1.get(1));
        //click on second contact
        driver.findElement(By.xpath("(//div[@class='x-grid3-body']/div)[2]//tr/td//a")).click();
        //Click on Merge
        driver.switchTo().window(handlers1.get(0));
        driver.findElement(By.linkText("Merge")).click();
        //Switch to alert and confirm
        Alert alert = driver.switchTo().alert();
        alert.accept();
        System.out.println("Title of final page: "+driver.getTitle());
    }
}