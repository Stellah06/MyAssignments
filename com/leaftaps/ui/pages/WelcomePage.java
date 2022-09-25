package com.leaftaps.ui.pages;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends ProjectSpecificMethods {
    public WelcomePage(RemoteWebDriver receivedDriver){
        this.driver=receivedDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.LINK_TEXT, using="CRM/SFA")
    private WebElement elementCRMSFA;

    public HomePage clickCRMSFA() {
        elementCRMSFA.click();
        return new HomePage(driver);

    }
    public void clickLogout() {
        //add if required

    }
}
