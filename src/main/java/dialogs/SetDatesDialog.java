package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class SetDatesDialog {
    private static final By WINDOW = get("SetDatesDialog.Window");

    private static final By PICK_PERFORMERS_BUTTON = get("SetDatesDialog.PickPerformers");
    private static final By OVERALL_SCHEDULE_DAY = get("SetDatesDialog.OverallScheduleDay");
    private static final By CHOOSE_SCORING_GUIDE = get("SetDatesDialog.ChooseScoringGuide");


    public static void clickOverallScheduleDay() {
        $(OVERALL_SCHEDULE_DAY).click();
    }

    public static void clickPickPerformersButton() {
        $(PICK_PERFORMERS_BUTTON).click();
    }

    public static void clickChooseScoringGuideButton() {
        $(CHOOSE_SCORING_GUIDE).click();
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }
}
