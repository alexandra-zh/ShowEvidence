package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/25/14.
 */
public class LoginErrorDialog {
    private static final By WINDOW = get("LoginErrorDialog.Window");
    private static final By LOGIN_ERROR = get("LoginErrorDialog.LoginErrorText");


        /*
<div class="popup-modal error-dialog" style="z-index: 10010;">
<div class="popup error-popup">
<h1>Error</h1>
<form action="">
<div class="popup-box">
<div class="txt">Login name or password is not valid</div>
</div>
<div class="btn-line">
<input class="btn-blue dialog-ok" type="button" value="OK">
</div>
</form>
     */


    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 30000);
    }


}
