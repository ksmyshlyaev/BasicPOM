package pages;

import helper.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);

    }

    public void goToUrl(){
        String url = "https://www.reddit.com/";
        driver.get(url);
    }

    public void openLoginWindow(){

        clickOnElement(By.xpath(Locators.logInButtonXPath));
        driver.switchTo().frame(driver.findElement(By.cssSelector(Locators.loginFrameCssSelector)));

    }

    public void loginWithCredentials(String username, String password){
        driver.findElement(By.id(Locators.loginFrameUsernameFieldId)).sendKeys(username);
        driver.findElement(By.id(Locators.loginFramePasswordFieldId)).sendKeys(password);
        driver.findElement(By.xpath(Locators.loginFrameSubmitButtonXPath)).click();
    }

    public String getErrorMessageFromLoginFrame(){
        waitVisibilityOfElement(By.xpath(Locators.loginFrameErrorMessageXPath));
        return driver.findElement(By.xpath(Locators.loginFrameErrorMessageXPath)).getText();
    }
}

