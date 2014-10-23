package pages;

import base.PageBase;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static helpers.Locators.get;

public class HomePage extends PageBase {

    private static final By APP_ASSIGN = get("HomePage.AppAssign");
    private static final By HEADER_MENU_ICON = get("HomePage.HeaderMenuIcon");
    private static final By ASSIGN_MENU_ICON = get("HomePage.MenuAssignIcon");
    private static final String TITLE = "ShowEvidence";


    public static void goToAssignmentPage() { //http://qa-trunk.showevidence.net/assign/view-classes/
        $(APP_ASSIGN).click();
    }

    public static void openMenu() {
        $(HEADER_MENU_ICON).click();
    }

    public static void goToAssignmentPageMenu() { //http://qa-trunk.showevidence.net/assign/view-classes/
        $(ASSIGN_MENU_ICON).click();
    }

    public static void checkExpectedElements() {
        // checkExpectedElements(Arrays.asList(APP_ASSIGN,HEADER_MENU_ICON));
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
    }


}
