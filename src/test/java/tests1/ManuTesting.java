package tests1;

import account.MenuCoading;
import account.SignInAccount;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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
       // menuCoading.selectParamedic();
        actionMethod();
        menuCoading.workPlace();
        menuCoading.myEmail();
        menuCoading.myName();
        menuCoading.myLastName();
        menuCoading.myMonth();
        menuCoading.myDay();
        menuCoading.myYear();
        menuCoading.myWorkeZone();
        scrolldown();
        menuCoading.myState();
        menuCoading.myZipCode();
        menuCoading.checkBoxClick();
        menuCoading.checkEligibility();
        String actual=menuCoading.findTextmassage();
        Assert.assertEquals(actual,"Hmm…we can’t find a match for your birthdate. Be sure you’ve entered the correct information and try again.");
        try {
            screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}