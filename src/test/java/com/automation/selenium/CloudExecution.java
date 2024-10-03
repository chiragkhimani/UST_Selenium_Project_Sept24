package com.automation.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CloudExecution {
    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 11");
        browserOptions.setBrowserVersion("latest");

        Map<String, Object> sauceOptions = new HashMap<>();
        sauceOptions.put("username", "oauth-seleniumtraining2015-b8f84");
        sauceOptions.put("accessKey", "65ef8758-12d0-45d5-b726-7b1491d31871");
        sauceOptions.put("build", "selenium-build-RB86H");
        sauceOptions.put("name", "My First Test on Cloud");

        browserOptions.setCapability("sauce:options", sauceOptions);

        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, browserOptions);

        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        WebElement searchBtn = driver.findElement(By.id("gh-btn"));

        searchBox.sendKeys("TV");
        searchBtn.click();


        WebElement link = driver.findElement(By.xpath("//ul[contains(@class,'srp-results')]//div[@class='s-item__title']"));
        link.click();

        String currentWindow = driver.getWindowHandle();
        System.out.println(currentWindow);

        Set<String> allWindow = driver.getWindowHandles();

        for(String window : allWindow){
            if(!window.equals(currentWindow)){
                driver.switchTo().window(window);
            }
        }

        WebElement title = driver.findElement(By.xpath("//h1[@class='x-item-title__mainTitle']/span"));
        System.out.println(title.getText());

        WebElement price = driver.findElement(By.xpath("//div[@class='x-price-primary']/span"));
        System.out.println(price.getText());

        driver.close();
        driver.switchTo().window(currentWindow);
    }
}
