package org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathlocatorstextmethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo");
        driver.findElement(By.xpath("//i[@class='fa fa-shopping-cart']")).click();
        if(driver.findElement(By.xpath("//h1[text()='Shopping Cart']")).isDisplayed()) {
            System.out.println("shopping cart is displayed");
        }
        else
            System.out.println("shopping cartis not displayed");


    }
}
