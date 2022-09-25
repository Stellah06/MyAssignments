package com.leaftaps.ui.pages;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends ProjectSpecificMethods {
    public HomePage(RemoteWebDriver receivedDriver){
        this.driver=receivedDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how= How.LINK_TEXT, using="Leads")
    private WebElement elementLeads;

    public LeadsPage clickLeads() {
        elementLeads.click();
        return new LeadsPage(driver);

    }
}
