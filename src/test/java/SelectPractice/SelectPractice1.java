package SelectPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPractice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dropdown");
        Thread.sleep(3000);
     //   driver.findElement(By.xpath("//a[@id='dropdownMenuLink']")).click();
      //  driver.findElement(By.xpath("(//a[@class = 'dropdown-item'])[1]")).click();

        Select select = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        select.selectByValue("NY");

    }
}