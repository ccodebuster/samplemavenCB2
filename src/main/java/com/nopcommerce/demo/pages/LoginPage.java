package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Bhavesh
 */
public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By emailfield = By.id("Email");
    By passwordField=By.name("Password");
    By loginButton = By.xpath("//button[contains(text(),'Log in')]");
    By errorMag = By.xpath("//div[@class='message-error validation-summary-errors']");

    public String getWelcomeText(){
         return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailfield,email);
    }

    public  void enterPassword(String Password){
        sendTextToElement(passwordField,Password);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMag);
    }


public void loginToApplication(String username, String password){
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();

}


}
