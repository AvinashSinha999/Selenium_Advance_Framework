package com.avinashsinha.pages.pageFactory.orangeHRM;

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

    public LoginPage_PF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    @FindBy(xpath = "//input[@placeholder='Username']")
    private WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    private WebElement submitButton;

    //Step 2 : These are Page Actions i.e. Kind of Behaviors or Instance Methods or Member Methods
    public void loginToOrangeHRMCreds() {

        openOrangeHRMUrl();

        WaitHelpers.visibilityOfElement(username);
        LOGGER.info("Login form loaded. Entering credentials.");

        enterInput(username, PropertiesReader.readKey("ohr_username"));
        enterInput(password, PropertiesReader.readKey("ohr_password"));
        clickElement(submitButton);

        WaitHelpers.waitJVM(5000);

        LOGGER.info("Login submitted.");

    }

}