package com.automation.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeGroups(groups = {"Smoke","Regression"})
    public void setUp() {
        System.out.println("Before Group");
    }

    @AfterGroups(groups = "Smoke")
    public void cleanUp() {
        System.out.println("After Group");
    }
}
