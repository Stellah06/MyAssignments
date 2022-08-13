package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasic1 {
    public static void main(String[] args) {
        /*WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
        driver.close();*/

        WebDriverManager.edgedriver().setup();
        EdgeDriver driver=new EdgeDriver();
        driver.get("http://leaftaps.com/opentaps");
        driver.manage().window().maximize();
       // driver.close();
    }
}
