package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    @Test
    public void searchGurjar() {

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.google.com");
            driver.manage().window().maximize();

            driver.findElement(By.name("q"))
                    .sendKeys("Gurjar");

            driver.findElement(By.name("q"))
                    .submit();

            Thread.sleep(3000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
