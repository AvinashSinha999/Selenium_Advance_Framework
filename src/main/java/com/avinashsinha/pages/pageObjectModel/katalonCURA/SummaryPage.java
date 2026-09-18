package com.avinashsinha.pages.pageObjectModel.katalonCURA;

import com.avinashsinha.base.CommonToAllPage;
import com.avinashsinha.utils.PropertiesReader;
import com.avinashsinha.utils.WaitHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This is Page Class
public class SummaryPage extends CommonToAllPage {

    private static final Logger LOGGER = LogManager.getLogger(SummaryPage.class);

    WebDriver driver;

    public SummaryPage(WebDriver driver) {
        this.driver = driver;
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    private static final By CONFIRMATION_TEXT = By.xpath("//h2[normalize-space()='Appointment Confirmation']");
    private static final By COMMENT_TEXT = By.xpath("//p[@id='comment']");
    private static final By SIDE_BAR = By.xpath("//i[@class='fa fa-bars']");
    private static final By LOGOUT = By.linkText("Logout");

    //Step 2 : These are Page Actions i.e. Kind of Behaviors or Instance Methods or Member Methods
    public boolean checkAllDetailsOnSummaryPage() {

        WaitHelpers.urlContains(driver, PropertiesReader.readKey("katalon_summaryURL"));

        boolean isConfirmationPresent = WaitHelpers.isElementPresent(driver, CONFIRMATION_TEXT);
        String actualComment = getText(COMMENT_TEXT);
        boolean isCommentMatching = actualComment.equals(PropertiesReader.readKey("katalon_comment"));

        boolean isSummaryValid = isConfirmationPresent && isCommentMatching;

        if (isSummaryValid) {
            LOGGER.info("Summary Page verified. Confirmation shown and comment matches.");
        } else {
            LOGGER.error("Summary Page Failed: confirmationPresent={}, commentMatches={} (expected '{}', actual '{}')",
                    isConfirmationPresent, isCommentMatching, PropertiesReader.readKey("katalon_comment"), actualComment);
        }

        return isSummaryValid;

    }

    public void logout() {

        clickElement(SIDE_BAR);
        clickElement(LOGOUT);

        WaitHelpers.urlContains(driver, PropertiesReader.readKey("katalon_makeAppointmentURL"));
        LOGGER.info("Logged out successfully, returned to Make Appointment page.");

    }
}