package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class ScoringGuideDialog {
    private static final By WINDOW = get("ScoringGuideDialog.Window");

    private static final By SAVE_BUTTON = get("ScoringGuideDialog.SaveButton");//xpath=.//*[text()='Save']
    private static final By CANCEL_BUTTON = get("ScoringGuideDialog.CancelButton");
    private static final By SCORING_GUIDE_ITEM = get("ScoringGuideDialog.ScoringGuideItemParam");
    private static By SCORING_GUIDE_PARAM;
    //ContentModuleDialog.ContentModelItem=xpath=.//*[text()='Calibration Report Test ']


    private static By getScoringGuide(String scoringGuideName) {
        SCORING_GUIDE_PARAM = get("ScoringGuideDialog.ScoringGuideItemParam", scoringGuideName);
        return SCORING_GUIDE_PARAM;
    }

    public static void selectScoringGuide(String scoringGuideName) {
        $(getScoringGuide(scoringGuideName)).click();
        sleep(10000);
    }

    public static void setScoringGuide(String scoringGuideName) {
        selectScoringGuide(scoringGuideName);
        sleep(5000);
        clickSaveButton();
        sleep(5000);
    }

    public static void clickSaveButton() {
        $(SAVE_BUTTON).click();
    }

    public static void clickCancelButton() {
        $(CANCEL_BUTTON).click();
    }

    public static void ClickScoringGuide() {
        sleep(1000);
        $(SCORING_GUIDE_ITEM).hover();
        $(SCORING_GUIDE_ITEM).click();
        sleep(1000);
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }
}
