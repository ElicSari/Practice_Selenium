package GoogleEmail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email {
    public static void main(String[] args) throws InterruptedException {

      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();

     driver.get("https://www.google.com");
     driver.findElement(By.className("gb_d")).click();

     Thread.sleep(3000);
     driver.findElement(By.xpath("//a[@data-action='sign in']")).click();



      //  driver.quit();
    }
}
