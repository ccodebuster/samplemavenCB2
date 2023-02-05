package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {

    HomePage homePage= new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void doLogin(String username, String password){

        homePage.clickOnLoginLink();
        loginPage.loginToApplication(username,password);

    }

}
