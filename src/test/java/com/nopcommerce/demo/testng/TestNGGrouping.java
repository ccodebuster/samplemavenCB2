package com.nopcommerce.demo.testng;

import org.testng.annotations.Test;

/**
 * Created by Bhavesh
 */
public class TestNGGrouping {

    @Test(groups = {"smoke"})
    public void loginTest1() {
        System.out.println("Running test - loginTest1");
    }

    @Test (groups = {"regression"})
    public void loginTest2() {
        System.out.println("Running test - loginTest2");
    }

    @Test (groups = {"sanity"})
    public void loginTest3() {
        System.out.println("Running test - loginTest3");
    }

    @Test
    public void loginTest4() {
        System.out.println("Running test - loginTest4");
    }

    @Test (groups = {"sanity"})
    public void regressionTest1() {
        System.out.println("Running test - regressionTest1");
    }

    @Test
    public void computerTest1() {
        System.out.println("Running test - computerTest1");
    }

    @Test (groups = {"smoke"})
    public void computerTest2() {
        System.out.println("Running test - computerTest2");
    }
}
