package week2.day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTable {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://erail.in/");
        driver.manage().window().maximize();
        WebElement from=driver.findElement(By.xpath("//input[contains(@title,'SOURCE station code')]"));
        from.clear();
        from.sendKeys("MS", Keys.TAB);
        WebElement to=driver.findElement(By.xpath("//input[contains(@title,'Enter DESTINATION station')]"));
        to.clear();
        to.sendKeys("PDY",Keys.TAB);
        WebElement sortDate= driver.findElement(By.xpath("//label[contains(text(),'Sort on Date')]"));
        sortDate.click();
        System.out.println("hi");
        List<WebElement> elementrows= driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
        List<WebElement> elementcols=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[1]/td"));

        for(int i=1;i<=elementrows.size();i++){

            for (int j=1;j<=9;j++){
                String text=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td["+j+"]")).getText();
                System.out.print(text+"     ");
            }
            System.out.println();
        }
    }
}
