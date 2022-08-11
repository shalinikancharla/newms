package org.testex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class deselectmethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.urbancompany.com/blog/company-updates/urbanclap-is-now-urban-company/");
       driver.findElement(By.xpath("//*[@id=\"content-container\"]")).click();
      driver.findElement(By.xpath("//a[contains(@href,'beauty')]")).click();

    }

}
