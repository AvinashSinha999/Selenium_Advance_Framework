package com.avinashsinha.pages.pageFactory.appVWO;

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
public class LoginPage_PF extends CommonToAllPage {

    private static final Logger LOGGER = LogManager.getLogger(LoginPage_PF.class);

    WebDriver driver;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    @FindBy(id = "login-username")
    private WebElement username;

    /*
        @FindAll annotation uses an "OR condition" requiring element to match any criteria

        @FindAll(
                {
                        @FindBy(how = How.ID, using = "login-username"),
                        @FindBy(name = "username")
                }
        )
        private WebElement username;
    */

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(id = "js-notification-box-msg")
    private WebElement errorMessage;

    //Step 2 : These are Page Actions i.e. Kind of Behaviours or Instance Methods or Member Methods
    public String loginToVWOLoginInvalidCreds() {

        openVWOUrl();

        WaitHelpers.visibilityOfElement(username);
        LOGGER.info("Login form loaded. Attempting login with invalid credentials.");

        enterInput(username, PropertiesReader.readKey("invalid_username"));
        enterInput(password, PropertiesReader.readKey("invalid_password"));
        clickElement(signButton);

        WaitHelpers.checkVisibilityOfAndTextToBePresentInElement(driver, errorMessage);

        String errorText = getText(errorMessage);
        LOGGER.info("Error message displayed: {}", errorText);

        return errorText;

    }

    public void loginToVWOLoginValidCreds() {

        openVWOUrl();

        WaitHelpers.visibilityOfElement(username);
        LOGGER.info("Login form loaded. Attempting login with valid credentials.");

        enterInput(username, PropertiesReader.readKey("username"));
        enterInput(password, PropertiesReader.readKey("password"));
        clickElement(signButton);

        LOGGER.info("Login submitted.");

    }

}