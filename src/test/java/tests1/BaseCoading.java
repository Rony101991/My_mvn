package tests1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseCoading {
    WebDriver driver;
    void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
