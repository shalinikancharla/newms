package org.testex.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class xpathmethods {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://tutorialsninja.com/demo");
        driver.findElement(By.xpath("//a[contains(@href,'contact')]")).click();
        //driver.findElement(By.xpath("//a[contains(@href,'account/account')]")).click();

        Select drop=new Select(driver.findElement(By.xpath("//a[@ title='My Account']")));
        drop.selectByIndex(0);
        drop.selectByIndex(1);
     //   select.getOptions();
       /* List<WebElement> options=select1.getOptions();
        for(WebElement e: options)
            System.out.println(e.getText());*/


    }
}
