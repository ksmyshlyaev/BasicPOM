import helper.*;
import org.testng.annotations.Test;
import pages.*;

public class TestClass extends EnvironmentSetup {

        @Test
        public void firstTest(){
            MainPage mainPage = new MainPage(driver);
            mainPage.goToUrl();
            mainPage.openLoginWindow();
        }
}
