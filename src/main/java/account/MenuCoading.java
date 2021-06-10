package account;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MenuCoading {
    @FindBy(xpath = "//*[@id='z1-pullMenu-open']")
    WebElement menu;
    @FindBy(xpath = "//*[@id='tab-desktop-menu']/li[1]/a/span[2]/i")
    WebElement discount;
    @FindBy(xpath = "//*[@id='tab-desktop-menu']/li[1]/ul/li[9]/a/span")
    WebElement firstResponder;
    @FindBy(xpath = "//*[@id='HERO_PANEL1']/div/div[2]/div/div/span/a")
    WebElement firstGetStarted;
    @FindBy(xpath = "//a[@aria-label='Get started']")
    WebElement getStart;
    @FindBy(linkText = "Select")
    WebElement workType;
    //    @FindBy(xpath = "//button[@id='what-kind-of-work-do-you-do']")
//    WebElement workTitle;
//    @FindBy(xpath = "//div[@id='SIG_ENROLL_FORM1']/div[3]/div/div[1]/div[2]/div/div/div/div/button[2]")
//    WebElement emt;
    @FindBy(css = "[data-testid='jobfunction']")
    WebElement ccc;
    @FindBy(xpath = "//button[@aria-label='EMT/Paramedic']")
    WebElement emt;

    public void setMenu() {
        menu.click();
    }

    public void clickDiscount() {
        discount.click();
    }

    public void clickFirstResponder() {
        firstResponder.click();
    }

    public void clickFirstGetStarted() {
        firstGetStarted.click();
    }

    public void getStarted() {
        getStart.click();
    }

    public void bbb() {
        ccc.click();
    }
//    public void paramedic(){
//        emt.click();
//    }
    public void selectParamedic(){
        Select jobType = new Select(emt);
        jobType.selectByIndex(3);
    }
}


   /* //click month drop down
    @FindBy(css = "[id='mmV']")
    WebElement MonthDD;

    public void clickMonthDD(){
        MonthDD.click();
    }

    public void selectMonth(){

        Select month = new Select(MonthDD);
        month.selectByValue("4");*/