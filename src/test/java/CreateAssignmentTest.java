import base.TestBase;
import com.codeborne.selenide.Configuration;
import dialogs.*;
import helpers.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AssignmentPage;
import pages.HomePage;
import pages.LoginPage;

import java.net.MalformedURLException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static helpers.Waiter.waitForJquery;

/**
 * Created by AlexandraZhuravleva on 9/19/14.
 */
public class CreateAssignmentTest extends TestBase {

    private static final String ASSIGNMENT_NAME = "test_assignment";
    private static final String CONTENT_MODULE = "Comparing Economic Systems";
    private static final String SCORING_GUIDE = "Elementary Literacy Assessment Rubric";
    private static String StartDate;
    private static String EndDate;
    private static final String PERFORMER = "Mike Ross";
    private static final String RATER = "Me";


    @Override
    @BeforeMethod()
    public void setup() throws MalformedURLException {
        super.setup();
        open(Configuration.baseUrl);
        LoginPage.shouldAppear();
        Actions.login();
        Calendar calendar = new GregorianCalendar();
        StartDate = String.valueOf(calendar.get(Calendar.DATE));
        calendar.add(calendar.DAY_OF_MONTH, 2);
        EndDate = String.valueOf(calendar.get(Calendar.DATE));
    }


    @Test(groups = "fast")
    public static void createAssignmentTest() {
        HomePage.shouldAppear();
        HomePage.openMenu();
        HomePage.goToAssignmentPageMenu();
        //HomePage.goToAssignmentPage();
        AssignmentPage.shouldAppear();
        AssignmentPage.clickCreateAssignment();
        NewAssignmentDialog.shouldAppear();
        //First Screen:
        NewAssignmentDialog.setAssignmentName(ASSIGNMENT_NAME);
        NewAssignmentDialog.clickChooseContentButton();
        ContentModuleDialog.shouldAppear();
        ContentModuleDialog.selectContentModule(CONTENT_MODULE);
        waitForJquery();
        //Set Dates:
        NewAssignmentDialog.clickSetDatesButton();
        SetDatesDialog.shouldAppear();
        SetDatesDialog.clickOverallScheduleDay();
        waitForJquery(); //TODO: Need to update waiters
        CalendarDialog.shouldAppear();
        CalendarDialog.setDatesParam(StartDate, EndDate);
        SetDatesDialog.shouldAppear();
        //Set ScoringGuide:
        SetDatesDialog.clickChooseScoringGuideButton();
        waitForJquery();
        ScoringGuideDialog.shouldAppear();
        ScoringGuideDialog.setScoringGuide(SCORING_GUIDE);
        SetDatesDialog.shouldAppear();
        //Set Performers:
        SetDatesDialog.clickPickPerformersButton();
        PickPerformanceDialog.shouldAppear();
        PickPerformanceDialog.clickClearSelectedStudents();
        // PickPerformanceDialog.checkPerformerParam(PERFORMER); TODO: need to be updated
        sleep(3000);
        PickPerformanceDialog.checkMikeRoss();
        PickPerformanceDialog.clickPickRatersButton();
        waitForJquery();
        //Set Raters:
        PickRatersDialog.shouldAppear();
        PickRatersDialog.clickAssignButton();
        AssignmentPage.shouldAppear();
        AssignmentPage.verifyAssignmentPresent(ASSIGNMENT_NAME);
    }
}
