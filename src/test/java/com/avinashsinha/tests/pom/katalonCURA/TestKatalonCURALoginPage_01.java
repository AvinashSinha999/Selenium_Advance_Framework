package com.avinashsinha.tests.pom.katalonCURA;

import com.avinashsinha.base.CommonToAllTest;
import com.avinashsinha.listeners.RetryAnalyzer;
import com.avinashsinha.listeners.ScreenshotListeners;
import com.avinashsinha.pages.pageObjectModel.katalonCURA.BookingPage;
import com.avinashsinha.pages.pageObjectModel.katalonCURA.LoginPage;
import com.avinashsinha.pages.pageObjectModel.katalonCURA.MakeAppointmentPage;
import com.avinashsinha.pages.pageObjectModel.katalonCURA.SummaryPage;
import com.avinashsinha.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.avinashsinha.driver.DriverManager.getDriver;

@Listeners(ScreenshotListeners.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestKatalonCURALoginPage_01 extends CommonToAllTest {

    private static final Logger LOGGER = LogManager.getLogger(TestKatalonCURALoginPage_01.class);

    @Test
    @Description("TC#1 : Verify that Booking the Appointment and redirect to the Summary Page")
    @Owner("Avinash Sinha")
    public void test_KatalonCURA() {

        LOGGER.info("Starting the TestCases Page Object Model");

        MakeAppointmentPage makeAppointmentKatalonCURA = new MakeAppointmentPage(getDriver());
        makeAppointmentKatalonCURA.clickToMakeAppointmentBtn();

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToKatalonCURACreds(PropertiesReader.readKey("katalon_username"), PropertiesReader.readKey("katalon_password"));

        BookingPage bookingPage = new BookingPage(getDriver());
        bookingPage.fillAllDetailsOnBookingPage();


        SummaryPage summaryPage = new SummaryPage(getDriver());
        boolean isSummaryValid = summaryPage.checkAllDetailsOnSummaryPage();
        Assert.assertTrue(isSummaryValid, "Summary Page details did not match expected booking data.");

        summaryPage.logout();

        LOGGER.info("Finishing the TestCases Page Object Model");


    }

}