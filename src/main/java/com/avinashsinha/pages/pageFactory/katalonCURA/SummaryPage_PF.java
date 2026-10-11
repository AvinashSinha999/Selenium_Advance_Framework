package com.avinashsinha.pages.pageFactory.katalonCURA;

import com.avinashsinha.base.CommonToAllPage;
import com.avinashsinha.utils.PropertiesReader;
import com.avinashsinha.utils.WaitHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//This is Page Class
public class SummaryPage_PF extends CommonToAllPage {

    private static final Logger LOGGER = LogManager.getLogger(SummaryPage_PF.class);

    WebDriver driver;

    public SummaryPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    @FindBy(xpath = "//p[@id='comment']")
    private WebElement commentText;

    @FindBy(xpath = "//i[@class='fa fa-bars']")
    private WebElement sideBar;

    @FindBy(linkText = "Logout")
    private WebElement logout;

    //Step 2 : These are Page Actions i.e. Kind of Behaviours or Instance Methods or Member Methods
    public boolean checkAllDetailsOnSummaryPage() {

        WaitHelpers.urlContains(driver, PropertiesReader.readKey("katalon_summaryURL"));

        String actualComment = getText(commentText);
        boolean isCommentMatching = actualComment.equals(PropertiesReader.readKey("katalon_comment"));

        if (isCommentMatching) {
            LOGGER.info("Summary Page verified. Comment matches expected value.");
        } else {
            LOGGER.error("Summary Page Failed: expected '{}', actual '{}'",
                    PropertiesReader.readKey("katalon_comment"), actualComment);
        }

        return isCommentMatching;

    }

    public void logout() {

        clickElement(sideBar);
        clickElement(logout);

        WaitHelpers.urlContains(driver, PropertiesReader.readKey("katalon_makeAppointmentURL"));
        LOGGER.info("Logged out successfully, returned to Make Appointment page.");

    }
}