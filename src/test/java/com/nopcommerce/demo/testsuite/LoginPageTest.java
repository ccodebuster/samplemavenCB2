package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class LoginPageTest extends TestBase {
    HomePage homepage = new HomePage();
    LoginPage loginPage=new LoginPage();

    @Test (groups = "sanity")
    public void verifyUserShouldNavigateToLoginPage() {
        homepage.clickOnLoginLink();
        String actualMessage=loginPage.getWelcomeText();
        String expedctedMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualMessage,expedctedMessage,"Login page verified");


    }

    @Test (groups = "smoke")
    public void verifyErrorMessageWithInvalidCredentials() {
        homepage.clickOnLoginLink();
        loginPage.enterEmailId("bhav123@gmail.com");
        loginPage.enterPassword("12345");
        loginPage.clickOnLoginButton();
        String actual=loginPage.getErrorMessage();
        String expected= "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertEquals(actual,expected,"error message with inavalid credentials");
    }

}
