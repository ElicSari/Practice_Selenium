package SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectPractice3 {

    @Test
     public void selecmounth(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dropdown");

        Select selectMonth = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        selectMonth.selectByIndex(11);


        Select selectYear = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        selectYear.selectByVisibleText("1923");

        Select selectDay = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        selectDay.selectByIndex(0);





    }

}
