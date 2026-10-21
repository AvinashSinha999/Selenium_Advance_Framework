package com.avinashsinha.tests.pageFactory.appVWO;

import com.avinashsinha.base.CommonToAllTest;
import com.avinashsinha.listeners.RetryAnalyzer;
import com.avinashsinha.listeners.ScreenshotListeners;
import com.avinashsinha.pages.pageFactory.appVWO.LoginPage_PF;
import com.avinashsinha.pages.pageFactory.appVWO.DashboardPage_PF;
import com.avinashsinha.utils.PropertiesReader;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.avinashsinha.driver.DriverManager.getDriver;
import static org.assertj.core.api.Assertions.assertThat;

@Listeners(ScreenshotListeners.class)
@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestAppVWOLoginPage_PF extends CommonToAllTest {

    private static final Logger LOGGER = LogManager.getLogger(TestAppVWOLoginPage_PF.class);

    @Test
    @Description("TC#1 : Verify that with Invalid Username and Password, get error message on the Login Page")
    @Owner("Avinash Sinha")
    public void test_VWOLogin_Negative() {

        LOGGER.info("Starting the Negative TestCases Page Factory");

        //Step 2. Page Class Code (POM Code)
        LoginPage_PF loginPage = new LoginPage_PF(getDriver());
        String errorMsg = loginPage.loginToVWOLoginInvalidCreds();

        LOGGER.info("Finishing the Negative TestCases Page Factory");

        //Step 3. Assertions
        assertThat(errorMsg).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(errorMsg, PropertiesReader.readKey("error_message"));

    }

    @Test
    @Description("TC#2 : Verify that with Valid Username and Password, redirect to the Dashboard Page")
    @Owner("Avinash Sinha")
    public void test_VWOLogin_Positive() {

        LOGGER.info("Starting the Positive TestCases Page Factory");

        //Step 2. Page Class Code (POM Code)
        LoginPage_PF loginPage = new LoginPage_PF(getDriver());
        loginPage.loginToVWOLoginValidCreds();

        DashboardPage_PF dashboardPage = new DashboardPage_PF(getDriver());
        String userNameLoggedIn = dashboardPage.loggedInUserName();

        LOGGER.info("Finishing the Positive TestCases Page Factory");

        //Step 3. Assertions
        assertThat(userNameLoggedIn).isNotBlank().isNotEmpty().isNotNull();
        Assert.assertEquals(userNameLoggedIn, PropertiesReader.readKey("expected_username"));

    }
}