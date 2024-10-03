package com.automation.testng;

import org.testng.annotations.Test;

public class ParallelExecution {
    @Test(priority = 1)
    public void testMethod1() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Method 1");
    }

    @Test(priority = 2)
    public void testMethod2() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Method 2");
    }

    @Test(priority = 3)
    public void testMethod3() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Method 3");
    }
}
