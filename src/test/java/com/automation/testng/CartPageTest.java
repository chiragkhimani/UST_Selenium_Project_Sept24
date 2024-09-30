package com.automation.testng;

import org.testng.annotations.*;

public class CartPageTest extends BaseTest {

    @Test(groups = "Smoke")
    public void verifyUserCanAddItemsToCart() {
        System.out.println("From Cart Page");
    }

    @Test(groups = "Regression")
    public void verifyUserCanRemoveItemsFromCart() {

    }

    @Test(groups = "Regression")
    public void verifyUserCanUpdateQuantityOfItemInCart() {

    }


}
