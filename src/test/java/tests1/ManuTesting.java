package tests1;

import account.MenuCoading;
import account.SignInAccount;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import qReportPakage.IListnerReport;

import java.io.IOException;

public class ManuTesting extends BaseCoading {
    MenuCoading menuCoading;
//    IListnerReport;
    @BeforeMethod
    void setMenuCoading() throws InterruptedException {
        setup("chrome");
        driver.get("https://www.att.com");
        menuCoading = PageFactory.initElements(driver, MenuCoading.class);

    }
    @Test
    void menuTesting() throws InterruptedException {
        menuCoading.setMenu();
        menuCoading.clickDiscount();
        menuCoading.clickFirstResponder();
        menuCoading.getStarted();

       scrolldown();
       implicitWait(5);
        menuCoading.bbb();
        implicitWait(5);
        menuCoading.selectParamedic();
        try {
            screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}