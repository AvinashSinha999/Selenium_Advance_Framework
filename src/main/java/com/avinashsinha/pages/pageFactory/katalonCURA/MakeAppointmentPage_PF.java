package com.avinashsinha.pages.pageFactory.katalonCURA;

import com.avinashsinha.base.CommonToAllPage;
import com.avinashsinha.utils.WaitHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//This is Page Class
public class MakeAppointmentPage_PF extends CommonToAllPage {

    private static final Logger LOGGER = LogManager.getLogger(MakeAppointmentPage_PF.class);

    WebDriver driver;

    public MakeAppointmentPage_PF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    @FindBy(id = "btn-make-appointment")
    private WebElement makeAppointment;

    //Step 2 : These are Page Actions i.e. Kind of Behaviors or Instance Methods or Member Methods
    public void clickToMakeAppointmentBtn() {

        openKatalonCURAUrl();

        WaitHelpers.visibilityOfElement(makeAppointment);
        LOGGER.info("Katalon CURA homepage loaded. Clicking Make Appointment button.");

        clickElement(makeAppointment);

        LOGGER.info("Make Appointment button clicked.");

    }

}