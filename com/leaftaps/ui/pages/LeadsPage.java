package com.leaftaps.ui.pages;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage extends ProjectSpecificMethods {
    public LeadsPage(RemoteWebDriver receivedDriver){
        this.driver=receivedDriver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how= How.LINK_TEXT, using="Create Lead")
    private WebElement elementCreateLead;

    public CreateLeadPage clickCreateLeads() {
       elementCreateLead.click();
        return new CreateLeadPage(driver);
    }
}
