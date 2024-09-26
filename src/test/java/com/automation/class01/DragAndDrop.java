package com.automation.class01;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");

        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
        driver.switchTo().frame(iframe);

        List<WebElement> listOfImages = driver.findElements(By.xpath("//ul[@id='gallery']/li"));

        WebElement target = driver.findElement(By.id("trash"));
        Actions actions = new Actions(driver);

        for (WebElement image : listOfImages) {
            actions.dragAndDrop(image, target).pause(1000).build().perform();
        }

    }
}
