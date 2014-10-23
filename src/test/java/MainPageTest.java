import base.TestBase;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.BrowserPerTest;
import com.codeborne.selenide.testng.ScreenShooter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.LoginPage;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by AlexandraZhuravleva on 9/15/14.
 */
@Listeners({ScreenShooter.class, BrowserPerTest.class})
public class MainPageTest extends TestBase {

    @Override
    @BeforeMethod()
    public void setup() throws MalformedURLException {
        super.setup();
        open(Configuration.baseUrl);
        LoginPage.shouldAppear();

    }
}
