package com.automation.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DemoClass  {


    public static void main(String[] args) throws AWTException {
        WebDriver driver = new FirefoxDriver();
        driver.get("about:preferences#privacy");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(By.id("clearSiteDataButton")).click();
    }
}
