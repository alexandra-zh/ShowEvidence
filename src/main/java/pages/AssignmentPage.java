package pages;

import base.PageBase;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Locators.get;


/**
 * Created by AlexandraZhuravleva on 9/15/14.
 */
public class AssignmentPage extends PageBase {
    private static final String TITLE = "ShowEvidence";
    private static final By CREATE_ASSIGNMENT = get("AssignmentPage.CreateAssignmentButton");
 //   private static final By ASSIGNMENT_PARAM = get("AssignmentPage.AssignmentParam");
    private static By ASSIGNMENT_PARAM;
    /*
    <div class="lw-media-content sys-content">
    <div class="lw-media-body">
    <h1 class="lw-media-heading ellipsing">
    <span class="pointer sys-default-action-click">test_assignment</span>
    //class="logo"> Assign is visible
*/

 /*   public static void checkExpectedElements () {
        checkExpectedElements(Arrays.asList());
    }
  */
    public static void clickCreateAssignment() {
        sleep(5000);
        $(CREATE_ASSIGNMENT).waitUntil(Condition.visible, 3000);
        $(CREATE_ASSIGNMENT).hover();
        $(CREATE_ASSIGNMENT).click();

    }

    private static By getAssignment(String assignmentName) {
        ASSIGNMENT_PARAM = get("AssignmentPage.AssignmentParam", assignmentName);
        return ASSIGNMENT_PARAM;
    }

    public static void verifyAssignmentPresent(String assignmentName){
        $(getAssignment(assignmentName)).shouldBe(Condition.present);
    }

    public static void shouldAppear() {
        shouldAppear(TITLE);
        sleep(5000);
    }

}
