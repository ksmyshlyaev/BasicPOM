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
    }
}
