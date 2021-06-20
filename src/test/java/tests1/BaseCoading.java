package tests1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseCoading {
    WebDriver driver;

    void setup(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver_win32/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "resources/geckodriver-v0.29.1-win32/geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
    }

    void implicitWait(long wait) {
        driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
    }

    void scrolldown() throws InterruptedException {
        JavascriptExecutor ar = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        ar.executeScript("window.scrollBy(0,400)");
    }

    public void screenshot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(source, new File("./myFailedScreenShot/at&t001"));
    }
    public void actionMethod(){
        Actions actions = new Actions(driver);
        WebElement rightClick = driver.findElement(By.xpath("//button[@aria-label='EMT/Paramedic']"));
        actions.contextClick(rightClick).build().perform();


    }
    @AfterMethod
    void closeBrowser() throws IOException {
        driver.quit();

    }

}
