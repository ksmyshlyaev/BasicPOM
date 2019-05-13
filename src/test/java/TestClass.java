import helper.*;
import org.testng.annotations.Test;
import pages.*;

import static org.testng.Assert.assertEquals;

public class TestClass extends EnvironmentSetup {

        @Test
        public void firstTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.goToUrl();
            mainPage.openLoginWindow();
            mainPage.loginWithCredentials("asdasasdasd", "asdasdasdasddasd");
            assertEquals(mainPage.getErrorMessageFromLoginFrame(), "Incorrect password");
        }
}
