package pages;

import base.PageBase;
import helpers.Creds;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;


public class LoginPage extends PageBase {
    private static final By NAME_FIELD = get("LoginPage.UsernameField");
    private static final By PASS_FIELD = get("LoginPage.PasswordField");
    private static final By PASS_ERROR = get("LoginPage.PasswordError");
    private static final By LOGIN = get("LoginPage.SubmitButton");
    private static final String TITLE = "ShowEvidence - Sign In";


    public static void login(String name, String pass) {
        //   shouldAppear();
        $(NAME_FIELD).val(name);
        $(PASS_FIELD).val(pass);
        $(LOGIN).click();
    }

    public static void login() {
        String[] creds = Creds.get("user");
        login(creds[0], creds[1]);
    }

    //div id="password-error" class="txterror">This is not a valid password. Please try again.</div>


    public static void shouldAppear() {
        shouldAppear(TITLE);
    }
}
