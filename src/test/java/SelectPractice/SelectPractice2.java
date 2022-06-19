package SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectPractice2 {





      @Test
    public void testDay(){
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();

          driver.get("http://practice.cybertekschool.com/dropdown");
          Select select = new Select(driver.findElement(By.xpath("//select[@id='day']")));
          select.selectByIndex(4);




      }







    }

