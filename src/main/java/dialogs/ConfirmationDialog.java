package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class ConfirmationDialog {

    private static final By WINDOW = get("ConfirmationDialog.Window");

    private static final By OK_BUTTON = get("ConfirmationDialog.OkButton");//xpath=.//*[text()='Save']
    // <button data-title="OK" class="btn-blue confirm-dialog-ok dialog-ok" type="button">OK</button>


    public static void confirm() {
        $(OK_BUTTON).click();
    }

    /*
        public static void cancel() {
            $(CANCEL_BUTTON).click();
        }
    */
    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }


}
