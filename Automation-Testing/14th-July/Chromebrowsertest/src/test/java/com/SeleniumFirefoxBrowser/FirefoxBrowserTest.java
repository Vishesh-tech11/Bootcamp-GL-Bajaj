package com.SeleniumFirefoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("Page Title: " + driver.getTitle());

        System.out.println("Current URL: " + driver.getCurrentUrl());

        driver.quit();
    }
}