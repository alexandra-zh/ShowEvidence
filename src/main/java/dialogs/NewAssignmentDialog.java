package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class NewAssignmentDialog {
    private static final By WINDOW = get("NewAssignmentDialog.Window");

    private static final By ASSIGNMENT_NAME_TEXTBOX = get("NewAssignmentDialog.AssignmentName");
    private static final By CHOOSE_CONTENT_BUTTON = get("NewAssignmentDialog.ChooseContentButton");
    private static final By SET_DATES_BUTTON = get("NewAssignmentDialog.SetDates");


    public static void setAssignmentName(String assignmentName) {
        sleep(6000);
        $(ASSIGNMENT_NAME_TEXTBOX).val(assignmentName);
        sleep(3000);
    }

    public static void clickChooseContentButton() {
        $(CHOOSE_CONTENT_BUTTON).click();
    }

    public static void clickSetDatesButton() {
        $(SET_DATES_BUTTON).click();
    }

    public static void ClickFinishLaterButton() {
       //TODO:add description
    }

    public static void ClickCancelButton() {
        //TODO:add description
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 30000);
    }
}
