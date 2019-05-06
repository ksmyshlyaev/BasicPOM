package helper;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class EnvironmentSetup {
    protected WebDriver driver;
    private ChromeOptions options;
    private JavascriptExecutor js;
    private Actions action;



    @BeforeSuite
    public void setUp() {
        String driverPath = "\\src\\main\\resources\\drivers\\chromedriver.exe";
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", workingDir + driverPath);

        options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

        action = new Actions(driver);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void close(){
        driver.quit();

    }
}

