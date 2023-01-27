package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

/**
 * Created by Bhavesh
 */
public class LoginPageTestWithDataProvider extends TestBase {


    @Test(dataProvider = "credentials", dataProviderClass = TestData.class)
    public void doLogin(String username, String password, String error){

    }

}
