package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */

public class PickPerformanceDialog {
    private static final By WINDOW = get("PickPerformanceDialog.Window");

    private static final By PICK_RATERS_BUTTON = get("PickPerformanceDialog.PickRaters");
    private static final By MIKE_ROSS_CHECKBOX = get("PickPerformanceDialog.MikeRossPerformer");
    private static final By MIKE_ROSS_LABEL = get("PickPerformanceDialog.MikeRossLabel");
    private static final By SELECT_ALL_STUDENTS = get("PickPerformanceDialog.SelectAllStudents");
    private static final By CLEAR_ALL_STUDENTS = get("PickPerformanceDialog.ClearAllStudents");
    private static final By RATER_LABEL_PARAM = get("PickPerformanceDialog.MikeRossLabelParam");

    public static void checkMikeRoss() {
        $(MIKE_ROSS_LABEL).hover();
        $(MIKE_ROSS_LABEL).click();
        sleep(5000);
    }

    public static void checkPerformerParam(String performerName) {
        $(get("PickPerformanceDialog.MikeRossLabelParam", performerName)).hover();
        $(get("PickPerformanceDialog.MikeRossLabelParam", performerName)).click();
        sleep(5000);
    }

    public static void clickPickRatersButton() {
        $(PICK_RATERS_BUTTON).click();
    }

    public static void clickSelectAllStudents() {
        $(SELECT_ALL_STUDENTS).click();
    }

    public static void clickClearSelectedStudents() {
        $(CLEAR_ALL_STUDENTS).click();
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }
}
