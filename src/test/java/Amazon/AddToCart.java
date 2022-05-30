package Amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Alexa", Keys.ENTER);


        Thread.sleep(3000);

        driver.findElement
                (By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();

        driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
        driver.findElement(By.xpath("(//input[@class='a-button-input'])[59]")).click();
    }

}
