package week4.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/");
        //Alert confirm dialog
        driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
        driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        //Alert Prompt dialog
        driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following::span")).click();
        Alert alert1 = driver.switchTo().alert();
        System.out.println(alert1.getText());
        alert1.sendKeys("Stellah");
        alert1.accept();
        String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
        System.out.println(text);
        // sweet modal dialog
        driver.findElement(By.xpath("//h5[text()='Sweet Modal Dialog']/following::span")).click();
        String text2 = driver.findElement(By.xpath("//p[contains(text(),'Unless you close this')]")).getText();
        System.out.println(text2);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following::a")).click();
    }
}