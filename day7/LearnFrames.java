package week4.day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LearnFrames {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
        System.out.println(text);
        driver.switchTo().defaultContent();
    }
}