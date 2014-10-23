package helpers;

import com.codeborne.selenide.SelenideElement;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.selected;
import static com.codeborne.selenide.Selenide.$;

public class Actions {
//    Sample code
//    private static final By POPUP = get("Popup");
//    private static final By PROFILE_BUTTON = get("Header.ProfileButton");
//    private static final By PROFILE_WINDOW = get("Header.ProfileWindow");
//    private static final By LOGOUT = get("Header.ProfileLogoutButton");
//
//    public static void handlePopup(String buttonText){
//        $(POPUP).$(byText(buttonText)).click();
//    }
//
//    public static void checkExpectedElements(List<By> expectedElements) {
//        for (By elem : expectedElements) {
//            $(elem).shouldBe(visible);
//        }
//    }
//
//    public static void logout() {
//        $(PROFILE_BUTTON).click();
//        $(PROFILE_WINDOW).waitUntil(appears, 3000);
//        $(LOGOUT).click();
//    }



    public static void check(SelenideElement elem){
        if(!$(elem).isSelected()){
            $(elem).click();
        }
        $(elem).shouldBe(selected);
    }

    public static void uncheck(SelenideElement elem){
        if($(elem).isSelected()){
            $(elem).click();
        }
        $(elem).shouldNotBe(selected);
    }



    public static void login(){
        LoginPage.login();
    }

}
