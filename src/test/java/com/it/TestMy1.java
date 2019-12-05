package com.it;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestMy1 {
    @DataProvider(name = "Name2")
    public static Object[][] Name() {
        return new Object[][]{{new Ipay1()}, {new Ipay2()}, {new Ipay3()}};
    }

    @Test(dataProvider="Name2")
    public void test1(Ipay pay) {
        System.out.println("get goods");
        pay.pay();
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {

    }
    @Test
    public void test3() {

    }
}
