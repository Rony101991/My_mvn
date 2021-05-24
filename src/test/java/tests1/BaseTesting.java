package tests1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page1.HomePage1;

public class BaseTesting extends BaseCoading{

    HomePage1 homePage1;

    @BeforeMethod
    void setupHomePage(){
        setup();
        driver.get("https://www.att.com");
        homePage1= PageFactory.initElements(driver,HomePage1.class);
    }

    @Test
    void signInTest(){
        homePage1.setSignInAccount();
    }
}
