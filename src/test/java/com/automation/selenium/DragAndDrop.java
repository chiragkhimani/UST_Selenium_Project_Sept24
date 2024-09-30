package com.automation.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DragAndDrop {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.manage().deleteAllCookies();
        driver.get("chrome://settings/clearBrowserData");
        driver.findElement(By.id("clearBrowsingDataDialog")).getShadowRoot().findElement(By.id("clearButton")).click();
    }
}
