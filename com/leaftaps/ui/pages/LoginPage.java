package com.leaftaps.ui.pages;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ProjectSpecificMethods {
    public LoginPage(RemoteWebDriver receivedDriver){
        this.driver=receivedDriver;
        PageFactory.initElements(driver,this);
    }

    @FindBy (how = How.ID, using = "username")
    private WebElement eUserName;

    @FindBy (how = How.ID, using = "password")
    private WebElement ePassword;

    @CacheLookup
    @FindBy (how = How.CLASS_NAME, using = "decorativeSubmit")
    private WebElement eLogin;

    public LoginPage userName(String userName) {
        eUserName.sendKeys(userName);
        return this;
    }
    public LoginPage password(String password){
       ePassword.sendKeys(password);
        return this;
    }
    public WelcomePage clickLogin_positive(){
        eLogin.click();
        return new WelcomePage(driver);
    }
    public LoginPage clickLogin_negative(){
        eLogin.click();
        return this;
    }
}
