package week4.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AssignmentWindows {
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        //open URL, maximize and add implicit wait
        driver.get("https://login.salesforce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        // enter login details
        driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
        driver.findElement(By.id("password")).sendKeys("Password#123");
        driver.findElement(By.name("Login")).click();
        System.out.println(driver.getTitle());
        //Click on learn more
        driver.findElement(By.xpath("//*[@title='Learn More']")).click();
        //Switching to new window
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handles=new ArrayList<>(windowHandles);
        driver.switchTo().window(handles.get(1));
        //Click confirm in new page
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        System.out.println(driver.getTitle());
        //Switch to parent window
        driver.switchTo().window(handles.get(0));
        System.out.println(driver.getTitle());
    }
}
