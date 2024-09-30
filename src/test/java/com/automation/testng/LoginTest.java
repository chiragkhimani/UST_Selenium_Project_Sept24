package com.automation.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void bverifyUserCanLogin() {
        System.out.println("Test Case 1");
    }

    @Test(priority = -1)
    public void averifyUserCanLogout() {
        System.out.println("Test Case 2");
    }

    @Test(priority = 2)
    public void cverifyUserCannotLoginWithInvalidCred() {
        System.out.println("Test Case 3");
    }
}
