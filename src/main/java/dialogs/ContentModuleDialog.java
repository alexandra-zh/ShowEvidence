package dialogs;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Locators.get;

/**
 * Created by AlexandraZhuravleva on 9/16/14.
 */
public class ContentModuleDialog {
    private static final By WINDOW = get("ContentModuleDialog.Window");
    private static final By SAVE_BUTTON = get("ContentModuleDialog.SaveContentButton");
    private static final By CANCEL_BUTTON = get("ContentModuleDialog.CancelContentButton");
    private static By CONTENT_MODULE_ITEM_PARAM;


    private static By getContentModule(String contentModuleName) {
        CONTENT_MODULE_ITEM_PARAM = get("ContentModuleDialog.ContentModuleItemParam", contentModuleName);
        return CONTENT_MODULE_ITEM_PARAM;
    }

    public static void selectContentModule(String contentModuleName) {
        $(getContentModule(contentModuleName)).click();
        sleep(10000);
        clickSaveButton();
    }

    public static void clickSaveButton() {
        $(SAVE_BUTTON).click();
    }

    public static void clickCancelButton() {
        $(CANCEL_BUTTON).click();
    }

    public static void shouldAppear() {
        $(WINDOW).waitUntil(Condition.appears, 3000);
    }
}
