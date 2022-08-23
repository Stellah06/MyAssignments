package week2.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FacebookRegistration {
    public static void main(String[] args) {
        //Creating driver for Chrome browser
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();

        //Opening Facebook
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Create new account in facebook
        driver.findElement(By.linkText("Create New Account")).click();
        WebElement fname=driver.findElement(By.name("firstname"));
        fname.sendKeys("Stella");
        WebElement lname=driver.findElement(By.xpath("//input[@name='lastname']"));
        lname.sendKeys("J");
        WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("createfacebook@gmail.com");
        WebElement password=driver.findElement(By.xpath("//input[contains(@name,'reg_passwd_')]"));
        password.sendKeys("12345245");

        //Select class for drop down("birthday_day"));

        WebElement day=driver.findElement(By.id("day"));
        Select dd1=new Select(day);
        dd1.selectByIndex(6);

        WebElement month= driver.findElement(By.id("month"));
        Select dd2=new Select(month);
        dd2.selectByValue("9");

        WebElement year= driver.findElement(By.name("birthday_year"));
        Select dd3=new Select(year);
        dd3.selectByVisibleText("1990");

        WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
        gender.click();
        driver.findElement(By.name("websubmit")).click();

    }
}
