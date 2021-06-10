package account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInAccount {
    @FindBy(xpath = "//*[@id='z1-profile-open']/i[2]")
    WebElement signInAccount;
    public void setSignInAccount(){
        signInAccount.click();
    }

    @FindBy(xpath = "//*[@id='profile-unauth']/div[2]/ul/li[1]/a/span")
    WebElement clickSignIn;
    public void signIn(){
        clickSignIn.click();
    }

    @FindBy(css="input[id='userID']")
    WebElement userId;
    public void iD(){
        userId.sendKeys("alimur@yahoo.com");
    }
    @FindBy(xpath = "//input[@id='password']")
    WebElement userPass;
    public void pass(){
        userPass.sendKeys("Rony1253");
    }
    @FindBy(xpath = "//*[@id=\"login\"]/div[5]/label/div")
    WebElement unclick;
    @FindBy(xpath ="//*[@id='signin']")
    WebElement signText;
    @FindBy(xpath = "//*[@id='errorDescArea']")
    WebElement signWrongText;
    public void mute(){
        unclick.click();
    }

    public void sign(){
        signText.click();
    }
    public String signWrongMassage(){
        String text=signWrongText.getText();
        return text;
    }
}
