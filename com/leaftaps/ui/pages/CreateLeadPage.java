package com.leaftaps.ui.pages;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage extends ProjectSpecificMethods {
    public CreateLeadPage(RemoteWebDriver receivedDriver){
        this.driver=receivedDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(how = How.ID, using = "createLeadForm_companyName")
    private WebElement elementCName;

    @FindBy(how = How.ID, using = "createLeadForm_firstName")
    private WebElement elementFName;

    @FindBy(how = How.ID, using = "createLeadForm_lastName")
    private WebElement elementLName;

    @FindBy(how = How.NAME, using = "submitButton")
    private WebElement elementCreateLead;


    public CreateLeadPage enterCompanyName(String cName) {
        elementCName.sendKeys(cName);
        return this;

    }
    public CreateLeadPage enterFirstName(String fName) {
        elementFName.sendKeys(fName);
        return this;
    }
    public CreateLeadPage enterLastName(String lName) {
       elementLName.sendKeys(lName);
        return this;
    }
    public ViewLeadPage clickCreateLead() {
        elementCreateLead.click();
        return new ViewLeadPage(driver);
    }


}
