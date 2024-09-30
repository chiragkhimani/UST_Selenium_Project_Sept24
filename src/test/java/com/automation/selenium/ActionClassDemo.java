package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement electronicsLink = driver.findElement(By.xpath("//li/a[text()='Electronics']"));
        WebElement appleLink = driver.findElement(By.xpath("//ul/li/a[text()='Apple']"));

        Actions action = new Actions(driver);
        action.moveToElement(electronicsLink).pause(2000).click(appleLink).build().perform();

        WebElement signInLink = driver.findElement(By.xpath("//span[@id='gh-ug']//a[text()='Sign in']"));
        action.keyDown(Keys.CONTROL).click(signInLink).keyUp(Keys.CONTROL).build().perform();

    }
}
