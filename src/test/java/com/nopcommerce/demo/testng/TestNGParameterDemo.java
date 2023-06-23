package com.nopcommerce.demo.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class TestNGParameterDemo {

    @Test  @Parameters({"name","surname"})
    public void test( String name, String surname){
        System.out.println("My name is : " + name);
        System.out.println("My surname is : " + surname);
    }
}
