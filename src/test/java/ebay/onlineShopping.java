package ebay;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilites.WebDriverFactory;

public class onlineShopping {
    WebDriver driver;

    @BeforeMethod
    public  void setUp(){
         driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.ebay.com");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void  verifyTitle(){

        String actualTitle= driver.getTitle();
        String expectedTitle= "eBay";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }
  @Test
    public void verifyOnlineShop() throws InterruptedException {
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='text']"));
        Thread.sleep(1000);
        inputBox.sendKeys("Phone",Keys.ENTER);
Thread.sleep(2000);
        WebElement text= driver.findElement(By.xpath("//span[.='phone']"));
        //String expectedText ="phone";
        Assert.assertTrue(text.isDisplayed());

  }



}
