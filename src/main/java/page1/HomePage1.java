package page1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage1 {
    @FindBy(xpath = "//*[@id='z1-profile-open']/i[2]")
    WebElement signInAccount;
    @FindBy(xpath = "//*[@id='profile-unauth']/div[2]/ul/li[1]/a/span")
    WebElement clickSignIn;

    public void setSignInAccount(){

        signInAccount.click();
        clickSignIn.click();

    }
}
