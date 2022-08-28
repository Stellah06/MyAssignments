package week4.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AssignLGWindows {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //open URL, maximize and add implicit wait
        driver.get("https://leafground.com/window.xhtml");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //Click and Confirm new Window Opens
        System.out.println("Current page: " + driver.getTitle());
        //click open
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handler = new ArrayList<>(windowHandles);
        driver.switchTo().window(handler.get(1));
        System.out.println("Current page after switch: " + driver.getTitle());
        //switch back to main page
        driver.switchTo().window(handler.get(0));
        //Find the number of opened tabs
        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        Set<String> windowHandles1 = driver.getWindowHandles();
        List<String> handler1 = new ArrayList<>(windowHandles1);
        int noOfTabs = handler1.size();
        System.out.println("Number of tabs " + noOfTabs);

        //Wait for 2 new tabs to open
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        Thread.sleep(3000);
        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String> handler2 = new ArrayList<>(windowHandles2);
        int noOfTabs1 = handler2.size();
        System.out.println("Number of tabs with delay " + noOfTabs1);

        //Close all windows except Primary
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        Set<String> windowHandles3 = driver.getWindowHandles();
        List<String> handler3 = new ArrayList<>(windowHandles3);
        int noOfTabs3 = handler3.size();
        System.out.println("Number of tabs-Close " + noOfTabs3);
        for (int i = 0; i < handler3.size(); i++) {
            driver.switchTo().window(handler3.get(i));
            driver.close();
        }
        System.out.println("Quit Driver");
        driver.quit();
    }
}
