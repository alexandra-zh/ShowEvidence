package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Locators.get;
import static helpers.Waiter.waitForJquery;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class CalendarDialog {

    private static final By WINDOW = get("CalendarDialog.Window");
    private static final By SAVE_BUTTON = get("CalendarDialog.SaveContentButton");
    private static final By FIRST_DAY = get("CalendarDialog.FirstDay");
    private static final By SECOND_DAY = get("CalendarDialog.SecondDay");
    private static final By DAY_PARAM = get("CalendarDialog.DayParam");
    private static By DAY;
    //CalendarDialog.DayParam=xpath=//div[contains(@class, 'se-picker-monthName')][text()='$s']/..//div[contains(@class,'date-picker-day')][text()='$s']


    public static void clickSaveButton() {
        $(SAVE_BUTTON).click();
    }

    public static void setDatesParam(String startDate, String endDate) {
        $(get("CalendarDialog.DayParam", startDate)).click();
        sleep(3000);
        $(get("CalendarDialog.DayParam", endDate)).click();
        sleep(3000);
        clickSaveButton();
        waitForJquery();
    }

    public static void SetDates(String startDate, String endDate) {
        ClickFirstDate();
        ClickSecondDate();
    }

    public static void ClickFirstDate() {
        $(FIRST_DAY).click();
    }

    public static void ClickSecondDate() {
        $(SECOND_DAY).click();
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }


}
