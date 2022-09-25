package com.leaftaps.ui.pages;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewLeadPage extends ProjectSpecificMethods {
    public ViewLeadPage(RemoteWebDriver receivedDriver){
        this.driver=receivedDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "viewLead_companyName_sp")
    private WebElement elementLeadId;

    public ViewLeadPage getLeadID() {
        elementLeadId.getText();
        return this;

    }
}
