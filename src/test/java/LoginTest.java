/**
 * Created by AlexandraZhuravleva on 9/12/14.
 */

import base.TestBase;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;

@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class LoginTest extends TestBase {

    @Override
    @BeforeMethod()
    public void setup() throws MalformedURLException {
        super.setup();
        open(Configuration.baseUrl);
        LoginPage.shouldAppear();
    }

    @Test(groups = "fast")
    public static void loginTest() {
        LoginPage.login();
        HomePage.shouldAppear();
    }

    @Test (groups = "fast")
    public static void loginNegativePassTest() {
        LoginPage.login("hjkh","jhgg");
        HomePage.shouldAppear();
    }

      @Test (groups = "fast")
      public static void loginNegativeUserTest() {
          LoginPage.login("hjhkh","hjkhkj");
          HomePage.shouldAppear();
      }


}
