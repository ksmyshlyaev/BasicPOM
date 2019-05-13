package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.Assert.fail;

public class BasePage {
    protected WebDriver driver;
    private WebDriverWait wait;

    //constructor
    public BasePage (WebDriver basePageLocalDriver){
        this.driver = basePageLocalDriver;
    }

    protected void waitVisibilityOfElement(By elementBy) {
        wait = new WebDriverWait(driver,15);
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
        }
        catch (ElementNotVisibleException e){
            fail(e.toString());
        }
    }

    //Click Method
    protected void clickOnElement(By elementBy) {
        waitVisibilityOfElement(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    protected void writeText(By elementBy, String text) {
        waitVisibilityOfElement(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    protected String readText (By elementBy) {
        waitVisibilityOfElement(elementBy);
        return driver.findElement(elementBy).getText();
    }
}
