package com.automation.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {

    @Parameters({"username", "password"})
    @Test(groups = "Smoke")
    public void verifyUserCanPassParameters(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @Test(groups = "Smoke", dataProvider = "getInvalidData")
    public void verifyUserCanPerformDataDrivenTest(String username, String password) {
        System.out.println(username);
        System.out.println(password);
    }

    @DataProvider
    public Object[][] getInvalidData() {
        String[][] credentials = {
                {"admin", "admin123"},
                {"demo", "demo123"},
                {"hello", "hello123"},
                {"test", "test123"}
        };
        return credentials;
    }

}
