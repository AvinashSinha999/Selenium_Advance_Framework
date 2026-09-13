package com.avinashsinha.pages.pageObjectModel.katalonCURA;

import com.avinashsinha.base.CommonToAllPage;
import com.avinashsinha.utils.WaitHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//This is Page Class
public class MakeAppointmentPage extends CommonToAllPage {

    private static final Logger LOGGER = LogManager.getLogger(MakeAppointmentPage.class);

    WebDriver driver;

    public MakeAppointmentPage(WebDriver driver){
        this.driver=driver;
    }

    //Step 1 : These are Page Locators i.e. Kind of Attributes or Instance Variable or Member Variable
    private static final By MAKE_APPOINTMENT = By.id("btn-make-appointment");

    //Step 2 : These are Page Actions i.e. Kind of Behaviors or Instance Methods or Member Methods
    public void clickToMakeAppointmentBtn(){

        openKatalonCURAUrl();

        WaitHelpers.presenceOfElement(driver, MAKE_APPOINTMENT);
        LOGGER.info("Katalon CURA homepage loaded. Clicking Make Appointment button.");

        clickElement(MAKE_APPOINTMENT);

        LOGGER.info("Make Appointment button clicked.");

    }

}