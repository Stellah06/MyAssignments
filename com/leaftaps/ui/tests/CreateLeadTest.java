package com.leaftaps.ui.tests;

import com.leaftaps.ui.base.ProjectSpecificMethods;
import com.leaftaps.ui.pages.LoginPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLeadTest extends ProjectSpecificMethods {
    @BeforeTest
    public void getFileName() {
        excelFileName = "tc001";
    }

    @Test(dataProvider = "sendData")
    public void runCreateLead(String userName, String password, String cName, String fName, String lName) {
        new LoginPage(driver)
                .userName(userName)
                .password(password)
                .clickLogin_positive()
                .clickCRMSFA()
                .clickLeads()
                .clickCreateLeads()
                .enterCompanyName(cName)
                .enterFirstName(fName)
                .enterLastName(lName)
                .clickCreateLead()
                .getLeadID();

    }
}
