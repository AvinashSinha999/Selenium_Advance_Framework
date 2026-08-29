package com.avinashsinha.pages.pageFactory.orangeHRM;

import com.avinashsinha.base.CommonToAllPage;
import com.avinashsinha.utils.WaitHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//This is Page Class
public class EmployeeListHomePage_PF extends CommonToAllPage {

    private static final Logger LOGGER = LogManager.getLogger(EmployeeListHomePage_PF.class);

    WebDriver driver;

    public EmployeeListHomePage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    @FindBy(xpath = "//h6[normalize-space()='Dashboard']")
    private WebElement userNameOnDashboard;

    //Step 2 : These are Page Actions i.e. Kind of Behaviors or Instance Methods or Member Methods
    public String loggedInUserName() {

        WaitHelpers.visibilityOfElement(driver, userNameOnDashboard);
        String titleText = getText(userNameOnDashboard);
        LOGGER.info("Dashboard Page Title: {}", titleText);

        return titleText;

    }

}