package com.SeleniumWebdriver.Chromebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitaminsAndSupplement {

    public static void main(String[] args) throws Exception {

        WebDriver driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open Holland & Barrett
        driver.get("https://www.hollandandbarrett.com/");

        Thread.sleep(5000);

        // Click on Vitamins & Supplements
        driver.findElement(By.partialLinkText("Vitamins")).click();

        Thread.sleep(3000);

        // Print page information
        System.out.println("Title : " + driver.getTitle());
        System.out.println("URL : " + driver.getCurrentUrl());

        driver.quit();
    }
}