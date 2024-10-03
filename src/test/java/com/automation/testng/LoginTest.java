package com.automation.testng;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class LoginTest extends BaseTest {

    @Test(priority = 1)
    public void bverifyUserCanLogin() {
        System.out.println("Test Case 1");
    }

    @Test(priority = -1)
    public void averifyUserCanLogout() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("Test", "Test1");
        softAssert.assertTrue(10 == 11);
        softAssert.assertEquals(10, 20);
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void cverifyUserCannotLoginWithInvalidCred() {
        Assert.assertEquals(10, 10);
        Assert.assertTrue("Test".equals("Test1"), "Expected Test and Actual is Test1");
        Assert.fail("Just fail");
    }
}
