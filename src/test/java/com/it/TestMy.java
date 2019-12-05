package com.it;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestMy {

    @BeforeMethod
    public void setUpBeforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void tearDownAfterMethod() {
        System.out.println("AfterMethod");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("setUpClass");
    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("AfterClass");
    }
    @BeforeGroups
    public void setUpGroups() {
        System.out.println("setUpGroups");
    }

    @AfterGroups
    public void tearDownGroups() {
        System.out.println("AfterGroups");
    }
    @BeforeTest
    public void setUpTest() {
        System.out.println("setUpTest");
    }

    @AfterTest
    public void tearDownTest() {
        System.out.println("AfterTest");
    }
    @BeforeSuite
    public void setUpSuite() {
        System.out.println("setUpSuite");
    }

    @AfterSuite
    public void tearDownSuite() {
        System.out.println("AfterSuite");
    }

    @Test (priority = 3, description = "some description", dependsOnMethods = {"test2", "test3"}, alwaysRun = true)
    public void test1() {
        Assert.assertEquals(2+2, 4);
        System.out.println("1");
    }
    @Test (priority = 2)
    public void test2() {
        System.out.println("2");

    }
    @Test (priority = 1)
    public void test3() {
        System.out.println("3");

    }
}
