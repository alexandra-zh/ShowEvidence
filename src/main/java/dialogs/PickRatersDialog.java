package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class PickRatersDialog {
    private static final By WINDOW = get("PickRatersDialog.Window");
    private static final By ASSIGN = get("PickRatersDialog.Assign");


    public static void clickAssignButton() {
        $(ASSIGN).click();
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }

}
