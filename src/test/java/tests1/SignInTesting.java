package tests1;

import account.MenuCoading;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import account.SignInAccount;

public class SignInTesting extends BaseCoading{

    SignInAccount signInAccount;
//    MenuCoading menuCoading;
    @BeforeMethod
    void setupHomePage(){
        setup("chrome");
        driver.get("https://www.att.com");
        signInAccount = PageFactory.initElements(driver, SignInAccount.class);
    }
    @Test
    void signInTest(){
        signInAccount.setSignInAccount();
        signInAccount.signIn();
        signInAccount.iD();
        signInAccount.pass();
        signInAccount.mute();
        signInAccount.sign();
        signInAccount.signWrongMassage();

        String actual= signInAccount.signWrongMassage();
      Assert.assertEquals(actual,"Check your entry and try again. Keep in mind, you’ll have to reset your password after too many unsuccessful sign-in attempts.");
        System.out.println(driver.getTitle());
    }
//    @AfterMethod
//    void close(){
//        driver.quit();
//    }
//    @Test
//    void setMenuCoading(){
//        menuCoading.setMenu();
    }



