package com.automation.testng;

import org.testng.annotations.*;

public class OrderConfirmationTest extends BaseTest {

    @Test(groups = "Smoke")
    public void verifyUserCanPlaceOrder() {
        System.out.println("Test 1 From Order Confirmation");
    }

    @Test(groups = "Regression")
    public void verifyUserCanCancelOrder() {

    }
}
