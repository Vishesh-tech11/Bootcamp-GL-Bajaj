package com.SeleniumEdgeBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        System.out.println("Title: " + driver.getTitle());

        driver.quit();
    }
}