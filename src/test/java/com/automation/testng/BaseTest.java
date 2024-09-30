package com.automation.testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest(alwaysRun = true)
    public void setUp() {
        System.out.println("Before Test");
    }

    @AfterTest(alwaysRun = true)
    public void cleanUp() {
        System.out.println("After Test");
    }
}
