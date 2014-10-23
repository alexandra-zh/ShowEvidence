package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {
    private static final String URL = "http://qa-trunk.showevidence.net/";

    @BeforeMethod()
    public void setup() throws MalformedURLException {
        Configuration.baseUrl = URL;
        Configuration.timeout = 10000;
        open(Configuration.baseUrl);
    }
}
