package week4.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Snapdeal {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //open URL, maximize and add implicit wait
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //Hover on Men's fashion
        Actions builder = new Actions(driver);
        WebElement mensFashion = driver.findElement(By.xpath("//span[contains(text(),'Men')]"));
        builder.moveToElement(mensFashion).perform();
        //Click on Sports Shoes
        driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
        //To get the count of sports shoes
        String count = driver.findElement(By.xpath("//div[@class='child-cat-name selected']/following-sibling::div")).getText();
        System.out.println(" Count of Sport's shoes are " + count);
        //Click on Training shoes
        driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
        System.out.println("Training shoes clicked");
        //Click on Sort by
        driver.findElement(By.xpath("//div[contains(text(),'Popularity')]")).click();
        System.out.println("Popularity clicked");
        //Click on Price Low to High
        driver.findElement(By.xpath("//ul[@class='sort-value']//li[2]")).click();
        System.out.println("Sort clicked");
        List<WebElement> priceList = driver.findElements(By.xpath("//span[contains(@id,'display-price')]"));
        List<String> textPrice = new ArrayList<String>();
        for (WebElement eachElement : priceList) {
            String eachText = eachElement.getText();
            //System.out.println(eachText);
            textPrice.add(eachText);
            String replaceAll = eachText.replaceAll("\\D", "");
            int parseInt = Integer.parseInt(replaceAll);
            System.out.println(parseInt);
        }

        //From value
        WebElement from = driver.findElement(By.name("fromVal"));
        from.clear();
        from.sendKeys("500");

        //To value
        WebElement to = driver.findElement(By.name("toVal"));
        to.clear();
        to.sendKeys("1200");
        //Click Go
        driver.findElement(By.xpath("//div[contains(@class,'price-go-arrow')]")).click();

        //Color
        driver.findElement(By.xpath("//input[@id='Color_s-Navy']/following-sibling::label")).click();

        //Verify Filters
        String price = driver.findElement(By.xpath("//div[@class='navFiltersPill']//a")).getText();
        System.out.println("Price range chosen: " + price);
        WebElement colour = driver.findElement(By.xpath("//input[@id='Color_s-Navy']/following-sibling::label/a"));
        System.out.println("Color chosen: " + colour.getText());

        //Hover on first result
        WebElement firstItem = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
        builder.moveToElement(firstItem).perform();
        //Click quick view
        driver.findElement(By.xpath("//div[@class='clearfix row-disc']//div")).click();
        Thread.sleep(2000);

        //First item price
        WebElement firstItemPrice = driver.findElement(By.xpath("//div[@class='lfloat']/div[2]/span"));
        String firstItemPrice1 = firstItemPrice.getText();
        System.out.println("First Item's Price: Rs " + firstItemPrice1);

        //First item Discount
        WebElement firstItemDiscount = driver.findElement(By.xpath("//div[@class='lfloat']/div[2]/span[2]"));
        String firstItemDiscount1 = firstItemDiscount.getText();
        System.out.println("First Item's Discount: " + firstItemDiscount1);

        //Snapshot of Shoe
        File source = driver.getScreenshotAs(OutputType.FILE);
        File dest = new File("./snaps/Shoe1.png");
        FileUtils.copyFile(source, dest);
        //Second image
        WebElement imgShoe = driver.findElement(By.className("cloudzoom"));
        File source1 = imgShoe.getScreenshotAs(OutputType.FILE);
        File dest1 = new File("./snaps/Shoe2.png");
        FileUtils.copyFile(source1, dest1);

        //Close pop  up window
        driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();

        //close driver
        driver.quit();

    }
}
