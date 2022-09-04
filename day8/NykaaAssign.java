package week4.day8;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NykaaAssign {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //open URL, maximize and add implicit wait
        driver.get("https://www.nykaa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        //Hover over on Brand
        WebElement brandName = driver.findElement(By.xpath("//a[text()='brands']"));
        Actions builder = new Actions(driver);
        builder.moveToElement(brandName).perform();
        //Click on Loreal
        driver.findElement(By.xpath("//a[contains(@href,'/brands/loreal-paris')]")).click();
        //Get title of new page
        String newPage = driver.getTitle();
        System.out.println("Page opened " + newPage);
        //sort by Top rated
        //Thread.sleep(2000);
        driver.findElement(By.className("sort-name")).click();
        driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
        System.out.println("Filter on Top rated applied");
        //Selecting Concern
        driver.findElement(By.xpath("//span[text()='Concern']")).click();
        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
        System.out.println("Filter on concern applied");

        //Verify whether shampoo is selected
        WebElement category = driver.findElement(By.xpath("//span[text()='Category']"));
        //Add explicit wait
       /* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(category));
        category.click();*/

        builder.moveToElement(category).click().perform();

        /*JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click()",category);*/

        System.out.println("Category clicked");
        driver.findElement(By.xpath("//span[text()='Hair']")).click();
        System.out.println("Hair clicked");
        driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
        WebElement shampooFilter = driver.findElement(By.xpath("//span[text()='Shampoo']"));
        if (!shampooFilter.isSelected()) {
            System.out.println("Shampoo is not selected");
        } else {
            System.out.println("Shampoo is selected");
        }
        //Select Loreal Shampoo
        driver.findElement(By.xpath("//div[contains(text(),'Paris Colour Protect Shampoo')]")).click();
        //Move to Shampoo UI
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> handlers = new ArrayList<String>(windowHandles);
        driver.switchTo().window(handlers.get(1));
        System.out.println("New UI " + driver.getTitle());
        //Select 175 ml as size
        driver.findElement(By.xpath("//select[@title='SIZE']")).sendKeys("175ml");

        //Print MRP
        String priceShampoo = driver.findElement(By.xpath("//span[text()='MRP:']/following-sibling::span")).getText();
        System.out.println("Price of Shampoo " + priceShampoo);
        //Add item to Bag
        driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
        //Click cart bag
        driver.findElement(By.xpath("//span[@class='cart-count']")).click();
        //Check grand price in bag
        WebElement newFrame = driver.findElement(By.xpath("//*[@class='css-acpm4k']"));
        driver.switchTo().frame(newFrame);
        System.out.println("Frame switched");
        String grandPrice = null;
        if (driver.findElement(By.xpath("//span[text()='Shopping Bag']")).isDisplayed()) {
             grandPrice = driver.findElement(By.xpath("//*[@class='value medium-strong']")).getText();
            System.out.println("Total price is " + grandPrice);
        } else if (driver.findElement(By.xpath("//*[text()='Bag']")).isDisplayed()) {
            System.out.println("Frame name is Bags");
             grandPrice = driver.findElement(By.xpath("//*[contains(@class,'footer-layout css-2vxg6l e25lf6d0')]//span")).getText();
            System.out.println("Total price is " + grandPrice);
        }
        String price=grandPrice.replace("₹","");
        //click proceed
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        //Click continue as guest
        driver.findElement(By.xpath("//button[@class='btn full big']")).click();
        String text = driver.findElement(By.xpath("//div[text()='Grand Total']/following::span")).getText();
        if(price.equals(text)){
            System.out.println("Grand Price is same in both page");
        }else
            System.out.println("Grand Price is different");
        //close all windows
        driver.quit();
    }
}